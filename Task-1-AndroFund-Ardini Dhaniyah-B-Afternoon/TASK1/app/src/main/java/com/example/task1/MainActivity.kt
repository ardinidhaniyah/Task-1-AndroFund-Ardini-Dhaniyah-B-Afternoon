package com.example.task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.task1.databinding.ActivityMainBinding
import javax.net.ssl.SSLSessionBindingEvent

class MainActivity : AppCompatActivity() {

    private lateinit var tv : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.textView12)

        val username :String? = intent.getParcelableExtra<user>("user")?.username
        val password :String? = intent.getParcelableExtra<user>("user")?.password

        tv.text = "username: $username dan password: $password"

        val buttonimplicit = findViewById<Button>(R.id.button3)
        buttonimplicit.setOnClickListener(View.OnClickListener {
            val message = "Halo, saya ingin menanyakan sesuatu"
            val intent = Intent ()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"
            startActivity(intent)
        })

//        val buttonback = findViewById<Button>(R.id.button4)
//        val intent = Intent()
//        intent.putExtra("history", "Anda sudah login")
//        setResult(RESULT_OK, intent)
//        finish()
    }
}