package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    class Dice(val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {

            rolldice()
//            val resultTextView: TextView = findViewById(R.id.textView)
//            resultTextView.text = (1..6).random().toString()
        }

//
    }

    private fun rolldice() {
        val dice=Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)
        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.side_1)
            2 -> diceImage.setImageResource(R.drawable.side_2)
            3 -> diceImage.setImageResource(R.drawable.side_3)
            4 -> diceImage.setImageResource(R.drawable.side_4)
            5 -> diceImage.setImageResource(R.drawable.side_5)
            6 -> diceImage.setImageResource(R.drawable.side_6)
        }
        // val resultTextView: TextView = findViewById(R.id.textView)
        //resultTextView.text = diceRoll.toString()
       }
}
