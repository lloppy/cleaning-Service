package com.io.cleanisimportant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class ActualActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actual)


        var done = findViewById(R.id.done) as ImageButton
        done.setOnClickListener {
            val intent = Intent(this, DoneActivity::class.java)
            startActivity(intent);
        }

    }
}