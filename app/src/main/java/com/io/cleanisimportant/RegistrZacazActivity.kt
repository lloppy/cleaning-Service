package com.io.cleanisimportant

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import android.content.SharedPreferences




class RegistrZacazActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registr_zacaz)


        var zacaz = findViewById(R.id.zacaz) as ImageView
        zacaz.setOnClickListener {
            val intent = Intent(this, ActualActivity::class.java)
            startActivity(intent);
        }




    }
}