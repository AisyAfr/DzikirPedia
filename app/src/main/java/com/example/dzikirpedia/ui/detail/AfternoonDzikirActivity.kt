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
import com.example.dzikirpedia.databinding.ActivityAfternoonDzikirBinding

class AfternoonDzikirActivity : AppCompatActivity(),View.OnClickListener {

    lateinit var binding: ActivityAfternoonDzikirBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAfternoonDzikirBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            rvDzikirPetang.layoutManager = LinearLayoutManager(this@AfternoonDzikirActivity)
            rvDzikirPetang.adapter = DzikirDoaAdapter(DzikirDoaList.listDzikirPetang)
            tombolBack.setOnClickListener(this@AfternoonDzikirActivity)
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tombol_back -> {
                val intentDDS = Intent(this@AfternoonDzikirActivity, MainActivity::class.java)
                startActivity(intentDDS)
            }
        }
    }
}