package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // then call hide function
        if (getSupportActionBar() != null) {
            getSupportActionBar()?.hide();
        }
    }

    public fun firstclicked()
    {
        startActivity(Intent(this@MainActivity,FirstActivity::class.java))
        overridePendingTransition(R.anim.slide_out_bottom, R.anim.slide_in_bottom);
    }

    public fun secondclicked()
    {
        startActivity(Intent(this@MainActivity,SecondActivity::class.java))
        overridePendingTransition(R.anim.slide_out_bottom, R.anim.slide_in_bottom);
    }
}