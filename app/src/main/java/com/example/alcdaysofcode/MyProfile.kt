package com.example.alcdaysofcode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MyProfile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_profile)
        supportActionBar!!.setTitle("My Profile")
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

    }


}
