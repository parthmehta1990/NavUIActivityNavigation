package com.example.navuiactivitynavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.ActivityNavigator
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        button3.setOnClickListener {view: View ->
            val activityNavigator = ActivityNavigator( this!!)
            activityNavigator.navigate(
                activityNavigator.createDestination().setIntent(
                    Intent(
                        this!!,
                        MainActivity::class.java
                    )
                ), null, null, null
            )
            finish()
        }
    }
}
