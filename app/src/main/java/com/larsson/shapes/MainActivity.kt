package com.larsson.shapes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myCircle1 = Circle(5.0)
        myCircle1.changeName("Peter")

        println(myCircle1.name)

    }


}