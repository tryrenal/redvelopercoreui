package com.redveloper.redveloper_core_ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.redveloper.redveloper_core_ui.databinding.MainItemLayoutBinding

class MainAdapter: RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    private val items: MutableList<String> = mutableListOf()
    var listener: ((String) -> Unit)? = null

    fun setData(items: List<String>){
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        return ViewHolder(
            MainItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        holder.bind(items[position])
        holder.itemView.setOnClickListener {
            listener?.invoke(items[position])
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(private val binding: MainItemLayoutBinding): RecyclerView.ViewHolder(binding.root){

        fun bind(text: String){
            binding.tvTitle.text = text
        }
    }
}