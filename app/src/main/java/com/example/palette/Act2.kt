package com.example.palette

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.widget.Toolbar


import android.graphics.BitmapFactory

import android.graphics.Bitmap
import android.view.View
import androidx.palette.graphics.Palette


class Act2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act2)
        val image = findViewById<View>(R.id.imageViewColore) as ImageView
        val bundle = intent.extras

        val resId = bundle!!.getInt("picture")
        image.setImageResource(resId)


        val bitmap:Bitmap = BitmapFactory.decodeResource(resources,resId)

        Palette.from(bitmap).generate { palette ->

            val vibrant: Palette.Swatch? = palette?.vibrantSwatch
            val darkvibrant: Palette.Swatch? = palette?.darkVibrantSwatch
            val lightvibrant: Palette.Swatch? = palette?.lightVibrantSwatch
            val muted: Palette.Swatch? = palette?.mutedSwatch
            val darkmuted: Palette.Swatch? = palette?.darkMutedSwatch
            val lightmuted: Palette.Swatch? = palette?.lightMutedSwatch

        }


    }
}