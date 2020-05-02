package com.my.livedic

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class WordsItemAdapter(val data: MutableList<MutableList<String>>,val data2: MutableList<MutableList<String>>,val resourse:Int) : RecyclerView.Adapter<WordsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordsViewHolder {
        return WordsViewHolder(
            LayoutInflater.from(parent.context).inflate(resourse, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: WordsViewHolder, position: Int) {



        //todo show word 2
//        holder.itemView.setOnClickListener {
//            holder.itemView.findViewById<AppCompatTextView>(R.id.tv_word2).visibility = View.VISIBLE
//        }
        return holder.bind(data[position],data2[position], holder.adapterPosition)

    }
}