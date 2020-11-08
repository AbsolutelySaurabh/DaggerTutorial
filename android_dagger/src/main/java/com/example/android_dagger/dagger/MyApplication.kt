package com.example.android_dagger.dagger

import android.app.Application
import com.example.android_dagger.dagger.datasource.UserRepository

//appComponent lives in the Application class to share it's lifecycle.
class MyApplication: Application() {

    //reference to the application graph this is used across the whole graph
    val appComponent: ApplicationComponent = DaggerApplicationComponent.create()




}