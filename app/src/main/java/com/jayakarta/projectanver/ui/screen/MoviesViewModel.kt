package com.jayakarta.projectanver.ui.screen

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jayakarta.projectanver.network.Movies.Movies
import com.jayakarta.projectanver.network.Movies.MoviesNetwork
import kotlinx.coroutines.launch

class MoviesViewModel : ViewModel() {
    val myResponseList: MutableLiveData<List<Movies>> = MutableLiveData()
    fun getMovies() {
        viewModelScope.launch {
            myResponseList.value  = MoviesNetwork.retrofit.getMovies().data
        }
    }
}

