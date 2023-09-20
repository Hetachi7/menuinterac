package com.example.dashboard
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clothingCard = findViewById<CardView>(R.id.clothingCard)
        clothingCard.setOnClickListener {
            val intent = Intent(this@MainActivity, clothing::class.java)
            startActivity(intent)
        }
        val electronicCard = findViewById<CardView>(R.id.elecCard)
        electronicCard.setOnClickListener {
            val intent = Intent(this@MainActivity, Electronics::class.java)
            startActivity(intent)
        }
    }
}