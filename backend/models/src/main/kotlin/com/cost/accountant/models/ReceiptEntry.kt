package com.cost.accountant.models

data class ReceiptEntry(
    val name: String,
    val weight: Double?,
    val price: Double,
    val date: String
)
