package com.acme.robinhoodproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG = "TAG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: onCreate() is called here.")

        btn_thisButton.setOnClickListener {
            Toast.makeText(applicationContext,"button Clicked", Toast.LENGTH_SHORT).show()
            tv_textView.text = "Hello"
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: onStart() is called here.. ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: onResume() is called here.. ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: onPause() is called here.. ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: onStop() is called here..  ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: onDestroy() is called here.. ")
    }
}