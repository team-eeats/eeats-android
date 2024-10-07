package com.teameeats.eeats.theme.component.textfield

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.teameeats.eeats.R
import com.teameeats.eeats.theme.EeatsColor
import com.teameeats.eeats.theme.EeatsTypography
import com.teameeats.eeats.theme.component.button.EeatsIconButton
import com.teameeats.eeats.theme.component.text.EeatsText

@Composable
fun EeatsTextField(
    modifier: Modifier = Modifier,
    value: () -> String,
    onValueChange: (String) -> Unit,
    initialText: String? = null,
    title: String? = null,
    singleLine: Boolean,
    hint: String,
    imeAction: ImeAction,
    keyboardType: KeyboardType,
    maxLength: Int,
    showVisibleIcon: Boolean,
) {
    val hintAlpha by animateFloatAsState(
        targetValue = if (value().isEmpty()) {
            1f
        } else {
            0f
        },
        label = "",
    )
    var visible by remember { mutableStateOf(false) }
    val (visualTransformation, icon) = if (visible || !showVisibleIcon) {
        VisualTransformation.None to R.drawable.ic_eye
    } else {
        PasswordVisualTransformation() to R.drawable.ic_eye_off
    }
    val text = remember { mutableStateOf(initialText ?: value()) }

    Column(
        modifier = Modifier.fillMaxWidth(),
    ) {
        title?.let {
            EeatsText(
                text = it,
                color = EeatsColor.black,
                style = EeatsTypography.label2
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Surface(
            modifier = modifier.fillMaxWidth().defaultMinSize(minHeight = 40.dp),
            shape = RoundedCornerShape(12.dp),
        ) {
            BasicTextField(
                value = text.value.take(maxLength),
                onValueChange = {
                    text.value = it
                    onValueChange(it)
                },
                modifier = Modifier
                    .background(color = EeatsColor.gray0)
                    .padding(horizontal = 12.dp),
                visualTransformation = visualTransformation,
                textStyle = EeatsTypography.caption3,
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = keyboardType,
                    imeAction = imeAction,
                ),
                cursorBrush = SolidColor(EeatsColor.main200),
            )
            { innerTextField ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Box(
                        modifier = Modifier.weight(1f),
                        contentAlignment = Alignment.CenterStart,
                    ) {
                        innerTextField()
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            EeatsText(
                                modifier = Modifier.alpha(hintAlpha),
                                color = EeatsColor.gray300,
                                text = hint,
                                style = EeatsTypography.caption3,
                            )
                        }
                    }
                    if (showVisibleIcon) {
                        EeatsIconButton(
                            modifier = modifier.size(20.dp),
                            drawableResId = icon,
                            contentDescription = "show password",
                            color = EeatsColor.gray700,
                            onClick = { visible = !visible }
                        )
                    }
                }
            }
        }
    }
}

