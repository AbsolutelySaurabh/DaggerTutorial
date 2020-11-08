package com.example.subcomponent_customscopes.dagger.component

import com.example.subcomponent_customscopes.LoginActivity
import com.example.subcomponent_customscopes.dagger.module.NetworkModule
import com.example.subcomponent_customscopes.dagger.module.SubComponentModule
import dagger.Component
import javax.inject.Singleton
/*
Dagger needs to know that MainActivity has to access the graph in order to provide the ViewModel it requires.
Including SubcomponentsModule, tell ApplicationComponent that LoginComponent is it's subcomponent
 */
@Singleton
@Component(modules = [NetworkModule::class, SubComponentModule::class])
interface ApplicationComponent {

    /*
    ApplicationComponent needs no more to inject LoginActivity, as that responsibility now belongs to LoginComponent
    Consumers of ApplicationComponent needs to know how to create instances of LoginComponent

    fun inject(mainActivity: LoginActivity)

     */

    // Consumers of ApplicationComponent needs to know how to create instances of LoginComponent
    fun loginComponent(): LoginComponent.Factory


}