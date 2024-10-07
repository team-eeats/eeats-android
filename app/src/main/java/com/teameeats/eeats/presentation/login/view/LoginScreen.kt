package com.teameeats.eeats.presentation.login.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.teameeats.eeats.theme.EeatsColor
import com.teameeats.eeats.theme.EeatsTypography
import com.teameeats.eeats.theme.component.button.EeatsButton
import com.teameeats.eeats.theme.component.text.EeatsText
import com.teameeats.eeats.theme.component.textfield.EeatsTextField
import com.teameeats.eeats.utils.navigation.EeatsRoutes

@Composable
fun LoginScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
        .background(color = EeatsColor.white)
        .padding(horizontal = 24.dp)
    ) {
        Spacer(modifier = Modifier.height(60.dp))
        EeatsText(
            text = "로그인하고\neeats를 사용해보세요!",
            style = EeatsTypography.heading3,
            color = EeatsColor.black
        )
        Spacer(modifier = Modifier.height(12.dp))
        EeatsText(
            text = "스퀘어 계정으로 로그인 해주세요.",
            style = EeatsTypography.caption3,
            color = EeatsColor.gray400
        )
        Spacer(modifier = Modifier.height(40.dp))
        EeatsTextField(
            title = "아이디",
            value = { "" }, // viewModel에서 id를 가져오는 함수
            onValueChange = { }, // id 변경 처리
            initialText = null,
            singleLine = true,
            hint = "아이디를 입력하세요",
            imeAction = ImeAction.Next,
            keyboardType = KeyboardType.Text,
            maxLength = 20,
            showVisibleIcon = false,
        )
        Spacer(modifier = Modifier.height(28.dp))
        EeatsTextField(
            title = "비밀번호",
            value = { "" }, // viewModel에서 id를 가져오는 함수
            onValueChange = { }, // id 변경 처리
            initialText = null,
            singleLine = true,
            hint = "비밀번호를 입력하세요",
            imeAction = ImeAction.Done,
            keyboardType = KeyboardType.Text,
            maxLength = 20,
            showVisibleIcon = true,
        )
        Spacer(modifier = Modifier.weight(1f))
        EeatsButton(
            modifier = Modifier.fillMaxWidth().height(43.dp),
            color = EeatsColor.main500,
            enabled = true,
            keyboardInteractionEnabled = true,
            onClick = {
                navController.navigate(EeatsRoutes.Home.route) {
                    popUpTo(EeatsRoutes.Login.route)
                }
            },
            content = {
                Text(
                    text = "로그인하기",
                    style = EeatsTypography.button2,
                    color = EeatsColor.white
                )
            }
        )
        Spacer(modifier = Modifier.height(24.dp))
    }
}
