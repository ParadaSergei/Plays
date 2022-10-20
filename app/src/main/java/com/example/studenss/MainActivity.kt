package com.example.studenss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.setTitle("Главное меню")
    }
    fun btnonClick(view: View) {
        val intent = Intent(this@MainActivity, Student::class.java)
        when (view.id) {
            R.id.button -> startActivity(intent)
        }
    }
}