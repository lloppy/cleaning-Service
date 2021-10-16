package com.io.cleanisimportant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class CleanersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cleaners)



//        var bonus = findViewById(R.id.bonusy) as ImageButton
//        bonus.setOnClickListener {
//            val intent = Intent(this, BonusActivity::class.java)
//            startActivity(intent);
//        }

        var zacaz = findViewById(R.id.zacaz) as ImageButton
        zacaz.setOnClickListener {
            val intent = Intent(this, ZacazActivity::class.java)
            startActivity(intent);
        }

    }
}