package com.example.studenss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Kollege : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kollege)
        this.setTitle("Колледж")
    }

    fun butend2(view: View) {
        val intent = Intent(this@Kollege, TheEnd2::class.java)
        when (view.id) {
            R.id.button5 -> startActivity(intent)
        }
    }

    fun butVipusk(view: View) { val intent = Intent(this@Kollege, Vipusk::class.java)
        when (view.id) {
            R.id.button6 -> startActivity(intent)
        }}
}