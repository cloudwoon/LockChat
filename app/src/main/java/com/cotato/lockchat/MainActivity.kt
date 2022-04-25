package com.cotato.lockchat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        noStatusBar()
        setContentView(R.layout.activity_main)
    }
}