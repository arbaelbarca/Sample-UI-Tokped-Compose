package com.example.testcomposeapp.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testcomposeapp.ui.model.ListTopCategoryModel
import com.example.testcomposeapp.ui.model.listDummyTopCateogry
import com.example.testcomposeapp.ui.model.listDummyTopCateogrySecond

@Composable
fun MainTopCategorySecond(listTopCategoryModel: ListTopCategoryModel) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(7.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier.size(30.dp),
            painter = painterResource(id = listTopCategoryModel.imgTopCateogry),
            contentDescription = null
        )
        Spacer(modifier = Modifier.padding(5.dp))
        Text(
            text = listTopCategoryModel.titleTopCateogry.toString(),
            fontSize = 13.sp,
        )

    }
}

@Preview(showBackground = true)
@Composable
fun MainTopCategorySecondPreview() {
    LazyRow(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth()
    ) {
        items(listDummyTopCateogrySecond) {
            MainTopCategorySecond(listTopCategoryModel = it)
        }
    }
}