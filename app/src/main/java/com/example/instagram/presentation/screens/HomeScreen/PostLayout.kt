package com.example.instagram.presentation.screens.HomeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.Comment
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Divider
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
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagram.R
import com.example.instagram.presentation.theme.Orange

@Composable
fun LazyPostColumn(){


    Column(modifier = Modifier.padding(top = 8.dp)) {
        Divider(thickness = 1.dp, color = Color.DarkGray)



        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,) {
Row(verticalAlignment = Alignment.CenterVertically) {
    Box(
    modifier = Modifier.padding(4.dp)
        .size(40.dp)
        .border(2.dp, color = Orange, shape = RoundedCornerShape(100.dp))
        .clip(RoundedCornerShape(100.dp))
){
    Image(
        painter = painterResource(id = R.drawable.demo),
        contentDescription = "Story Image"
    )
}

    Column(modifier = Modifier.padding(horizontal = 8.dp),
        verticalArrangement = Arrangement.Center) {
        Text(" subratTandon", fontWeight = FontWeight.Bold, fontSize = 11.sp)
        Row(verticalAlignment = Alignment.CenterVertically) { Icon(imageVector = Icons.Default.MusicNote, contentDescription = "Music",
            modifier = Modifier.size(15.dp),)
            Text("Hariharan, Clinton Verojo . Pachai Nirma", fontSize = 11.sp, overflow = TextOverflow.Ellipsis)
        }
    } }

               IconButton(onClick = {}) {
                   Icon(imageVector = Icons.Default.MoreVert,
                       contentDescription = "MoreVertical")
           }
        }

        Image(painter = painterResource(id = R.drawable.post),
            contentDescription = "This is the Post",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
                .height(380.dp))


        // Horizontal Dots
        //Buttons
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically) {
            Row { IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = "Like Button")
            }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Comment,
                        contentDescription = "Comment Button")
                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Send,
                        contentDescription = "Send Button")
                }
            }

            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.BookmarkBorder,
                    contentDescription = "Bookmark Button")
            }
        }
        //Likes by
        Text("Liked by sweet_girl_joo and others", fontSize = 11.sp, overflow = TextOverflow.Ellipsis)

        //Description
        Text("condestocareer Websites to find internship ... more", fontSize = 11.sp, overflow = TextOverflow.Ellipsis)

        //Time
        Text("8 hours ago", fontSize = 11.sp, overflow = TextOverflow.Ellipsis, color = Color.DarkGray)

    }
}
