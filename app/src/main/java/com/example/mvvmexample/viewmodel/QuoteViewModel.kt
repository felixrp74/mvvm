package com.example.mvvmexample.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmexample.data.model.QuoteModel
import com.example.mvvmexample.data.model.QuoteProvider
import com.example.mvvmexample.domain.GetQuotesUseCase
import kotlinx.coroutines.launch

class QuoteViewModel:ViewModel() {
    val quoteModel = MutableLiveData<QuoteModel>()

    var getQuotesUseCase = GetQuotesUseCase()

    fun onCreate(){
        viewModelScope.launch {
            val result = getQuotesUseCase()
            if(!result.isNullOrEmpty()){
                quoteModel.postValue(result[0])
            }
        }
    }

    fun randomQuote() {
        /*val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)*/
    }
}