package com.example.malong02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class finalquiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finalquiz)


        var number3: Int = 0

        val one: Button = findViewById(R.id.one1)
        val two: Button = findViewById(R.id.two2)
        val three: Button = findViewById(R.id.three3)
        val four: Button = findViewById(R.id.four4)
        val quizz3: TextView = findViewById(R.id.quizz3)

        val receivedIntent = intent
        number3 = receivedIntent.getIntExtra("ans", 0)

        quizz3.setText(number3.toString())

        one.setOnClickListener {
            val intent = Intent(this, quiz2::class.java)
            number3++
            intent.putExtra("ans", number3)
            startActivity(intent)
        }

        two.setOnClickListener {
            val intent = Intent(this, quiz2::class.java)
            intent.putExtra("ans", number3)
            startActivity(intent)
        }



    }
}