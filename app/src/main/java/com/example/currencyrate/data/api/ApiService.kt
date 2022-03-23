package com.example.currencyrate.data.api

import com.example.currencyrate.model.second.SecondModel
import com.example.currencyrate.model.second.SecondModelItem
import com.example.currencyrate.model.start.StartModel
import com.example.currencyrate.model.start.StartModelItem
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getStartModel(): Response<StartModel>

    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getSecondModel(): Response<SecondModel>
}