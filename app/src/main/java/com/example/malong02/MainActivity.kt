package com.example.malong02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number: Int = 0

        val one: Button = findViewById(R.id.one1)
        val two: Button = findViewById(R.id.two2)
        val three: Button = findViewById(R.id.three3)
        val four: Button = findViewById(R.id.four4)
        val quizz: TextView = findViewById(R.id.quizz)

        one.setOnClickListener {
            val intent = Intent(this, quiz2::class.java)
            number++
            intent.putExtra("ans", number)
            startActivity(intent)
        }

        two.setOnClickListener {
            val intent = Intent(this, quiz2::class.java)
            intent.putExtra("ans", number)
            startActivity(intent)
        }

    }
}