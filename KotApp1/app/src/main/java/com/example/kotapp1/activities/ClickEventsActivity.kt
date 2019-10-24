package com.example.kotapp1.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.kotapp1.R
import com.google.android.material.snackbar.Snackbar

class ClickEventsActivity : AppCompatActivity(), View.OnLongClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_click_events)

        inLineClick()

        val btn1 = findViewById<Button>(R.id.buttonMultiClick1)
        val btn2 = findViewById<Button>(R.id.buttonMultiClick2)
        val btn3 = findViewById<Button>(R.id.buttonMultiClick3)

        btn1.setOnLongClickListener(this)
        btn2.setOnLongClickListener(this)
        btn3.setOnLongClickListener(this)
    }

    // regla obligatoria para clicks en xmls
    // el metódo tiene que ser publico, nombres tienen que coincidir y recibe un solo parametro(View)

    fun xmlClick(view: View){
        Toast.makeText(this, "Evento lanzado desde el xml", Toast.LENGTH_SHORT).show()
    }

    private fun inLineClick(){
        val btn = findViewById<Button>(R.id.buttonClickInLine)
        btn.setOnClickListener { Toast.makeText(this, "Evento lanzado in line", Toast.LENGTH_SHORT).show() }
    }

    override fun onLongClick(v: View): Boolean {
        when(v.id){
            R.id.buttonMultiClick1 -> Toast.makeText(this, "Evento lanzado en click multi 1", Toast.LENGTH_SHORT).show()
            R.id.buttonMultiClick2 -> Toast.makeText(this, "Evento lanzado in click multi 2", Toast.LENGTH_SHORT).show()
            R.id.buttonMultiClick3 -> Toast.makeText(this, "Evento lanzado in click multi 3", Toast.LENGTH_SHORT).show()
        }

        return true
    }
}
