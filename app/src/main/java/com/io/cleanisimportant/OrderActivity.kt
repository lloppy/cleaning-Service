package com.io.cleanisimportant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        var apay = findViewById(R.id.apay) as ImageView
        apay.setOnClickListener {
            val intent = Intent(this, RegistrZacazActivity::class.java)
            startActivity(intent);
        }

        var gpay = findViewById(R.id.gpay) as ImageView
        gpay.setOnClickListener {
            val intent = Intent(this, RegistrZacazActivity::class.java)
            startActivity(intent);
        }
    }
}