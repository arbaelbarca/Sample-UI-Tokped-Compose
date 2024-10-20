package com.example.testcomposeapp.ui.model

import com.example.testcomposeapp.R

class ListTopCategoryModel(
    val imgTopCateogry: Int = 0,
    val titleTopCateogry: String? = ""
)

val listDummyTopCateogry = listOf(
    ListTopCategoryModel(R.drawable.cicil, "Cicil"),
    ListTopCategoryModel(R.drawable.cod, "COD"),
    ListTopCategoryModel(R.drawable.computer, "Computer"),
    ListTopCategoryModel(R.drawable.promo, "Promo"),
    ListTopCategoryModel(R.drawable.official, "Official"),
    ListTopCategoryModel(R.drawable.paylater, "Paylater"),
)

val listDummyTopCateogrySecond = listOf(
    ListTopCategoryModel(R.drawable.play, "Goto Play"),
    ListTopCategoryModel(R.drawable.show, "Semua Menu"),
    ListTopCategoryModel(R.drawable.topup, "Topup"),
    ListTopCategoryModel(R.drawable.travel, "Traveling"),
    ListTopCategoryModel(R.drawable.official, "Official"),
    ListTopCategoryModel(R.drawable.paylater, "Paylater"),
)