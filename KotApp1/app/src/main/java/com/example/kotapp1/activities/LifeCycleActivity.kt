package com.example.kotapp1.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.example.kotapp1.R

class LifeCycleActivity : LifeCycleEventsActivity() {

    private  var exitEnabled = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle) 
    }

    override fun onBackPressed() {

        if(exitEnabled){
            super.onBackPressed()
        }

        exitEnabled = true

        Toast.makeText(this, "Dale click otra vez para salir de esta ventana", Toast.LENGTH_SHORT).show()

        Handler().postDelayed(Runnable { exitEnabled = false }, 2000)
    }
}
