package com.practice.deeplink

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = intent
        if(data != null && data.data != null){

            Toast.makeText(this@MainActivity ,"""
                | Name from URI :: ${data.getStringExtra("name")}
                | Age from URI :: ${data.getIntExtra("age",0)}
            """.trimMargin(), Toast.LENGTH_SHORT).show()
        }
    }
}
