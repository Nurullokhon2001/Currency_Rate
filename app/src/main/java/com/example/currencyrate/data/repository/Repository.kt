package com.example.currencyrate.data.repository

import com.example.currencyrate.data.api.RetrofitInstance
import com.example.currencyrate.model.second.SecondModel
import com.example.currencyrate.model.second.SecondModelItem
import com.example.currencyrate.model.start.StartModel
import com.example.currencyrate.model.start.StartModelItem
import retrofit2.Response

class Repository {

    suspend fun getStartModel(): Response<StartModel> {
        return RetrofitInstance.api.getStartModel()
    }

    suspend fun getSecondModel(): Response<SecondModel> {
        return RetrofitInstance.api.getSecondModel()
    }

}