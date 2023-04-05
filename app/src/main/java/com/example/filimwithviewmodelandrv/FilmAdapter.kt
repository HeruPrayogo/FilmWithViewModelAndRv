package com.example.filimwithviewmodelandrv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FilmAdapter(var dataFilm: ArrayList<DataFilm>):RecyclerView.Adapter<FilmAdapter.ViewHolder>() {
    class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
        var poster = view.findViewById<ImageView>(R.id.poster)
        var judul = view.findViewById<TextView>(R.id.judul)
        var tanggal = view.findViewById<TextView>(R.id.tanggal)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.data_film,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: FilmAdapter.ViewHolder, position: Int) {
        var data = dataFilm[position]
        holder.poster.setImageResource(dataFilm[position].poto)
        holder.judul.text = data.judul
        holder.tanggal.text = data.tanggal
    }

    override fun getItemCount(): Int {
        return dataFilm.size
    }
    fun setFilmData(dataFilm: ArrayList<DataFilm>)
    {
        this.dataFilm=dataFilm
//        notifyDataSetChanged()
    }
}