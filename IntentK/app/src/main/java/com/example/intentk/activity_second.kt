package com.example.intentk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class activity_second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val txt2 = findViewById<TextView>(R.id.txt2)
        val received = intent.getStringExtra("sended")
        if (received?.isNotEmpty() == true)
            txt2.text = "Hello, $received"
    }

    fun goToFirst(view : View){
        var intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
        finish()  // first activityde geri basanda appdan cixir
    }
}