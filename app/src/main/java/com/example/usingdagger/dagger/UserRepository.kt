package com.example.usingdagger.dagger

import com.example.usingdagger.dagger.datasource.UserLocalDataSource
import com.example.usingdagger.dagger.datasource.UserRemoteDataSource
import javax.inject.Inject
import javax.inject.Singleton

/*
Add an @Inject annotation to the UserRepository constructor so Dagger knows how to create a UserRepository:
 */
@Singleton
class UserRepository @Inject constructor(val localDataSource: UserLocalDataSource, remoteDataSource: UserRemoteDataSource){
    /*
        In the above snippet of code, you're telling Dagger:
        How to create a UserRepository instance with the @Inject annotated constructor.
        What its dependencies are: UserLocalDataSource and UserRemoteDataSource.
     */

    /*
    Now Dagger knows how to create an instance of UserRepository, but it doesn't know how to create its dependencies.
    If you annotate the other classes too, Dagger knows how to create them:
     */

}