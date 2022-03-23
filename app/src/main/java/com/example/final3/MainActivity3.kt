package com.example.final3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main6.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        back.setOnClickListener {
            val i = Intent(this, MainActivity2::class.java)
            startActivity(i)
        }
        var a = ""

        RadioGroup1.setOnCheckedChangeListener { group, i ->
            if (radioButton4.isChecked) {
                a = "ถูกต้อง"
            } else {
                a = "ไม่ถูกต้อง"

            }
            Submit.setOnClickListener {
                if (a == "") {
                    Toast.makeText(this@MainActivity3, "กรุณาเลือกคำตอบ", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                if (radioButton4.isChecked) {
                    val i = Intent(this, MainActivity4::class.java)
                    startActivity(i)
                    Toast.makeText(this@MainActivity3, "ถูกต้อง", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                } else {
                    Toast.makeText(this@MainActivity3, "ไม่ถูกต้อง", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

            }

        }
    }
}

