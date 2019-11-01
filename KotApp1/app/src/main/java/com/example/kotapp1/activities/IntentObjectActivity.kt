package com.example.kotapp1.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.print.PrintAttributes
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.marginLeft
import androidx.core.view.marginRight
import com.example.kotapp1.R
import com.example.kotapp1.models.Student
import org.jetbrains.anko.*

class IntentObjectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_intent_object)

        val student = intent.getParcelableExtra<Student>("student")

        linearLayout {
            orientation = LinearLayout.VERTICAL

            val name = textView().lparams(width = matchParent, height = wrapContent){
                horizontalMargin = dip(15)
                verticalMargin = dip(5)
            }

            val lastName = textView().lparams(width = matchParent, height = wrapContent){
                horizontalMargin = dip(15)
                verticalMargin = dip(5)
            }

            val age = textView().lparams(width = matchParent, height = wrapContent){
                horizontalMargin = dip(15)
                verticalMargin = dip(5)
            }

            val isDeveloper = checkBox(){ text = "Is Developer" }.lparams(width = matchParent, height = wrapContent){
                horizontalMargin = dip(15)
                verticalMargin = dip(5)
            }

            student.let{
                name.text = student.name
                lastName.text = student.lastName
                age.text = student.age.toString()
                isDeveloper.isChecked = student.isDeveloper
            }
        }


    }
}
