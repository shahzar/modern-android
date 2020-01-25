package com.shzlabs.mab.data.repository

import com.shzlabs.mab.data.model.SampleDataModel
import retrofit2.http.GET

interface ApiService {

    @GET("todos/1")
    suspend fun getSampleData(): SampleDataModel

}