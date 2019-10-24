package com.example.kotapp1.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

open class LifeCycleEventsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show()

        Log.i("LifeCycleEvents", "OnCreate")
    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show()

        Log.i("LifeCycleEvents", "OnStart")
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show()

        Log.i("LifeCycleEvents", "OnResume")
    }

    override fun onPause() {
        super.onPause()

        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show()

        Log.i("LifeCycleEvents", "OnPause")
    }

    override fun onStop() {
        super.onStop()

        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show()

        Log.i("LifeCycleEvents", "OnStop")
    }

    override fun onRestart() {
        super.onRestart()

        Toast.makeText(this, "OnRestart", Toast.LENGTH_SHORT).show()

        Log.i("LifeCycleEvents", "OnRestart")
    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show()

        Log.i("LifeCycleEvents", "OnDestroy")
    }
}
