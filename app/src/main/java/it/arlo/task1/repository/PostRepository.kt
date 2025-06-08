package it.arlo.task1.repository

import it.arlo.task1.network.ApiService
import javax.inject.Inject

class PostRepository @Inject constructor(private val apiService: ApiService) {
    suspend fun getPosts() = apiService.getPosts()
}