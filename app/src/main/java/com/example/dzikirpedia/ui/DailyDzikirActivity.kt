package com.example.dzikirpedia.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dzikirpedia.MainActivity
import com.example.dzikirpedia.Model.DzikirDoaModel
import com.example.dzikirpedia.R
import com.example.dzikirpedia.adapter.DzikirDoaAdapter
import com.example.dzikirpedia.databinding.ActivityDailyDzikirBinding

class DailyDzikirActivity : AppCompatActivity(),View.OnClickListener {

    lateinit var binding: ActivityDailyDzikirBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDailyDzikirBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            rvDzikirDoaHarian.layoutManager = LinearLayoutManager(this@DailyDzikirActivity)
            rvDzikirDoaHarian.adapter = DzikirDoaAdapter(setDataArtikel())
            tombolBack.setOnClickListener(this@DailyDzikirActivity)
        }
    }

    private fun setDataArtikel(): ArrayList<DzikirDoaModel> {
        val desc = resources.getStringArray(R.array.arr_dzikir_doa_harian)
        val lafaz = resources.getStringArray(R.array.arr_lafaz_dzikir_doa_harian)
        val terjemah = resources.getStringArray(R.array.arr_terjemah_dzikir_doa_harian)

        val list = ArrayList<DzikirDoaModel>()

        for (i in desc.indices){
            val dzikirDoaHarian = DzikirDoaModel(
                desc[i],
                lafaz[i],
                terjemah[i]
            )
            list.addAll(listOf(dzikirDoaHarian))
        }
        return list
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tombol_back -> {
                val intentDDS = Intent(this@DailyDzikirActivity, MainActivity::class.java)
                startActivity(intentDDS)
            }
        }
    }

}
