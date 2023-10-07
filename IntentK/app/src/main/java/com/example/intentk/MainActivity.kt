package com.example.intentk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun goToSecond(view: View){
        val txt1 = findViewById<TextView>(R.id.txt1)
        val txtToSend1 = findViewById<EditText>(R.id.txtToSend1)
        val intent = Intent(applicationContext, activity_second::class.java)
        intent.putExtra("sended", txtToSend1.text.toString())
        startActivity(intent)
    }

}