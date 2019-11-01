package com.example.kotapp1.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotapp1.R
import com.example.kotapp1.models.Student
import kotlinx.android.synthetic.main.activity_intents.*

class IntentsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intents)

        buttonIntentExtras.setOnClickListener { goToIntentExtras() }
        buttonInentFlags.setOnClickListener { goToIntentFlags() }
        buttonIntentObjects.setOnClickListener { goToIntentObjects() }
    }

    fun goToIntentExtras(){
        val i = Intent(this, IntentExtrasActivity::class.java)

        i.putExtra("name", "Eden Rodrigo")
        i.putExtra("lastName", "Verdugo Garcia")
        i.putExtra("age", 33)
        i.putExtra("isDeveloper", true)

        startActivity(i)
    }

    fun goToIntentFlags(){
        val i = Intent(this, IntentExtrasActivity::class.java)

        //i.flags = Intent.FLAG_ACTIVITY_NO_HISTORY //no guarda el activity en el stack
        //i.flags = Intent.FLAG_ACTIVITY_NO_ANIMATION // no animacion
        i.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK // borra el stack completo

        startActivity(i)

        //finish()
    }

    fun goToIntentObjects(){

        val student: Student = Student("Eden", "Verdugo", 33, true)
        val i = Intent(this, IntentObjectActivity::class.java)
        i.putExtra("student", student)

        startActivity(i)
    }
}
