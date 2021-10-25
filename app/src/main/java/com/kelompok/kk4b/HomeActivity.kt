package com.kelompok.kk4b

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.core.content.ContextCompat.startActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()
        val ftodarik = findViewById<ImageView>(R.id.darik)
        val ftoangger = findViewById<ImageView>(R.id.angger)
        val ftosalsa = findViewById<ImageView>(R.id.salsa)
        val ftoaurel = findViewById<ImageView>(R.id.aurel)

        ftoaurel.setOnClickListener{
            val intentAurel = Intent(this, AurelActivity::class.java)
            startActivity(intentAurel)
        }
        ftosalsa.setOnClickListener{
            val intentSalsa = Intent(this, SalsaActivity::class.java)
            startActivity(intentSalsa)
        }

         ftodarik.setOnClickListener{
             val intentdarik = Intent(this, DarikActivity::class.java)
             startActivity(intentdarik)
         }
        ftoangger.setOnClickListener{
            val intentAngger = Intent(this, AnggerActivity::class.java)
            startActivity(intentAngger)
        }
    }
}