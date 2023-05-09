package com.c1ph3rj.jetpackpractice.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.c1ph3rj.jetpackpractice.R

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)
val poppins_bold = FontFamily(Font(R.font.poppins_bold))
val poppins_extra_bold = FontFamily(Font(R.font.poppins_extra_bold))
val poppins_semi_bold = FontFamily(Font(R.font.poppins_semi_bold))
val poppins_medium = FontFamily(Font(R.font.poppins_medium))
val poppins_regular = FontFamily(Font(R.font.poppins_regular))
val poppins_light = FontFamily(Font(R.font.poppins_light))

val normal_bold_white = TextStyle(
    fontFamily = poppins_bold,
    fontSize = 18.sp,
    color = Color.White
)
val normal_bold = TextStyle(
    fontFamily = poppins_bold,
    fontSize = 18.sp
)

val normal_bold_22 = TextStyle(
    fontFamily = poppins_bold,
    fontSize = 22.sp
)

val normal = TextStyle(
    fontFamily = poppins_semi_bold,
    fontSize = 16.sp
)
