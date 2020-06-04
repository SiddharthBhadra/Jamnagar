package com.example.jamnagar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*
import com.example.jamnagar.Categorys_jamnagar

class MainActivity : AppCompatActivity() {

    lateinit var page1:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        homepage()
}

private fun homepage()
{
    //jump on activity 2
    val context = this
    page1=findViewById(R.id.button_home)
    page1?.setOnClickListener {
        val intent = Intent(context,Categorys_jamnagar::class.java)
        startActivity(intent)
    }
}
}