package com.example.kotapp1.activities

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.kotapp1.R
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_picasso.*

class PicassoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picasso)

        Picasso
            .with(this)
            .load("https://img1.ak.crunchyroll.com/i/spire1-tmb/87fc90a4526a6cb1d78fd26b85d140f91541282787_main.jpg")
            .fetch()

        Picasso
            .with(this)
            .load("https://sm.ign.com/t/ign_latam/screenshot/default/hinata-2_wstf.h720.jpg")
            .fetch()

        btnLoadImages.setOnClickListener { loadImages() }
    }

    fun loadImages(){
//        Picasso
//            .with(this)
//            .load("https://img1.ak.crunchyroll.com/i/spire1-tmb/87fc90a4526a6cb1d78fd26b85d140f91541282787_main.jpg")
//            //.fit() es la resolucion completa de la imagen
//            .resize(400, 400)
//            .centerCrop()
//            .into(imageViewTop)

        Picasso
            .with(this)
            .load("https://img1.ak.crunchyroll.com/i/spire1-tmb/87fc90a4526a6cb1d78fd26b85d140f91541282787_main.jpg")
            .transform(CircleTransform())
            .into(imageViewTop)


//        Picasso
//            .with(this)
//            .load("https://sm.ign.com/t/ign_latam/screenshot/default/hinata-2_wstf.h720.jpg")
//            .fit()
//            //.resize(600,600)
//            .centerInside()
//            .into(imageViewBottom)

        val context : Context = this

        Picasso
            .with(this)
            .load("https://sm.ign.com/t/ign_latam/screenshot/default/hinata-2_wstf.h720.jpg")
            .fetch(object:Callback {
                override fun onError() {

                }

                override fun onSuccess() {
                    imageViewBottom.alpha = 0f

                    Picasso
                        .with(context)
                        .load("https://sm.ign.com/t/ign_latam/screenshot/default/hinata-2_wstf.h720.jpg")
                        .fit()
                        .into(imageViewBottom)

                    imageViewBottom
                        .animate()
                        .setDuration(700)
                        .alpha(1f)
                        .start()
                }

            })

    }
}
