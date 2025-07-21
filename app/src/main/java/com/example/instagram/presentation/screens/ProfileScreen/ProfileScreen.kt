package com.example.instagram.presentation.screens.ProfileScreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddBox
import androidx.compose.material.icons.filled.AlternateEmail
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagram.R
import com.example.instagram.presentation.components.ButtonHandle

@Composable
fun ProfileScreen() {

    Column(modifier = Modifier.fillMaxSize(),) {
//TopRow
        TopRow()


        //ProfileRow
        ProfileRow()
        Text("Do Good and Forget \uD83C\uDFAF")

        //ButtonRow


        //HighLightsRow


        //MyPostGrid
    }
}


@Composable
fun ProfileRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Profile Image
        Box(
            modifier = Modifier
                .size(90.dp)
                .border(2.dp, Color.Gray, shape = CircleShape)
                .clip(CircleShape)
        ) {
            Image(
                painter = painterResource(id = R.drawable.demo),
                contentDescription = "Profile Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }

        Spacer(modifier = Modifier.width(16.dp)) // Space between image and text

        // Name + Stats Section
        Column(
            modifier = Modifier.weight(1f), // Takes remaining space
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Subrat Tandon",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                StatItem(number = "16", label = "Posts")
                StatItem(number = "733", label = "Followers")
                StatItem(number = "694", label = "Following")
            }
        }
    }
}

@Composable
fun StatItem(number: String, label: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = number, fontWeight = FontWeight.Bold)
        Text(text = label, fontSize = 12.sp, color = Color.Gray)
    }
}

@Composable
fun TopRow(){
    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween){
        Row (verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center){
            Icon(imageVector = Icons.Default.Lock,
                contentDescription = "Private/ Lock Indicator")

            Text("subrat.tandon", fontSize = 18.sp, fontWeight = FontWeight.Bold)
            ButtonHandle(onClicked = {},
                preIcon = Icons.Default.KeyboardArrowDown,
                postIcon = Icons.Default.KeyboardArrowUp,
                description = "Arrow")
            Box(modifier = Modifier.clip(shape = RoundedCornerShape(100.dp))
                .size(10.dp)
                .background(Color.Red))
        }

        Row {
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.AlternateEmail,
                    contentDescription = "Thread")
            }
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.AddBox,
                    contentDescription = "Post")
            }
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.Menu,
                    contentDescription = "Thread")
            }
        }

    }



}
