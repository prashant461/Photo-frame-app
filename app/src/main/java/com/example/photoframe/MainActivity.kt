package com.example.photoframe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var currentImage=0
    lateinit var image:ImageView
    var names= arrayOf("Virat Kohli","Sachin Tendulkar","AB Deviliers","MS Dhoni")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val prev=findViewById<ImageButton>(R.id.pre)
        val next=findViewById<ImageButton>(R.id.next)
        val name=findViewById<TextView>(R.id.textView2)

        prev.setOnClickListener{
            val idCurrentImageString="pic$currentImage"
            val idCurrentImageInt=this.resources.getIdentifier(idCurrentImageString,"id",packageName)
            image=findViewById(idCurrentImageInt)
            image.alpha=0f

            currentImage=(4+currentImage-1)%4
            val idImageToShowString="pic$currentImage"
            val idImageToShowInt=this.resources.getIdentifier(idImageToShowString,"id",packageName)
            image=findViewById(idImageToShowInt)
            image.alpha=1f
            name.text=names[currentImage]
        }
        next.setOnClickListener{
            val idCurrentImageString="pic$currentImage"
            val idCurrentImageInt=this.resources.getIdentifier(idCurrentImageString,"id",packageName)
            image=findViewById(idCurrentImageInt)
            image.alpha=0f

            currentImage=(4+currentImage+1)%4
            val idImageToShowString="pic$currentImage"
            val idImageToShowInt=this.resources.getIdentifier(idImageToShowString,"id",packageName)
            image=findViewById(idImageToShowInt)
            image.alpha=1f
            name.text=names[currentImage]

        }
    }
}