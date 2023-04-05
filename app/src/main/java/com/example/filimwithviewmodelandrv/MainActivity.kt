package com.example.filimwithviewmodelandrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.filimwithviewmodelandrv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var setVM: setViewModel
    lateinit var filmAdapter: FilmAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setLayout()
        setVM = ViewModelProvider(this).get(setViewModel::class.java)
        setVM.getData()
        setVM.getDataFilm.observe(this, Observer {
            filmAdapter.setFilmData(it as ArrayList<DataFilm>)
        })
    }

    fun setLayout(){
        filmAdapter = FilmAdapter(ArrayList())
        binding.rcCon.layoutManager = GridLayoutManager(this, 2,GridLayoutManager.VERTICAL,false)
        binding.rcCon.adapter = filmAdapter

    }
}