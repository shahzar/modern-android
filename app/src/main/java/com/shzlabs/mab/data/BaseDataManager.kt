package com.shzlabs.mab.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import java.io.IOException

open class BaseDataManager {

    suspend fun <T> safeApiCall(apiCall: suspend () -> T) = withContext(Dispatchers.IO) {
        try {
            apiCall.invoke()
        } catch (throwable: Throwable) {
            when(throwable) {
                is IOException -> throw IOException("Network Error. Please check your internet.")
                is HttpException -> throw Exception("Error: ${throwable.message()}")
                else -> throw Exception("Some error occured")
            }
        }
    }

}