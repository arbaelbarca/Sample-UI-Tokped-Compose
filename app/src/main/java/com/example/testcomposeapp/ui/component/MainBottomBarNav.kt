package com.example.testcomposeapp.ui.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.testcomposeapp.R
import com.example.testcomposeapp.ui.model.BottomBarNavItem


@Composable
fun MainBottomBarNav() {
    NavigationBar(
        containerColor = Color.White,
        contentColor = Color.Green
    ) {
        val bottomNavBarList = listOf(
            BottomBarNavItem(
                "Home",
                Icons.Default.Home
            ),
            BottomBarNavItem(
                "Shooping",
                Icons.Default.ShoppingCart
            ),
            BottomBarNavItem(
                "Notification",
                Icons.Default.Notifications
            ),
            BottomBarNavItem(
                "Profile",
                Icons.Default.Person
            ),
        )

        bottomNavBarList.map {
            NavigationBarItem(selected = it.titleNav == bottomNavBarList[0].titleNav,
                onClick = { /*TODO*/ },
                icon = { Icon(imageVector = it.imgNav, contentDescription = it.titleNav) },
                label = { Text(text = it.titleNav.toString()) })
        }
    }
}

@Composable
fun MainBottomBarNavPreview() {
    MainBottomBarNav()
}