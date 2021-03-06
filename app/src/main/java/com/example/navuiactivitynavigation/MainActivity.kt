package com.example.navuiactivitynavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.ActivityNavigator
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener { view: View ->
            val activityNavigator = ActivityNavigator( this!!)
            activityNavigator.navigate(
                activityNavigator.createDestination().setIntent(
                    Intent(
                        this!!,
                        SecondActivity::class.java
                    )
                ), null, null, null
            )
            finish()
        }
    }
}

/*
* Note: For one activity there is only one Navigation Graph is used i.e for another activity you have to
* use new activity.
* You can use multiple fragment in one Navigation graph also multiple navigation graph for multiple
* activity and different fragment within each activity
*
* */