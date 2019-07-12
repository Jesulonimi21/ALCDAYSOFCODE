package com.example.alcdaysofcode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.setTitle("ALC 4 Phase1")
    }
    fun startProfile(view: View){
        startActivity(Intent(this,MyProfile::class.java));
    }
    fun startAbout(view: View){
        startActivity(Intent(this,AboutAlc::class.java));
    }
}
