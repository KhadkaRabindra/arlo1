package it.arlo.task1.model

import com.google.gson.annotations.SerializedName

data class Post(
    @field:SerializedName("userId")
    val userId: Int,
    @field:SerializedName("id")
    val id: Int,
    @field:SerializedName("title")
    val title: String,
    @field:SerializedName("body")
    val body: String
)