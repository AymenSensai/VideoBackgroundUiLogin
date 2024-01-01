package com.aymen.videobackgrounduilogin

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.aymen.videobackgrounduilogin.ui.theme.VideoBackgroundUiLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VideoBackgroundUiLoginTheme {
                LoginScreen(getVideoUri())
            }
        }

    }

    private fun getVideoUri(): Uri {
        val videoUri = "android.resource://$packageName/raw/video"
        return Uri.parse(videoUri)
    }

}

