package com.example.bottomnavviewpager.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val title: String,
    val icon: ImageVector,
    val description: String,
    val page: Int
) {
    object Home : BottomBarScreen(
        title = "Home",
        icon = Icons.Default.Home,
        description = "Home description",
        page = 0
    )

    object Profile : BottomBarScreen(
        title = "Profile",
        icon = Icons.Default.Person,
        description = "Profile description",
        page = 1
    )

    object Settings : BottomBarScreen(
        title = "Settings",
        icon = Icons.Default.Settings,
        description = "Settings description",
        page = 2
    )
}