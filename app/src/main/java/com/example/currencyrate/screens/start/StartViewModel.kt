package com.example.currencyrate.screens.start

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.currencyrate.data.repository.Repository
import com.example.currencyrate.model.start.StartModel
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel : ViewModel() {

    private val repo = Repository()

    private var _startList: MutableLiveData<Response<StartModel>> = MutableLiveData()
    var startList: LiveData<Response<StartModel>> = getStartMoney()

    private fun getStartMoney(): LiveData<Response<StartModel>> {
        viewModelScope.launch {
            _startList.value = repo.getStartModel()
        }
        return _startList
    }

}