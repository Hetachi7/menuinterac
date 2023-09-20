package com.example.dashboard
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
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
        val electroniCard = findViewById<CardView>(R.id.elecCard)
        electroniCard.setOnClickListener {
            val intent2 = Intent(this@MainActivity, Electronics::class.java)
            startActivity(intent2)
            val toast = Toast.makeText(this, "Electronics", Toast.LENGTH_LONG)
            toast.show()
        }
        val HomeCard = findViewById<CardView>(R.id.Homecard)
        HomeCard.setOnClickListener {
            val intent3 = Intent(this@MainActivity, Home::class.java)
            startActivity(intent3)
        }
        val BeautyCard = findViewById<CardView>(R.id.Beatycard2)
        BeautyCard.setOnClickListener {
            val intent4 = Intent(this@MainActivity, Beauty::class.java)
            startActivity(intent4)
        }
        val phamarCard = findViewById<CardView>(R.id.phamarcyCard)
        phamarCard.setOnClickListener {
            val intent5 = Intent(this@MainActivity, Phamarcy::class.java)
            startActivity(intent5)
        }
        val groCard = findViewById<CardView>(R.id.groceriesCard)
        groCard.setOnClickListener {
            val intent6 = Intent(this@MainActivity, groceries::class.java)
            startActivity(intent6)
        }
    }
}