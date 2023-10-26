package com.example.dzikirpedia.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dzikirpedia.MainActivity
import com.example.dzikirpedia.Model.DzikirDoaList
import com.example.dzikirpedia.R
import com.example.dzikirpedia.adapter.DzikirDoaAdapter
import com.example.dzikirpedia.databinding.ActivityDzikirForEverytimeBinding

class DzikirForEverytimeActivity : AppCompatActivity(),View.OnClickListener {

    lateinit var binding:ActivityDzikirForEverytimeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirForEverytimeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            rvDzikirSetiapSaat.layoutManager = LinearLayoutManager(this@DzikirForEverytimeActivity)
            rvDzikirSetiapSaat.adapter = DzikirDoaAdapter(DzikirDoaList.listDzikir)
            tombolBack.setOnClickListener(this@DzikirForEverytimeActivity)
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tombol_back -> {
                val intentDDS = Intent(this@DzikirForEverytimeActivity, MainActivity::class.java)
                startActivity(intentDDS)
            }
        }
    }
}