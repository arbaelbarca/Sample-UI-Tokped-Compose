package com.example.testcomposeapp.ui.model

import com.example.testcomposeapp.R

class ListTopMenuModel (
    val imgTopMenu:Int = 0,
    val titleTopMenu :String? = "",
    val descTopMenu :String? = "",
)

val listDummyTopMenu = listOf(
    ListTopMenuModel(R.drawable.gopay,"Gopay", "Bayar Gopaynya"),
    ListTopMenuModel(R.drawable.plus,"Cicilan", "Bayar Gopaynya"),
    ListTopMenuModel(R.drawable.rewards,"Reward", "Bayar Gopaynya"),
)