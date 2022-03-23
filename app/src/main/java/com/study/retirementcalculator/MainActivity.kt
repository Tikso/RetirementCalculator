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
        AppCenter.start(application, "e10a3977-599a-43bd-9132-cf9e615ead6b", Analytics::class.java, Crashes::class.java)

        val clickMe = findViewById<Button>(R.id.clickMe)
        clickMe.setOnClickListener {
            Crashes.generateTestCrash()
        }
    }
}