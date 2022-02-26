package com.example.mvvmexample.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://hn.algolia.com/api/v1/search_by_date?query=mobile")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}