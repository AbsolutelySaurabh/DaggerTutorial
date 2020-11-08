package com.example.subcomponent_customscopes.dagger.datasource

import com.example.subcomponent_customscopes.dagger.module.LoginRetrofitService
import javax.inject.Inject

class UserRemoteDataSource @Inject constructor(private val mainRetrofitService: LoginRetrofitService) {
}