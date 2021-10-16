package com.io.cleanisimportant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class ScrollActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll)

        var standart = findViewById(R.id.standart) as ImageView
        standart.setOnClickListener {
            val intent = Intent(this, ApartmentActivity::class.java)
            startActivity(intent);

        }

        var plash = findViewById(R.id.plash) as ImageButton
        val id1 = resources.getIdentifier(R.drawable.ic_frame_14.toString(), null, null)
        plash.setOnClickListener {
            val intent = Intent(this, RegistrActivity::class.java)
            startActivity(intent);

        }

        val id2 = resources.getIdentifier(R.drawable.ic_frame_plita2.toString(), null, null)
        var plita = findViewById(R.id.plita) as ImageButton
        plita.setOnClickListener {
            plita.setImageResource(id2);
            plash.setImageResource(id1)

        }



    }
}