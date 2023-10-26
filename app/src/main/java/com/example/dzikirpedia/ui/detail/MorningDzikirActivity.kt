package com.example.dzikirpedia.ui.detail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dzikirpedia.MainActivity
import com.example.dzikirpedia.Model.DzikirDoaList
import com.example.dzikirpedia.R
import com.example.dzikirpedia.adapter.DzikirDoaAdapter
import com.example.dzikirpedia.databinding.ActivityMorningDzikirBinding

class MorningDzikirActivity : AppCompatActivity(),View.OnClickListener {

    lateinit var binding: ActivityMorningDzikirBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMorningDzikirBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            rvDzikirPagi.layoutManager = LinearLayoutManager(this@MorningDzikirActivity)
            rvDzikirPagi.adapter = DzikirDoaAdapter(DzikirDoaList.listDzikirPagi)
            tombolBack.setOnClickListener(this@MorningDzikirActivity)
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tombol_back -> {
                val intentDDS = Intent(this@MorningDzikirActivity, MainActivity::class.java)
                startActivity(intentDDS)
            }
        }
    }
}