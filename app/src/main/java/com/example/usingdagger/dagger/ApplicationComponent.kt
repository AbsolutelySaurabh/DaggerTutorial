package com.example.usingdagger.dagger

import dagger.Component
import javax.inject.Singleton

/*
 Scope annotations on a @Component interface informs Dagger that classes annotated
 with this annotation (i.e. @Singleton) are bound to the life of the graph and so
 the same instance of that type is provided every time the type is requested.
 Custom scope can also be created. @MyCustomScope
 */
@Singleton
@Component
interface ApplicationComponent {

    fun repository(): UserRepository

}