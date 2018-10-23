package com.example.dsymhove.gittraining

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sayPickaboo()
    }

    private fun sayPickaboo() {
        Log.d("MainActivity", "Pickaboo")
    }
}
