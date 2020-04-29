package com.example.task04a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        //Create a new ViewOne object
        val myMainView = ViewOne(this)
        //set ContentView(R.layout.activity_main)

        setContentView(myMainView)
    }
}
