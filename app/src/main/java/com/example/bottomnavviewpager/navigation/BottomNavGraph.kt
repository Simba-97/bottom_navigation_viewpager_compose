package com.example.bottomnavviewpager.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.bottomnavviewpager.screens.HomeScreen
import com.example.bottomnavviewpager.screens.ProfileScreen
import com.example.bottomnavviewpager.screens.SettingsScreen
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun BottomNavGraph(
    pagerState: PagerState
) {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        HorizontalPager(
            state = pagerState
        ) { page ->
            when (page) {
                0 -> HomeScreen()
                1 -> ProfileScreen()
                2 -> SettingsScreen()
            }
        }
    }
}