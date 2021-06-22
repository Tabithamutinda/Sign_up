package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LogIn : AppCompatActivity() {
    lateinit var etemail:EditText
    lateinit var etpassword:EditText
    lateinit var button3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
    }
    fun cast(){
        etemail=findViewById(R.id.etemail)
        etpassword=findViewById(R.id.etpassword)
        button3=findViewById(R.id.button3)

    }
    fun clickSignUp(){
        button3.setOnClickListener {
            var mail=etemail.text.toString()
            var pass=etpassword.text.toString()
            var intent= Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
