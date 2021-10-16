package com.io.cleanisimportant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class DoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_done)

        var cleaners = findViewById(R.id.clinery) as ImageButton
        cleaners.setOnClickListener {
            val intent = Intent(this, CleanersActivity::class.java)
            startActivity(intent);
        }



        var bon = findViewById(R.id.bonusy) as ImageButton
        bon.setOnClickListener {
            val intent = Intent(this, ShareActivity::class.java)
            startActivity(intent);
        }
    }
}