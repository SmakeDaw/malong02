package com.example.malong02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class quiz2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz2)

        var number2: Int = 0

        val one: Button = findViewById(R.id.one1)
        val two: Button = findViewById(R.id.two2)
        val three: Button = findViewById(R.id.three3)
        val four: Button = findViewById(R.id.four4)
        val quizz2: TextView = findViewById(R.id.quizz2)

        val receivedIntent = intent
        number2 = receivedIntent.getIntExtra("ans", 0)
        quizz2.text = number2.toString()

        one.setOnClickListener {
            val intent = Intent(this, quiz2::class.java)
            number2++
            intent.putExtra("ans", number2)
            startActivity(intent)
        }

        two.setOnClickListener {
            val intent = Intent(this, quiz2::class.java)
            intent.putExtra("ans", number2)
            startActivity(intent)
        }

    }
}