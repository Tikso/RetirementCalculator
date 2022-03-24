package com.study.retirementcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCenter.start(application, "ffab8cfb-a9d2-44ad-a3ac-a687f284ce07", Analytics::class.java, Crashes::class.java)

        val clickMe = findViewById<Button>(R.id.clickMe)
        clickMe.text = "Press Me"
        clickMe.setOnClickListener {
            Crashes.generateTestCrash()
        }
    }
}
