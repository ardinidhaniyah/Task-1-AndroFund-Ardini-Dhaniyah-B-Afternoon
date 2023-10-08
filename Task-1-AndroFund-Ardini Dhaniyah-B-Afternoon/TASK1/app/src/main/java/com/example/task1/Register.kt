package com.example.task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class Register : AppCompatActivity() {

    private lateinit var username : EditText
    private lateinit var password : EditText
    private lateinit var confirmpass : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        username = findViewById(R.id.edittext1)
        password = findViewById(R.id.edittext2)
        confirmpass = findViewById(R.id.edittext5)

        val buttonregister = findViewById<Button>(R.id.button1)
        buttonregister.setOnClickListener(View.OnClickListener {

            val bundle = Bundle()
            bundle. putString("username", username.text.toString())
            bundle. putString("password", password.text.toString())

            val intent = Intent(this@Register, login :: class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
    }
}