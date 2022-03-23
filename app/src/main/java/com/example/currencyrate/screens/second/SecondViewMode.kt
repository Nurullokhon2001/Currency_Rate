package com.example.currencyrate.screens.second

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.currencyrate.data.repository.Repository
import com.example.currencyrate.model.second.SecondModel
import com.example.currencyrate.model.start.StartModel
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewMode : ViewModel() {

    private val repo = Repository()

    private var _secondList: MutableLiveData<Response<SecondModel>> = MutableLiveData()
    var secondList: LiveData<Response<SecondModel>> = getSecondMoney()

    private fun getSecondMoney(): LiveData<Response<SecondModel>> {
        viewModelScope.launch {
            _secondList.value = repo.getSecondModel()
        }
        return _secondList
    }
}