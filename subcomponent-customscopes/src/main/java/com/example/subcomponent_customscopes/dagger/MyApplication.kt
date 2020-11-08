package com.example.subcomponent_customscopes.dagger

import android.app.Application
import com.example.subcomponent_customscopes.dagger.component.ApplicationComponent
import com.example.subcomponent_customscopes.dagger.component.DaggerApplicationComponent

//appComponent lives in the Application class to share it's lifecycle.
class MyApplication: Application() {

    //reference to the application graph this is used across the whole graph
    val appComponent: ApplicationComponent = DaggerApplicationComponent.create()

}