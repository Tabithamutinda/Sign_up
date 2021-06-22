package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    lateinit var etname:EditText
    lateinit var spgender:Spinner
    lateinit var etemailaddress:EditText
    lateinit var etphone:EditText
    lateinit var etpassword:EditText
    lateinit var button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
    }
    fun castViews(){
        etname=findViewById(R.id.etname)
        spgender=findViewById(R.id.spgender)
        etemailaddress=findViewById(R.id.etemailaddress)
        etphone=findViewById(R.id.etphone)
        etpassword=findViewById(R.id.etpassword)
        button=findViewById(R.id.button)

        var gender= arrayOf("Male","Female")
        var genderAdapter=ArrayAdapter(baseContext,android.R.layout.simple_spinner_dropdown_item,gender)
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spgender.adapter=genderAdapter
        clickSignUp()
    }

    fun clickSignUp(){
        button  .setOnClickListener {
            var name=etname.text.toString()
            var gender=""
            var emailaddress=etemailaddress.text.toString()
            var phone=etphone.text.toString()
            var password=etpassword.text.toString()

            var details=Details(name,gender,emailaddress,phone,password)
            var intent=Intent(baseContext,LogIn::class.java)
            startActivity(intent)
        }
    }
}

data class Details(var name:String,var gender:String,var emailAddress:String,var phone:String,var password:String)