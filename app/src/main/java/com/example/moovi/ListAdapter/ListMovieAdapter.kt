package com.example.moovi.ListAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.moovi.R
import com.bumptech.glide.Glide


class ListMovieAdapter(private val itemMovie: List<com.example.moovi.POJO.Movie.ResultsItem?>) : RecyclerView.Adapter<ListMovieAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_data,parent,false)
        return ListViewHolder(v)
    }

    override fun getItemCount(): Int {
        return itemMovie.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val dataIndividuMovie= itemMovie[position]
        Glide.with(holder.itemView.context).load(dataIndividuMovie?.posterPath).into(holder.gambarMovie)

    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val gambarMovie: ImageView


        init {
            // pada layout item_data terdapat imageview dan textview
            gambarMovie = itemView.findViewById(R.id.gambarMovie)

        }
    }

}