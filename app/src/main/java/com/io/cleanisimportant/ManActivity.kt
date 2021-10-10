package com.io.cleanisimportant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class ManActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_man)

        var tab = findViewById(R.id.tab) as ImageButton
        tab.setOnClickListener {
            val intent = Intent(this, PigActivity::class.java)
            startActivity(intent);
        }


        var maintab = findViewById(R.id.maintab) as ImageButton
        maintab.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent);
        }

    }
}