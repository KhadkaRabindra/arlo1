package it.arlo.task1.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import it.arlo.task1.model.Post
import it.arlo.task1.repository.PostRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PostViewModel @Inject constructor(private val repository: PostRepository) : ViewModel() {

    private val _posts = MutableLiveData<List<Post>>()
    val posts: LiveData<List<Post>> = _posts

    private val _loading = MutableLiveData<Boolean>()
    val loading: LiveData<Boolean> = _loading

    private val _error = MutableLiveData<String?>()
    val error: LiveData<String?> = _error

    fun fetchPosts() {
        _loading.value = true
        _error.value = null

        viewModelScope.launch {
            try {
                val result = repository.getPosts()
                _posts.value = result
            } catch (e: Exception) {
                _error.value = "Failed to load posts: ${e.message}"
            } finally {
                _loading.value = false
            }
        }
    }
}
