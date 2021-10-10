package com.io.cleanisimportant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tab = findViewById(R.id.tab) as ImageButton
        tab.setOnClickListener {
            val intent = Intent(this, ManActivity::class.java)
            startActivity(intent);
        }

        var maintab = findViewById(R.id.maintab) as ImageButton
        maintab.setOnClickListener {
            val intent = Intent(this, ManActivity::class.java)
            startActivity(intent);
        }
    }


}