package com.example.subcomponent_customscopes.dagger.component

import com.example.subcomponent_customscopes.dagger.login.LoginActivity
import com.example.subcomponent_customscopes.dagger.login.LoginPasswordFragment
import com.example.subcomponent_customscopes.dagger.login.LoginUsernameFragment
import com.example.subcomponent_customscopes.dagger.scope.ActivityScope
import dagger.Subcomponent

/*
Dagger SubComponents:
--------------------
If your login flow (managed by a single LoginActivity) consists of multiple fragments, you should reuse the same instance
 of LoginViewModel in all fragments.
 @Singleton cannot annotate LoginViewModel to reuse the instance for the following reasons:

1. The instance of LoginViewModel would persist in memory after the flow has finished.
2. You want a different instance of LoginViewModel for each login flow. For example,
if the user logs out, you want a different instance of LoginViewModel, rather than the same instance as when the user logged in for the first time.

To scope LoginViewModel to the lifecycle of LoginActivity you need to create a new component (a new subgraph)
 for the login flow and a new scope.

 Why SubComponents:
 ------------------
 LoginComponent must be able to access the objects from ApplicationComponent because LoginViewModel depends on UserRepository.
 The way to tell Dagger that you want a new component to use part of another component is with Dagger subcomponents.
 The new component must be a subcomponent of the component containing shared resources.

 Note: You also must define a subcomponent factory inside LoginComponent so that ApplicationComponent knows how to
 create instances of LoginComponent.

 */

//To tell dagger LoginComponent is subcomponent of ApplicationComponent indicate in @Module
// Classes annotated with @ActivityScope are scoped to the graph and the same instance of that type is provided every time the type is requested
@ActivityScope
@Subcomponent
interface LoginComponent {

    //Factory used to create instances of this subcomponent
    @Subcomponent.Factory
    interface Factory{
        fun create(): LoginComponent
    }

    //This tells dagger that LoginActivity requests injection from LoginComponent so that this subcomponent graph needs
    //to satisfy all the dependencies of the fields that LoginActivity is injecting
    fun inject(loginActivity: LoginActivity)

    /*
         All LoginActivity, LoginUsernameFragment and LoginPasswordFragment
         request injection from LoginComponent. The graph needs to satisfy
         all the dependencies of the fields those classes are injecting
     */
    fun inject(usernameFragment: LoginUsernameFragment)
    fun inject(passwordFragment: LoginPasswordFragment)

}