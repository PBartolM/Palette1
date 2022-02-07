package com.example.palette

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.widget.Toolbar


import android.graphics.BitmapFactory

import android.graphics.Bitmap
import android.view.View
import androidx.appcompat.app.ActionBar
import androidx.palette.graphics.Palette
import kotlinx.android.synthetic.main.activity_act2.*


class Act2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act2)
        val image = findViewById<View>(R.id.imageViewColore) as ImageView
        val bundle = intent.extras

        val resId = bundle!!.getInt("picture")
        image.setImageResource(resId)



        image.setImageResource(bundle!!.getInt("LOGO"))

        val bitmap:Bitmap = BitmapFactory.decodeResource(resources,resId)

        Palette.from(bitmap).generate { palette ->

            val vibrante: Palette.Swatch? = palette?.vibrantSwatch
            val darkvibrante: Palette.Swatch? = palette?.darkVibrantSwatch
            val lightvibrante: Palette.Swatch? = palette?.lightVibrantSwatch
            val mutede: Palette.Swatch? = palette?.mutedSwatch
            val darkmutede: Palette.Swatch? = palette?.darkMutedSwatch
            val lightmutede: Palette.Swatch? = palette?.lightMutedSwatch
            if (vibrante != null) {
                vibrant.setBackgroundColor(vibrante.rgb)
//                vibrant.setTitleTextColor(vibrante.titleTextColor)
            }

            if (darkvibrante != null) {
                darkVibrant.setBackgroundColor(darkvibrante.rgb)
//                darkVibrant.setTitleTextColor(darkvibrante.titleTextColor)
            }
            if (lightvibrante != null) {
                lightVibrant.setBackgroundColor(lightvibrante.rgb)
//                lightVibrant.setTitleTextColor(lightvibrante.titleTextColor)
            }
            if (mutede != null) {
                muted.setBackgroundColor(mutede.rgb)
//                muted.setTitleTextColor(mutede.titleTextColor)
            }
            if (darkmutede != null) {
                darkMuted.setBackgroundColor(darkmutede.rgb)
//                darkMuted.setTitleTextColor(darkmutede.titleTextColor)
            }
            if (lightmutede != null) {
                lightMuted.setBackgroundColor(lightmutede.rgb)
//                lightMuted.setTitleTextColor(lightmutede.titleTextColor)
            }
        }



    }

}