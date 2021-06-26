package com.shzlabs.mab.data

import com.shzlabs.mab.data.repository.ApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class DataManager @Inject constructor(val remoteDataSrc: ApiService): BaseDataManager() {

    suspend fun getSampleData() = safeApiCall {
        remoteDataSrc.getSampleData()
    }
}