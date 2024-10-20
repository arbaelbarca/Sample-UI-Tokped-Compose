package com.example.testcomposeapp.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testcomposeapp.ui.model.ListTopMenuModel
import com.example.testcomposeapp.ui.model.listDummyTopMenu

@Composable
fun MainTopMenu(listTopMenuModel: ListTopMenuModel) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(6.dp)
            .height(IntrinsicSize.Max),
        horizontalArrangement = Arrangement.spacedBy(7.dp)
    ) {
        Image(
            modifier = Modifier.size(30.dp),
            painter = painterResource(id = listTopMenuModel.imgTopMenu),
            contentDescription = null
        )
        Column {
            Text(
                text = listTopMenuModel.titleTopMenu.toString(),
                fontSize = 13.sp,
            )
            Spacer(modifier = Modifier.padding(1.dp))
            Text(
                text = listTopMenuModel.descTopMenu.toString(),
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold
            )

        }
        Divider(
            modifier = Modifier
                .width(1.dp)
                .height(20.dp)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun MainTopMenuPreview() {
    LazyRow(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth()
    ) {
        items(listDummyTopMenu) {
            MainTopMenu(listTopMenuModel = it)
        }
    }
}