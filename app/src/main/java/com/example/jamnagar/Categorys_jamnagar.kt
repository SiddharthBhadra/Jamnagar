package com.example.jamnagar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Categorys_jamnagar : AppCompatActivity() {

    lateinit var place: ImageButton
    lateinit var history: ImageButton
    lateinit var hotel: ImageButton
    lateinit var army:ImageButton
    lateinit var food:ImageButton
    lateinit var temple:ImageButton
    lateinit var refinery:ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categorys_jamnagar)

        //jump on activity 3
        place = findViewById(R.id.places_jamnagar)
        place?.setOnClickListener{
            val intent = Intent(this,Places::class.java)
            startActivity(intent)
        }

        //jump on activity 4
        history=findViewById(R.id.history_jamnagar)
        history?.setOnClickListener{
            val intent = Intent(this,History::class.java)
            startActivity(intent)
        }

        //jump on activity 5
        hotel=findViewById(R.id.hotel_jamnagar)
        hotel?.setOnClickListener{
            val intent = Intent(this,Hotels::class.java)
            startActivity(intent)
        }

        //jump on activity 6
        army=findViewById(R.id.army_jamnagar)
        army?.setOnClickListener{
            val intent = Intent(this,Army::class.java)
            startActivity(intent)
        }

        //jump on activity 7
        food=findViewById(R.id.food_jamnagar)
        food?.setOnClickListener{
            val intent = Intent(this,Food::class.java)
            startActivity(intent)
        }

        //jump on activity 8
        temple=findViewById(R.id.temp_jamnagar)
        temple?.setOnClickListener{
            val intent = Intent(this,Temples::class.java)
            startActivity(intent)
        }

        //jump on activity 9
        refinery=findViewById(R.id.rel_jamnagar)
        refinery?.setOnClickListener{
            val intent = Intent(this,Refinery::class.java)
            startActivity(intent)
        }
    }
}

