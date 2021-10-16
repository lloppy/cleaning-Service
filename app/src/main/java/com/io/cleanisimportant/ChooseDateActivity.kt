package com.io.cleanisimportant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isGone
import java.lang.String


class ChooseDateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_date)

        var send = findViewById(R.id.send) as ImageButton
        send.setOnClickListener {
            val intent = Intent(this, OrderActivity::class.java)
            startActivity(intent);
        }




    }
}