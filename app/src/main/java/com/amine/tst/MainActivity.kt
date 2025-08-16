package com.amine.tst;


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvNumber: TextView = findViewById(R.id.tvNumber)
        val btnPlus: Button = findViewById(R.id.btnPlus)
        val btnMinus: Button = findViewById(R.id.btnMinus)

        btnPlus.setOnClickListener {
            number++
            tvNumber.text = number.toString()
        }

        btnMinus.setOnClickListener {
            number--
            tvNumber.text = number.toString()
        }
    }
}