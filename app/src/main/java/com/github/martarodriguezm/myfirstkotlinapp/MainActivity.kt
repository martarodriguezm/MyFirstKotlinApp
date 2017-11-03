package com.github.martarodriguezm.myfirstkotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView) as TextView
        textView.text = "Hello Kotlin!"

        toast("Hello ${textView.text}, how are you?")

        val editText = findViewById<EditText>(R.id.message) as EditText
        val button = findViewById<Button>(R.id.button) as Button
        button.setOnClickListener {
            toast("Hello ${editText.text}!")
        }
    }

    private fun toast(message: String): Unit { //All the functions return an object, Unit as default
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

//    fun getInt(int: Int): Int {
//        return 2 * int
//    }
    fun getInt(int: Int) = 2 * int //Another way to write simple functions

    fun test() {
        val x = 20
        val string = "Hello"
        var string2 = "Hello"
    }
}
