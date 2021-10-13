package com.io.cleanisimportant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class ApartmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apartment)



        var tab = findViewById(R.id.tab) as ImageButton
        tab.setOnClickListener {
            val intent = Intent(this, ZacazActivity::class.java)
            startActivity(intent);
        }

        val id = resources.getIdentifier(R.drawable.ic_group_bluetwo.toString(), null, null)
        var btntwo = findViewById(R.id.two) as ImageButton
        btntwo.setOnClickListener {
            btntwo.setImageResource(id);

        }

        var btnthree = findViewById(R.id.plash) as ImageButton

        val id2 = resources.getIdentifier(R.drawable.ic_group_blueone.toString(), null, null)
        var btnone = findViewById(R.id.one) as ImageButton
        btnone.setOnClickListener {
            btnone.setImageResource(id2);
            btnthree.setVisibility(View.VISIBLE)


            btnthree.setOnClickListener {
                val intent = Intent(this, ScrollActivity::class.java)
                startActivity(intent);
            }
        }



    }
}