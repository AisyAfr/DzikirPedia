package com.example.dzikirpedia.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dzikirpedia.Model.DzikirDoaList
import com.example.dzikirpedia.Model.DzikirDoaModel
import com.example.dzikirpedia.databinding.RowItemDzikirDoaBinding

class DzikirDoaAdapter (private val DzikirDoaList : ArrayList<DzikirDoaModel>) :
RecyclerView.Adapter<DzikirDoaAdapter.MyViewHolder>()
{
    class MyViewHolder(val binding: RowItemDzikirDoaBinding):
    RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val bindingDzikirDoa = RowItemDzikirDoaBinding.inflate(LayoutInflater.from(parent.context),
            parent,
        false)
        return MyViewHolder(bindingDzikirDoa)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val dataDzikirDoa = DzikirDoaList[position]

        holder.binding.apply {
            tvDesc.text = dataDzikirDoa.desc
            tvLafaz.text = dataDzikirDoa.lafaz
            tvTerjemah.text = dataDzikirDoa.terjemah
        }
    }

    override fun getItemCount(): Int = DzikirDoaList.size
}