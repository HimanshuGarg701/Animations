package com.example.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    fun clickGoofyFunction(view : View){
        val mickey = findViewById<ImageView>(R.id.goofyPic)
        mickey.animate().translationXBy(2000f).setDuration(3000)
        Toast.makeText(this,"Mickey Clicked", Toast.LENGTH_SHORT).show()
    }

    fun clickJerryFunction(view : View){
        val jerry = findViewById<ImageView>(R.id.jerryPic)
        jerry.animate().rotationBy(360f).setDuration(2000)
        Toast.makeText(this,"Jerry Clicked", Toast.LENGTH_SHORT).show()
    }

    fun clickDogFunction(view : View){
        val dog = findViewById<ImageView>(R.id.dogPic)
        dog.animate().alpha(0.5f)
        Toast.makeText(this,"Dog Clicked", Toast.LENGTH_SHORT).show()
    }

    fun clickPandaFunction(view : View){
        val panda = findViewById<ImageView>(R.id.pandaPic)
        panda.animate().translationYBy(2000f).setDuration(2000)
        Toast.makeText(this,"Panda Clicked", Toast.LENGTH_SHORT).show()
    }

    fun clickSunFunction(view : View){
        val sun = findViewById<ImageView>(R.id.sunPic)
        sun.animate().alpha(0f).setDuration(2000)
        Toast.makeText(this,"Sun Clicked", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
