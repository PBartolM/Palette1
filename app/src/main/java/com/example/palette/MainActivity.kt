package com.example.palette

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.widget.Toolbar
import androidx.core.app.ActivityOptionsCompat
import androidx.core.os.bundleOf
import androidx.palette.graphics.Palette
import java.io.ByteArrayOutputStream
import androidx.core.util.Pair


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.appbar)
        setSupportActionBar(toolbar)

        val items = ArrayList<Tarjeta>()
        items.add(Tarjeta(R.drawable.image1))
        items.add(Tarjeta(R.drawable.image2))
        items.add(Tarjeta(R.drawable.image3))
        items.add(Tarjeta(R.drawable.image4))
        items.add(Tarjeta(R.drawable.image5))
        items.add(Tarjeta(R.drawable.image6))
        items.add(Tarjeta(R.drawable.image7))
        items.add(Tarjeta(R.drawable.image8))

        val recView = findViewById<RecyclerView>(R.id.recview)

        recView.setHasFixedSize(true)

        val adaptador = CardsAdapter(items)
        recView.adapter = adaptador
        recView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        adaptador.onClick = {
            val i = items[recView.getChildAdapterPosition(it)]
            val image = findViewById<View>(R.id.image1) as ImageView
            val intencion = Intent(this,Act2::class.java)
            val p1 = Pair.create<View, String>(image, image.transitionName)
            intencion.putExtra("picture", i.imagen);
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this,p1).toBundle()

            options?.putInt("LOGO", i.imagen)

            //Añadimos la información al Intent
            intencion.putExtras(options!!)
            startActivity(intencion, options)

        }

    }
}