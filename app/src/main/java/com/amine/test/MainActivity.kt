package com.amine.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.txt)
        val button = findViewById<Button>(R.id.btn)

        button.setOnClickListener {
            textView.text = "You are a developer"
        }
    }
}
