package com.example.android_dagger.dagger.module

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

// @Module informs Dagger that this class is a Dagger Module
//In order for the Dagger graph to know about this module, you have to add it to the @Component interface as follows:
@Module
class NetworkModule {
    /*
    @Provides tells dagger, how to create instances of the type, that this function returns
    Note: You can use the @Provides annotation in Dagger modules to tell
          Dagger how to provide classes that your project doesn't own (e.g. an instance of Retrofit).
     */

    @Singleton
    @Provides
    fun provideMainRetrofitService(): MainRetrofitService {
        /*
          Whenever Dagger needs to provide an instance of type LoginRetrofitService,
          this code (the one inside the @Provides method) is run.
         */
        return Retrofit.Builder().baseUrl("https://google.com").build().create(MainRetrofitService::class.java)
    }

}