package com.megahed.eqtarebmenalla.feature_data.domain.repository

import com.megahed.eqtarebmenalla.feature_data.data.remote.dto.prayerApi.IslamicInfo

interface IslamicRepository {

    suspend fun getAzanData(city:String,country:String): IslamicInfo
}