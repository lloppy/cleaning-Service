package com.io.cleanisimportant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.content.SharedPreferences
import android.preference.PreferenceManager
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView


class RegistrActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registr)

        var send = findViewById(R.id.send) as ImageButton
        send.setOnClickListener {
            val intent = Intent(this, ChooseDateActivity::class.java)
            startActivity(intent);
        }

    }

}