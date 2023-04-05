package com.example.filimwithviewmodelandrv

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class setViewModel: ViewModel() {
    val listData = arrayListOf(
        DataFilm("Spider Man Far From Home","Film Tahun 2019", R.drawable.ffh),
        DataFilm("Jhon Wick 4","Film Tahun 2023", R.drawable.jw),
        DataFilm("Fast X","Film Tahun 2023", R.drawable.ff),
        DataFilm("Avatar: The Way Of Water","Film Tahun 2022", R.drawable.avatar),
        DataFilm("Avenger: Endgame","Film Tahun 2019", R.drawable.endgame)
    )
        val getDataFilm: MutableLiveData<List<DataFilm>> = MutableLiveData()
    fun getData(){
        getDataFilm.value = listData
    }
}