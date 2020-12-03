package com.example.test01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onButtonTapped2(view: View?){
        val intent = Intent(this,MainActivity3::class.java)

        intent.putExtra("name","ラーメン")

        startActivity(intent)
    }

    fun onButtonTapped(view: View?){
        val intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }

    fun onButtonTapped3(view: View?){
        val intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }
}