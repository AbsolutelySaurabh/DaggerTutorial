package com.example.android_dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_dagger.dagger.MyApplication
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    /*
    Instead of creating the dependencies an activity requires in the onCreate() method, you want Dagger to populate those dependencies for you.
    For field injection, you instead apply the @Inject annotation to the fields that you want to get from the Dagger graph.

    One of the considerations with Dagger is that injected fields cannot be private.
    They need to have at least package-private visibility.
     */
    @Inject lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        /*
        When using activities, inject Dagger in the activity's onCreate() method before calling super.onCreate() to avoid issues with fragment restoration.
        During the restore phase in super.onCreate(), an activity attaches fragments that might want to access activity bindings.
         */
        (applicationContext as MyApplication).appComponent.inject(this)
        //not mainViewModel is available

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
