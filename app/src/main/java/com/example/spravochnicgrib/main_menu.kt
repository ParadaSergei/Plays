package com.example.spravochnicgrib

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class main_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_SpravochnicGrib)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
    }

    fun aidovito(view: View) {
        val intent: Intent = Intent(this@main_menu,aidov_grib::class.java)
        startActivity(intent)
    }

    fun kat_1(view: View) {}

    fun kat_2(view: View) {}

    fun kat_3(view: View) {}

    fun kat_3_2(view: View) {}

    fun kat_4(view: View) {}

    fun kat_4_2(view: View) {}

    fun falses(view: View) {}

    fun ogorod(view: View) {}

    fun no_sedob(view: View) {}
}