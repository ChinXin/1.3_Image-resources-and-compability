package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll : Button = findViewById(R.id.roll_button)
        val btnCountUp : Button = findViewById(R.id.countUp_button)

        btnRoll.setOnClickListener() {
            rollDice()
        }

        btnCountUp.setOnClickListener() {
            countUp()
        }

    }

    private fun rollDice() {
        val randomInt : Int = (1..6).random()

        val tvResult : TextView = findViewById(R.id.result_text)
        tvResult.text = randomInt.toString()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)

        if (resultText.text == "Hello World!") {
            resultText.text = "1"
        }
        else
        {
            var resultInt = resultText.text.toString().toInt()

            if(resultInt < 6) {
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
    }
}