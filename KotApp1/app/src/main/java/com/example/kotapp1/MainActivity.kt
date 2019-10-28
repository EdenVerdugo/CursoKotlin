package com.example.kotapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.kotapp1.activities.*
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLifeCycle = findViewById<Button>(R.id.lifeCycleButton)
        btnLifeCycle.setOnClickListener { goToLifeCycleActivity() }

        clickButton.setOnClickListener { goToClickEventsActivity() }

        extensionsButton.setOnClickListener { startActivity(Intent(this, ExtensionFunctionsActivity::class.java)) }

        picassoButton.setOnClickListener{ startActivity(Intent(this, PicassoActivity::class.java)) }

        listViewButton.setOnClickListener{ startActivity(Intent(this, ListViewActivity::class.java)) }

    }

    fun goToLifeCycleActivity() = startActivity(Intent(this, LifeCycleActivity::class.java))

    fun goToClickEventsActivity(){
        startActivity(Intent(this, ClickEventsActivity::class.java))
    }
}
