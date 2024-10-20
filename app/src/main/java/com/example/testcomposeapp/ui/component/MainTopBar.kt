package com.example.testcomposeapp.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun MainTopBar() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Row(
            modifier = Modifier
                .width(IntrinsicSize.Min)
                .padding(5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            OutlinedTextField(
                modifier = Modifier
                    .widthIn(230.dp)
                    .heightIn(20.dp),
                value = "",
                onValueChange = {},
                leadingIcon = {
                    Icon(
                        modifier = Modifier.size(20.dp),
                        imageVector = Icons.Outlined.Search,
                        contentDescription = null
                    )
                },
                placeholder = {
                    Text(
                        fontSize = 15.sp,
                        text = "Searching ajaa..."
                    )
                }
            )
            Icon(
                modifier = Modifier.size(24.dp),
                imageVector = Icons.Outlined.Email,
                contentDescription = null
            )
            Icon(
                modifier = Modifier.size(24.dp),
                imageVector = Icons.Outlined.ShoppingCart,
                contentDescription = null
            )
            Icon(
                modifier = Modifier.size(24.dp),
                imageVector = Icons.Outlined.Notifications,
                contentDescription = null
            )
            Icon(
                modifier = Modifier.size(24.dp),
                imageVector = Icons.Outlined.Menu,
                contentDescription = null
            )
        }

        Spacer(modifier = Modifier.size(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Icon(
                modifier = Modifier.size(20.dp),
                imageVector = Icons.Outlined.LocationOn,
                contentDescription = null
            )
            Text(text = "Dikirim alamat Arba Elbarca")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainTopBarPreview() {
    MainTopBar()
}