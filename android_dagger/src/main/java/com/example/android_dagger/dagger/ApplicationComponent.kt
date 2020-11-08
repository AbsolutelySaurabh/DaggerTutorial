package com.example.android_dagger.dagger

import com.example.android_dagger.MainActivity
import com.example.android_dagger.dagger.module.NetworkModule
import dagger.Component
import javax.inject.Singleton
/*
Dagger needs to know that MainActivity has to access the graph in order to provide the ViewModel it requires.
 */
@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {
/*
     This tells Dagger that MainActivity requests injection so the graph needs to
     satisfy all the dependencies(MainViewModel with its own dependencies) of the fields that MainActivity is requesting.
 */
    fun inject(mainActivity: MainActivity)

}