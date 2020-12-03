package com.example.test01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        radioGroup.setOnCheckedChangeListener{
            group, checkedId ->  textView.text = findViewById<RadioButton>(checkedId).text
        }

    }
    fun onButtonTapped(view:View?) {
        finish()
    }

}