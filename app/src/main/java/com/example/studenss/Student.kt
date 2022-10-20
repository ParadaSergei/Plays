package com.example.studenss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Student : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)
        this.setTitle("Student")
    }

    fun butOnOff(view: View) {
        val intent = Intent(this@Student, TheEnd1::class.java)
        when (view.id) {
            R.id.button3 -> startActivity(intent)
        }}

    fun butOnOON(view: View) {val intent = Intent(this@Student, Kollege::class.java)
        when (view.id) {
            R.id.button4 -> startActivity(intent)
        }}
}