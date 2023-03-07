package com.example.testforgit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText



class MainActivity : AppCompatActivity() {
    private val tag: String = "TAG"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button = findViewById(R.id.button)
        val eT: EditText = findViewById(R.id.editText)

        btn.setOnClickListener {
            Log.d(tag,eT.text.toString())
        }
    }
}