package com.example.navuiactivitynavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.ActivityNavigator
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        button2.setOnClickListener {view: View ->
            val activityNavigator = ActivityNavigator( this!!)
            activityNavigator.navigate(
                activityNavigator.createDestination().setIntent(
                    Intent(
                        this!!,
                        ThirdActivity::class.java
                    )
                ), null, null, null
            )
            finish()
        }
    }
}
