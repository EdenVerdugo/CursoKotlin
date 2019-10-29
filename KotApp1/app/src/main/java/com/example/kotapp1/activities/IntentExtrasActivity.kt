package com.example.kotapp1.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotapp1.R
import kotlinx.android.synthetic.main.activity_intent_extras.*

class IntentExtrasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_extras)

        val name = intent.getStringExtra("name")
        val lastName = intent.getStringExtra("lastName")
        val age = intent.getIntExtra("age", -1)
        val isDeveloper = intent.getBooleanExtra("isDeveloper", false)

        if(name != null && lastName != null && age != -1){
            textViewName.text = name
            textViewLastName.text = lastName
            textViewAge.text = age.toString()
            checkBoxDeveloper.isChecked = isDeveloper
        }



        buttonGoBack.setOnClickListener { goBack() }

    }

    fun goBack(){
        val i = Intent(this, IntentsActivity::class.java)

        startActivity(i)

    }
}
