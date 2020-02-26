package com.example.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    fun clickFunction(view : View){
        var mickey = findViewById<ImageView>(R.id.mickeyPic)
        mickey.animate().translationXBy(1000f).setDuration(2000)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
