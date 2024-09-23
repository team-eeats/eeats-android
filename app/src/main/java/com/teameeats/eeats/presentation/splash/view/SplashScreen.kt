package com.teameeats.eeats.presentation.splash.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.teameeats.eeats.R
import com.teameeats.eeats.theme.EeatsColor
import com.teameeats.eeats.utils.navigation.EeatsRoutes
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize().background(EeatsColor.white)) {
        Image(
            modifier = Modifier.align(Alignment.Center).size(width = 220.dp, height = 100.dp),
            painter = painterResource(R.drawable.eeats_splash_logo),
            contentDescription = "eeats splash"
        )
    }
    LaunchedEffect(Unit) {
        delay(1500)
        navController.navigate(EeatsRoutes.Login.route)
    }
}
