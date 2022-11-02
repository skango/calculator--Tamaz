package com.example.calculator2

import android.R
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.toColorInt


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.calculator2.R.layout.activity_main)
    }




    public  final fun doSum(view: View) {
        try {
            val abtn = findViewById<EditText>(com.example.calculator2.R.id.num1)
            val a = abtn.text.toString().toFloat()
            val bbtn = findViewById<EditText>(com.example.calculator2.R.id.num2)
            val b = bbtn.text.toString().toFloat()
            val Result = a + b
            print("Result is " + Result)
            findViewById<TextView>(com.example.calculator2.R.id.result).setText(Result.toString())
        }catch (error: Error) {

        }
    }

    public  final fun doSub(view: View) {
        try {
            val abtn = findViewById<EditText>(com.example.calculator2.R.id.num1)
            val a = abtn.text.toString().toFloat()
            val bbtn = findViewById<EditText>(com.example.calculator2.R.id.num2)
            val b = bbtn.text.toString().toFloat()
            val Result = a - b
            print("Result is " + Result)
            findViewById<TextView>(com.example.calculator2.R.id.result).setText(Result.toString())
        }catch (error: Error) {

        }
    }

    public  final fun doDiv(view: View) {
        try {
            val abtn = findViewById<EditText>(com.example.calculator2.R.id.num1)
            val a = abtn.text.toString().toFloat()
            val bbtn = findViewById<EditText>(com.example.calculator2.R.id.num2)
            val b = bbtn.text.toString().toFloat()
            val Result = a / b
            print("Result is " + Result)
            findViewById<TextView>(com.example.calculator2.R.id.result).setText(Result.toString())
        }catch (error: Error) {

        }
    }


    public  final fun doMul(view: View) {
        try {
            val abtn = findViewById<EditText>(com.example.calculator2.R.id.num1)
            val a = abtn.text.toString().toFloat()
            val bbtn = findViewById<EditText>(com.example.calculator2.R.id.num2)
            val b = bbtn.text.toString().toFloat()
            val Result = a * b
            print("Result is " + Result)
            findViewById<TextView>(com.example.calculator2.R.id.result).setText(Result.toString())
        }catch (error: Error) {

        }
    }
}