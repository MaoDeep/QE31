package com.example.final3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main6.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        back.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
        var a = ""

        RadioGroup1.setOnCheckedChangeListener { group, i ->
            if ((radioButton.isChecked) || (radioButton3.isChecked)) {
                a = "ถูกต้อง"
            } else {
                a = "ไม่ถูกต้อง"

            }
            Submit.setOnClickListener {
                if (a == "") {
                    Toast.makeText(this@MainActivity2, "กรุณาเลือกคำตอบ", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                if ((radioButton.isChecked) || (radioButton3.isChecked)) {
                    val i = Intent(this, MainActivity3::class.java)
                    startActivity(i)
                    Toast.makeText(this@MainActivity2, "ถูกต้อง", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                } else {
                    Toast.makeText(this@MainActivity2, "ไม่ถูกต้อง", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

            }

        }
    }
}

