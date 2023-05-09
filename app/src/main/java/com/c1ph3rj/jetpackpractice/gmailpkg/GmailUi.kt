package com.c1ph3rj.jetpackpractice.gmailpkg

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.c1ph3rj.jetpackpractice.gmailpkg.model.DrawerMenuData
import com.c1ph3rj.jetpackpractice.ui.theme.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun GmailAppUi() {
    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    val scrollState = rememberScrollState()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { HomeAppBar(scaffoldState, coroutineScope, scrollState) },
        drawerContent = {
            GmailDrawerMenu(scrollState)
        },
    ) {
        it
    }
}

@Composable
fun HomeAppBar(
    scaffoldState: ScaffoldState,
    coroutineScope: CoroutineScope,
    scrollState: ScrollState
) {
    var searchValue by remember {
        mutableStateOf("")
    }
    Column(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.padding(15.dp)) {
            Card(
                shape = RoundedCornerShape(6.dp), elevation = 5.dp, modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
                    .requiredHeight(50.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier.padding(10.dp, 0.dp)
                ) {
                    IconButton(onClick = {
                        coroutineScope.launch {
                            scaffoldState.drawerState.open()
                        }
                    }) {
                        Icon(
                            imageVector = Icons.Outlined.Menu,
                            contentDescription = "app bar",
                            modifier = Modifier
                                .height(30.dp)
                                .width(30.dp)
                        )
                    }
                    BasicTextField(
                        value = searchValue,
                        onValueChange = { searchValue = it },
                        singleLine = true,
                        modifier = Modifier
                            .weight(1f)
                            .padding(10.dp, 15.dp),
                        textStyle = normal,
                        decorationBox = { innerTextField ->
                            Box() {
                                if (searchValue.isEmpty()) {
                                    Text(
                                        "Search in emails",
                                        style = TextStyle(
                                            fontSize = 16.sp,
                                            fontFamily = poppins_medium,
                                            color = Color(android.graphics.Color.LTGRAY)
                                        )
                                    )
                                }
                                innerTextField()
                            }
                        }
                    )
                    AsyncImage(
                        model = "https://cdn.pixabay.com/photo/2017/05/20/14/57/lion-2329097_1280.jpg",
                        contentDescription = "Some Random Flowers",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(35.dp)
                            .width(35.dp)
                            .clip(CircleShape),
                    )
                }
            }
        }
    }
}

@Composable
fun GmailDrawerMenu(scrollState: ScrollState) {
    val menuList = listOf(
        DrawerMenuData.Divider,
        DrawerMenuData.AllInbox,
        DrawerMenuData.Divider,
        DrawerMenuData.Primary,
        DrawerMenuData.Social,
        DrawerMenuData.Promotion,
        DrawerMenuData.AllLabels,
        DrawerMenuData.Stared,
        DrawerMenuData.Snoozed,
        DrawerMenuData.Important,
        DrawerMenuData.Sent,
        DrawerMenuData.Scheduled,
        DrawerMenuData.OutBox,
        DrawerMenuData.Draft,
        DrawerMenuData.GoogleApps,
        DrawerMenuData.Calender,
        DrawerMenuData.Contacts,
        DrawerMenuData.Divider,
        DrawerMenuData.Settings,
        DrawerMenuData.HelpAndFeedBack
    )
    Column (modifier = Modifier.verticalScroll(scrollState)) {
        Text(
            text = "Gmail", style = TextStyle(
                fontFamily = poppins_extra_bold,
                fontSize = 32.sp,
                color = Color.Black,
            ), modifier = Modifier.padding(15.dp)
        )
        menuList.forEach{
            item ->
            MenuDrawerItem(item = item)
        }
    }
}

@Composable
fun MenuDrawerItem(item: DrawerMenuData){
    Box(modifier = Modifier
        .fillMaxWidth()){
        if(item.isDivider){
            Box(modifier = Modifier.padding(10.dp)){
                Box(modifier = Modifier
                    .height(1.5.dp)
                    .background(Color.LightGray)
                    .fillMaxWidth())
            }
        }else if(item.isHeader && (item.title != null)){
            Box(modifier = Modifier.padding(10.dp)){
                Text(text = item.title, style = normal_bold_22, modifier = Modifier.padding(10.dp))
            }
        }else{
            if(item.title != null && item.icon != null){
                Row (modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                verticalAlignment = Alignment.CenterVertically) {
                    Box(modifier = Modifier.padding(10.dp)){
                        Icon(imageVector = item.icon, contentDescription = "Menu Icon", modifier = Modifier
                            .height(25.dp)
                            .width(25.dp))
                    }
                    Text(text = item.title , style = normal, modifier = Modifier.weight(1f)
                        .padding(0.dp, 5.dp, 0.dp, 0.dp))
                }
            }
        }
    }
}