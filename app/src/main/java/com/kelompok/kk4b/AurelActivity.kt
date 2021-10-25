package com.kelompok.kk4b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class AurelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aurel)
        supportActionBar?.hide()
        val TextDarik: EditText = findViewById(R.id.TextSalsa1)
        val buttonProses : Button = findViewById(R.id.buttonProses)
        val keteranganbetul = "Aurel"
        val hasil: TextView = findViewById(R.id.hasil)
        buttonProses.setOnClickListener {
            if (TextDarik.length()==0){
                val  toast = Toast.makeText(this,"Masukan Nama", Toast.LENGTH_SHORT)
                toast.show()
            } else{
                val  jawaban = TextDarik.getText().toString()
                if (jawaban == keteranganbetul){
                    val toast = Toast.makeText(this,"10 Aurellia Nasywa RS XI RPL 3", Toast.LENGTH_SHORT)
                    toast.show()
                    val keterangan = "10 Aurellia Nasywa RS XI RPL 3"
                    hasil.setText(keterangan)
                }
                else{
                    val toast = Toast.makeText(this, "Nama Anggota Salah", Toast.LENGTH_SHORT)
                    toast.show()
                }
            }
        }
    }
}