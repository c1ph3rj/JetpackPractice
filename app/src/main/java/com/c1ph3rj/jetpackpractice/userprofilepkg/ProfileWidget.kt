package com.c1ph3rj.jetpackpractice.userprofilepkg

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.c1ph3rj.jetpackpractice.R
import com.c1ph3rj.jetpackpractice.normal_text_view
import com.c1ph3rj.jetpackpractice.ui.theme.*

@Composable
fun UserProfile() {
    Column(modifier = Modifier
        .padding(20.dp)
        .fillMaxHeight()
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
        Card(
            shape = RoundedCornerShape(6),
            elevation = 10.dp,
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(15.dp)
            ) {
                Card(
                    shape = RoundedCornerShape(180.dp),
                    elevation = 10.dp,
                    modifier = Modifier
                        .height(150.dp)
                        .width(150.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.image_test),
                        contentDescription = "Profile Image",
                        contentScale = ContentScale.Crop
                    )
                }
                Box(modifier = Modifier.size(10.dp))
                Text(
                    text = "Jeevaprakash G", style = TextStyle(
                        fontFamily = poppins_bold,
                        fontSize = 30.sp
                    )
                )
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        normal_text_view(textVal = "10")
                        normal_text_view(textVal = "Posts")
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        normal_text_view(textVal = "200")
                        normal_text_view(textVal = "Followers")
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        normal_text_view(textVal = "120")
                        normal_text_view(textVal = "Following")
                    }
                }
                Box(modifier = Modifier.size(10.dp))
                Column(
                    verticalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(backgroundColor = customBlue),
                        shape = RoundedCornerShape(10.dp, 10.dp, 4.dp, 4.dp)
                    ) {
                        Text(
                            text = "Follow",
                            style = normal_bold_white
                        )
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(backgroundColor = customBlue),
                        shape = RoundedCornerShape(4.dp, 4.dp, 10.dp, 10.dp)
                    ) {
                        Text(
                            text = "Direct",
                            style = normal_bold_white
                        )
                    }
                }
            }
        }
    }
}