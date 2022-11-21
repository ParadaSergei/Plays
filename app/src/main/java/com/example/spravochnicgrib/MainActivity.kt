package com.example.spravochnicgrib

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_SpravochnicGrib)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun proceed(view: View) {
        val intent:Intent = Intent(this@MainActivity,main_menu::class.java)
        startActivity(intent)
    }
}