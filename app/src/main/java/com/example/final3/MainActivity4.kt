package com.example.final3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main6.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        back.setOnClickListener {
            val i = Intent(this, MainActivity3::class.java)
            startActivity(i)
        }
        var a = ""

        RadioGroup1.setOnCheckedChangeListener { group, i ->
            if (radioButton3.isChecked) {
                a = "ถูกต้อง"
            } else {
                a = "ไม่ถูกต้อง"

            }
            Submit.setOnClickListener {
                if (a == "") {
                    Toast.makeText(this@MainActivity4, "กรุณาเลือกคำตอบ", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                if (radioButton3.isChecked) {
                    val i = Intent(this, MainActivity5::class.java)
                    startActivity(i)
                    Toast.makeText(this@MainActivity4, "ถูกต้อง", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                } else {
                    Toast.makeText(this@MainActivity4, "ไม่ถูกต้อง", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

            }

        }
    }
}