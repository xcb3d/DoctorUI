package com.example.doctorui.presentation.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.doctorui.navigation.screen.BottomNavItemScreen
import com.example.doctorui.ui.theme.BluePrimary
import com.example.doctorui.ui.theme.poppinsFontFamily

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    var navigationSelectionItem by remember {
        mutableIntStateOf(0)
    }
    val bottomNavigationItems = listOf(
        BottomNavItemScreen.Home,
        BottomNavItemScreen.Schedule,
        BottomNavItemScreen.Chat,
        BottomNavItemScreen.Profile
    )
    val navController = rememberNavController()
    Scaffold(
        modifier = modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar(
                containerColor = androidx.compose.ui.graphics.Color.White,
                tonalElevation = 8.dp
            ) {
                bottomNavigationItems.forEachIndexed { index, item ->
                    NavigationBarItem(
                        colors = NavigationBarItemDefaults.colors(
                            selectedIconColor = BluePrimary,
                            selectedTextColor = BluePrimary,
                            unselectedIconColor = BluePrimary,
                            unselectedTextColor = BluePrimary
                        ),
                        selected = index == navigationSelectionItem,
                        icon = {
                            Icon(painter = painterResource(id = item.icon), contentDescription = "")
                        },
                        label = {
                            Text(
                                text = item.title,
                                fontFamily = poppinsFontFamily,
                                fontWeight = FontWeight.Medium,
                                color = Color(0xFF63B4FF)
                            )
                        },
                        alwaysShowLabel = index == navigationSelectionItem,
                        onClick = {
                            navigationSelectionItem = index
                            navController.navigate(item.route) {
                                popUpTo(navController.graph.startDestinationId) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        },

                        )
                }
            }
        }
    ) { paddingValues ->
        NavHost(
            modifier = Modifier.padding(paddingValues),
            navController = navController,
            startDestination = BottomNavItemScreen.Home.route
        ) {
            composable(route = BottomNavItemScreen.Home.route) {
                HomeScreen()
            }
            composable(route = BottomNavItemScreen.Schedule.route) {
                ScheduleScreen()
            }
            composable(route = BottomNavItemScreen.Chat.route) {

            }
            composable(route = BottomNavItemScreen.Profile.route) {

            }

        }

    }
}



