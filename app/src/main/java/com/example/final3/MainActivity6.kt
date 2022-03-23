package com.example.final3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main6.*

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        back.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
        Toast.makeText(this@MainActivity6, "ตอบคำถามครบทุกข้อแล้ว", Toast.LENGTH_SHORT).show()
        return

    }
}
