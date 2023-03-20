package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // hding action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar()?.hide();
        }
    }

    //calling function from fragment
    public fun firstclicked()
    {
        startActivity(Intent(this@MainActivity,FirstActivity::class.java))
        overridePendingTransition(R.anim.slide_out_bottom, R.anim.slide_in_bottom);
    }

    //calling function from fragment
    public fun secondclicked()
    {
        startActivity(Intent(this@MainActivity,SecondActivity::class.java))
        overridePendingTransition(R.anim.slide_out_bottom, R.anim.slide_in_bottom);
    }
}