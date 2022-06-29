package com.megahed.eqtarebmenalla.feature_data.data.remote.dto

data class Gregorian(
    val date: String="",
    val day: String="",
    val designation: Designation,
    val format: String="",
    val month: Month,
    val weekday: Weekday,
    val year: String=""
)