package com.example.testcomposeapp.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testcomposeapp.ui.model.ListBannerHome
import com.example.testcomposeapp.ui.model.listDummyBannerHome
import com.example.testcomposeapp.ui.model.listDummyTopCateogrySecond


@Composable
fun MainBannerHome(listBannerHome: ListBannerHome) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        horizontalArrangement = Arrangement.spacedBy(9.dp)
    ) {
        Card(

        ) {
            Image(
                painter = painterResource(id = listBannerHome.imgBannerHome),
                contentDescription = null
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun MainBannerHomePreview() {
    LazyRow(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth()
    ) {
        items(listDummyBannerHome) {
            MainBannerHome(it)
        }
    }
}