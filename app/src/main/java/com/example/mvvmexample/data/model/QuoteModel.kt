package com.example.mvvmexample.data.model

import com.google.gson.annotations.SerializedName

data class QuoteModel(
    @SerializedName("story_title") val story_title: String,
    @SerializedName("author") val author: String,
    @SerializedName("created_at") val created_at: String
)