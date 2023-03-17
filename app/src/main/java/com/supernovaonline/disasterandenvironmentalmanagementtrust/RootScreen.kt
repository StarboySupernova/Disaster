package com.supernovaonline.disasterandenvironmentalmanagementtrust

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.supernovaonline.disasterandenvironmentalmanagementtrust.home.HomeScreen
import com.supernovaonline.disasterandenvironmentalmanagementtrust.onboarding.OnBoardingScreen
import com.supernovaonline.disasterandenvironmentalmanagementtrust.stats.StatsScreen
import com.supernovaonline.disasterandenvironmentalmanagementtrust.ui.theme.DisasterAndEnvironmentalManagementTrustTheme

@Composable
fun RootScreen() {
    val navigationController = rememberNavController()
    var shouldShowOnboarding by rememberSaveable { mutableStateOf(true) }

    Scaffold(
        bottomBar = {
            // hiding bottom bar
            if (!shouldShowOnboarding) {
                BottomBar(navigationController)
            }
        }
    ) {  padding ->
        Column(
            modifier = Modifier
                .padding(padding)
        ) {
            NavHost(navController = navigationController, startDestination = if (shouldShowOnboarding) { NavigationItem.Login.route } else { NavigationItem.Home.route }) {
                composable(NavigationItem.Login.route) {
                    OnBoardingScreen()
                }

                composable(NavigationItem.Home.route) {
                    HomeScreen()
                }

                composable(NavigationItem.Stats.route) {
                    StatsScreen()
                }

                composable(NavigationItem.Add.route) {
                    Text("Add")
                }

                composable(NavigationItem.Search.route) {
                    Text("Search")
                }

                composable(NavigationItem.Profile.route) {
                    Text("Profile")
                }
            }
        }
    }
}

@Preview
@Composable
fun RootScreenPreview() {
    DisasterAndEnvironmentalManagementTrustTheme {
        RootScreen()
    }
}

sealed class NavigationItem(var route: String, var icon: ImageVector, var title: String) {
    object Login : NavigationItem("login", Icons.Filled.Home, "Home")
    object Home : NavigationItem("home", Icons.Filled.Home, "Home")
    object Stats : NavigationItem("stats", Icons.Filled.Analytics, "Stats")
    object Add : NavigationItem("add", Icons.Filled.Add, "Add")
    object Search : NavigationItem("search", Icons.Filled.Search, "Search")
    object Profile : NavigationItem("profile", Icons.Filled.Person, "Profile")
}

@Composable
fun BottomBar(navController: NavController) {
    val items = listOf(
        NavigationItem.Home,
        NavigationItem.Stats,
        NavigationItem.Add,
        NavigationItem.Search,
        NavigationItem.Profile
    )

    BottomNavigation(
        backgroundColor = Color(33, 17, 52),
        contentColor = Color.White
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        items.forEach { item ->
            BottomNavigationItem(
                icon = { Image(
                    imageVector = item.icon,
                    contentDescription = item.title,
                    modifier = Modifier.size(30.dp),
                    colorFilter = ColorFilter.tint(Color.White)
                )},
                selectedContentColor = Color.White,
                unselectedContentColor = Color.White.copy(0.4f),
                alwaysShowLabel = false,
                selected = currentRoute == item.route,
                onClick = {
                    navController.navigate(item.route) {
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }

                        launchSingleTop = true //preventing copying views whe user re-selects same tab
                        restoreState = true //preserving scroll state
                    }
                }
            )
        }
        }
    }
