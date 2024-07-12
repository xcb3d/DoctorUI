package com.example.doctorui.navigation.screen

import com.example.doctorui.R

sealed class BottomNavItemScreen(val route: String, val title: String, val icon: Int) {
    object Home : BottomNavItemScreen("home_screen", "Home", R.drawable.ic_bottom_home)
    object Schedule : BottomNavItemScreen("schedule_scree", "Schedule", R.drawable.ic_bottom_schedule)
    object Chat : BottomNavItemScreen("chat_screen", "Chat", R.drawable.ic_bottom_chat)
    object Profile : BottomNavItemScreen("profile_screen", "Profile", R.drawable.ic_bottom_profile)
}