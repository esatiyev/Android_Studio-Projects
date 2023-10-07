package com.example.radio_group

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var radioButton1 = findViewById<RadioButton>(R.id.radioButton1)
        var radioButton2 = findViewById<RadioButton>(R.id.radioButton2)
        var radioButton3 = findViewById<RadioButton>(R.id.radioButton3)
        var image1 = findViewById<ImageView>(R.id.imageView)
//        var res = findViewById<>(R.id)
//        @drawable/eng
//        button1.setOnCheckedChangeListener()

        radioButton1.setOnClickListener {
            if (radioButton1.isChecked) {
                image1.setImageResource(R.drawable.aze)
            }
        }

        radioButton2.setOnClickListener {
            if (radioButton2.isChecked) {
                image1.setImageResource(R.drawable.korean)
            }
        }

        radioButton3.setOnClickListener {
            if (radioButton3.isChecked) {
                image1.setImageResource(R.drawable.eng)
            }
        }



    }
}