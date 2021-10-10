package com.io.cleanisimportant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class ZacazActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zacaz)




        var tab = findViewById(R.id.tab) as ImageButton
        tab.setOnClickListener {
            val intent = Intent(this, ApartmentActivity::class.java)
            startActivity(intent);
        }
    }
}