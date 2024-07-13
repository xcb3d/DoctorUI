package com.example.doctorui.navigation.screen

import com.example.doctorui.R

sealed class BottomNavItemScreen(val route: String, val title: String, val icon: Int) {
    data object Home : BottomNavItemScreen("home_screen", "Home", R.drawable.ic_bottom_home)
    data object Schedule : BottomNavItemScreen("schedule_scree", "Schedule", R.drawable.ic_bottom_schedule)
    data object Chat : BottomNavItemScreen("chat_screen", "Chat", R.drawable.ic_bottom_chat)
    data object Profile : BottomNavItemScreen("profile_screen", "Profile", R.drawable.ic_bottom_profile)
}