package com.example.instagram.presentation.components

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.vector.ImageVector


@Composable
fun ButtonHandle(
    onClicked: () -> Unit,
    preIcon: ImageVector,
    postIcon: ImageVector,
    description: String
) {
    var handler by remember { mutableStateOf(false) }

    IconButton(onClick = {
        handler = !handler
        onClicked()
    }) {
        Icon(
            imageVector = if (handler) postIcon else preIcon,
            contentDescription = description
        )
    }
}
