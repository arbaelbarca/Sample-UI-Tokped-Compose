package com.example.testcomposeapp.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testcomposeapp.ui.model.ListCategoryHorizontal
import com.example.testcomposeapp.ui.model.listDummyCatHorizontal

@Composable
fun MainTopCategoryHorizontal(listCategoryHorizontal: ListCategoryHorizontal) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(6.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Card() {
                Image(
                    modifier = Modifier
                        .width(IntrinsicSize.Max),
                    painter = painterResource(id = listCategoryHorizontal.imgCatHorizontal),
                    contentDescription = null
                )
            }
        }
        Spacer(modifier = Modifier.padding(10.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Card() {
                Image(
                    modifier = Modifier
                        .width(IntrinsicSize.Max),
                    painter = painterResource(id = listCategoryHorizontal.imgCatHorizontal),
                    contentDescription = null
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainTopCategoryHorizontalPreview() {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        items(listDummyCatHorizontal) {
            MainTopCategoryHorizontal(listCategoryHorizontal = it)
        }
    }
}