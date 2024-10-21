package com.example.testcomposeapp.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testcomposeapp.ui.model.ListBannerVertikal
import com.example.testcomposeapp.ui.model.listDummyImageBannerVertikal

@Composable
fun MainBannerVertikal(listBannerVertikal: ListBannerVertikal) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Card(
                modifier = Modifier.padding(7.dp),
                shape = RoundedCornerShape(6.dp)
            ) {
                Image(
                    painter = painterResource(id = listBannerVertikal.imageBanner),
                    contentDescription = null
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainBannerVertikalPreview() {
    LazyRow(
        modifier = Modifier.padding(5.dp)
    ) {
        items(listDummyImageBannerVertikal) {
            MainBannerVertikal(listBannerVertikal = it)
        }
    }
}