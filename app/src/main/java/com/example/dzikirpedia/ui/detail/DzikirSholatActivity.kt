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
import com.example.dzikirpedia.databinding.ActivityDzikirSholatBinding
import com.example.dzikirpedia.ui.DailyDzikirActivity
import com.example.dzikirpedia.ui.DzikirForEverytimeActivity

class DzikirSholatActivity : AppCompatActivity(),View.OnClickListener {

    lateinit var binding: ActivityDzikirSholatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirSholatBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {
            rvDzikirSholat.layoutManager = LinearLayoutManager(this@DzikirSholatActivity)
            rvDzikirSholat.adapter = DzikirDoaAdapter(DzikirDoaList.listQauliyah)
            tombolBack.setOnClickListener(this@DzikirSholatActivity)
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tombol_back -> {
                val intentDDS = Intent(this@DzikirSholatActivity, MainActivity::class.java)
                startActivity(intentDDS)
            }
        }
    }
}