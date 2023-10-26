package com.example.dzikirpedia

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import com.example.dzikirpedia.databinding.ActivityMainBinding
import com.example.dzikirpedia.ui.DailyDzikirActivity
import com.example.dzikirpedia.ui.DzikirForEverytimeActivity
import com.example.dzikirpedia.ui.detail.AfternoonDzikirActivity
import com.example.dzikirpedia.ui.detail.DzikirSholatActivity
import com.example.dzikirpedia.ui.detail.MorningDzikirActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),  View.OnClickListener{

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setView()
    }

    private fun setView() {
        binding.apply {
            cvDzikirDoaSholat.setOnClickListener(this@MainActivity)
            cvDzikirPagiPetang.setOnClickListener(this@MainActivity)
            cvDzikirSetiapSaat.setOnClickListener(this@MainActivity)
            cvDzikirDoaHarian.setOnClickListener(this@MainActivity)
        }
    }


    override fun onClick(v: View?) {
        when(v?.id){
            R.id.cv_dzikir_doa_sholat -> {
                val intentDDS = Intent(this@MainActivity, DzikirSholatActivity::class.java)
                startActivity(intentDDS)
            }
            R.id.cv_dzikir_pagi_petang -> {
                val cvDzikirPagiPetang = cv_dzikir_pagi_petang
                val popup = PopupMenu(this@MainActivity, cvDzikirPagiPetang)
                popup.inflate(R.menu.test)
                popup.setOnMenuItemClickListener { item ->
                    when (item.itemId) {
                        R.id.menu_item_pagi -> {
                            val intent =
                                Intent(this@MainActivity, MorningDzikirActivity::class.java)
                            startActivity(intent)
                            true
                        }
                        R.id.menu_item_petang -> {
                            val intent =
                                Intent(this@MainActivity, AfternoonDzikirActivity::class.java)
                            startActivity(intent)
                            true
                        }
                        else -> false
                    }
                }
                popup.show()

            }
            R.id.cv_dzikir_setiap_saat -> {
                val intentDSS = Intent(this@MainActivity, DzikirForEverytimeActivity::class.java)
                startActivity(intentDSS)
            }
            R.id.cv_dzikir_doa_harian -> {
                val intentDDH = Intent(this@MainActivity, DailyDzikirActivity::class.java)
                startActivity(intentDDH)
            }
            }
        }
    }
