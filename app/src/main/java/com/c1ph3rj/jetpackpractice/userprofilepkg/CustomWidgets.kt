package com.c1ph3rj.jetpackpractice

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.c1ph3rj.jetpackpractice.ui.theme.normal_bold

@Composable
fun normal_text_view(textVal: String) {
    Text(
        text = textVal,
        style = normal_bold
    )
}