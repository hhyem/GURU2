package com.example.guru2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class UserModify : AppCompatActivity() {

    lateinit var btn_modify:Button
    lateinit var back:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_modify)

        btn_modify = findViewById(R.id.btn_modify)
        back = findViewById(R.id.back)

        btn_modify.setOnClickListener {
            startActivity(Intent(this@UserModify, Mypage::class.java))
        }

        back.setOnClickListener {
            startActivity(Intent(this@UserModify, Mypage::class.java))
        }
    }
}