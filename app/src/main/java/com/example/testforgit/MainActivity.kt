package com.example.testforgit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import timber.log.Timber


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button = findViewById(R.id.button)
        val eT: EditText = findViewById(R.id.editText)
        val cb: CheckBox = findViewById(R.id.checkBox)
        val tw: TextView = findViewById(R.id.textView)
        val pb:ProgressBar = findViewById(R.id.progressBar)


        btn.setOnClickListener {
            Timber.d(eT.text.toString())
            if(cb.isChecked) {
                pb.progress = pb.progress + 10
                tw.text = eT.text
            }
        }
    }
}