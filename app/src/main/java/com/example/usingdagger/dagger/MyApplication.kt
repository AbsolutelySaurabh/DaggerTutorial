package com.example.usingdagger.dagger

import android.app.Application

//appComponent lives in the Application class to share it's lifecycle.
class MyApplication: Application() {

    //reference to the application graph this is used across the whole graph
    val appComponent: ApplicationComponent = DaggerApplicationComponent.create()
    //grab an instance of userrepository from the above graph created
    val userRepository: UserRepository = appComponent.repository()

    /*
    Dagger creates a new instance of UserRepository every time it's requested.
     */
    val userRepository2: UserRepository = appComponent.repository()

    /*
    Scoping with dagger:
    Sometimes, you need to have a unique instance of a dependency in a container. You might want this for several reasons:
    because, sometimes it's expensive to create new everytime, eg: Viewmodel can be shared.
    This can be done with scope annotations.
     */

    //now, both are same
    //Thus, every time you call applicationGraph.repository(), you get the same instance of UserRepository.
    val userRepository3: UserRepository = appComponent.repository()
    val userRepository4: UserRepository = appComponent.repository()


}