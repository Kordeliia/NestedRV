package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemChildSongBinding

class ChildSongAdapter: ListAdapter<Song, RecyclerView.ViewHolder>(SongDiffCallback()) {

    private lateinit var context : Context
    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val binding = ItemChildSongBinding.bind(view)
    }
    class SongDiffCallback: DiffUtil.ItemCallback<Song>() {
        override fun areItemsTheSame(oldItem: Song, newItem: Song) = oldItem.name == newItem.name
        override fun areContentsTheSame(oldItem: Song, newItem: Song) = oldItem == newItem


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        context = parent.context
        val view = LayoutInflater.from(context).inflate(R.layout.item_child_song, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val song = getItem(position)
        with(holder as ViewHolder){
            binding.tvChildName.text = song.name
            binding.containerView.setCardBackgroundColor(ContextCompat.getColor(context, song.color))
        }
    }

}