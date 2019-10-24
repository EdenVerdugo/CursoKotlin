package com.example.kotapp1.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.kotapp1.R
import kotlinx.android.synthetic.main.activity_extension_functions.*

class ExtensionFunctionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extension_functions)

        val btnById = findViewById<Button>(R.id.buttonById)
        btnById.setOnClickListener { Toast.makeText(this, "click by id", Toast.LENGTH_SHORT).show() }

        buttonByKAT.setOnClickListener { Toast.makeText(this,  "click by kat", Toast.LENGTH_SHORT).show() }
    }
}
