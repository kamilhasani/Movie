package com.example.moovi.Fragment.Movie

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.ParsedRequestListener
import com.example.moovi.POJO.Movie.ResponseMovie

class MovieViewModel : ViewModel() {
    private val responseDataMovie = MutableLiveData<ResponseMovie>()
    fun getResponseDataMovie(): LiveData<ResponseMovie> {
        return responseDataMovie
    }

    val dataMovie: Unit
        get() {
            AndroidNetworking.get("https://api.themoviedb.org/3/discover/movie?api_key=f9213f759c8716e1eecddb4c90ca4b86&language=en-US") // .addPathParameter("APIKEY", "")
                .setPriority(Priority.MEDIUM)
                .build()
                .getAsObject(ResponseMovie::class.java, object :
                    ParsedRequestListener<ResponseMovie> {
                    override fun onResponse(response: ResponseMovie) {
                        //
                        responseDataMovie.postValue(response)
                    }

                    override fun onError(anError: ANError) {
                        Log.e("Entahlah", anError.toString())
                    }
                })
        }
}
