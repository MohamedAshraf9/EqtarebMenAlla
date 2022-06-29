package com.megahed.eqtarebmenalla.feature_data.domain.use_cases

import com.megahed.eqtarebmenalla.common.Resource
import com.megahed.eqtarebmenalla.feature_data.data.remote.dto.IslamicInfo
import com.megahed.eqtarebmenalla.feature_data.domain.repository.IslamicRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetIslamicDataUsesCase @Inject constructor(
    private val repository: IslamicRepository
){

    //todo change AzanInfoDto to AzanInfo
    operator fun invoke(city:String,country:String):Flow<Resource<IslamicInfo>> = flow {

        try {

            emit(Resource.Loading())
            val azanData=repository.getAzanData(city,country)
            emit(Resource.Success(azanData))

        }
        catch (e:HttpException){
            emit(Resource.Error(e.localizedMessage?:"error"))
        }
        catch (e:IOException){
            emit(Resource.Error(e.message?:"error"))
        }

    }

}