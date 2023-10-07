package com.example.splash_screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var kocovalilar = findViewById<RadioButton>(R.id.kocovalilar)
        var karakuzular = findViewById<RadioButton>(R.id.karakuzular)

        kocovalilar.setOnClickListener{
            if (kocovalilar.isChecked){
                val text = "< Kardeşiz Canız Tekiz >"
                var toast = Toast.makeText(this, text, Toast.LENGTH_LONG)
                toast.show()
            }
        }
        karakuzular.setOnClickListener{
            if (karakuzular.isChecked){
                val text = "Hoşgeldin, Benim Babam Hıı Hıı"
                var toast = Toast.makeText(this, text, Toast.LENGTH_LONG)
                toast.show()
            }
        }


//        fun clickKocovalilar(){
//            val text = "< Kardeşiz Canız Tekiz >"
//            var toast = Toast.makeText(this, text, Toast.LENGTH_LONG)
//            toast.show()
//        }
//        fun clickKarakuzular(){
//            val text = "Hoşgeldin, Benim Babam Hıı Hıı"
//            var toast = Toast.makeText(this, text, Toast.LENGTH_LONG)
//            toast.show()
//        }
    }

}