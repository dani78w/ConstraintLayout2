package com.gmail.danielarribas78w.proyecto1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var onCreate=0
    private var onStart=0
    private var onResume=0
    private var onPause=0
    private lateinit var textView:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.setText(onCreate)
        print("On create $onCreate")
    }

    override fun onStart() {
        super.onStart()
        print("On create $onStart")
    }

    override fun onResume() {
        super.onResume()
        print("On create $onResume")
    }

    override fun onPause() {
        super.onPause()
        print("On create $onPause")
    }
}