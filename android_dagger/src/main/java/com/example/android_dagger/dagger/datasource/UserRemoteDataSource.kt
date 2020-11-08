package com.example.android_dagger.dagger.datasource

import com.example.android_dagger.dagger.module.MainRetrofitService
import javax.inject.Inject

class UserRemoteDataSource @Inject constructor(private val mainRetrofitService: MainRetrofitService) {
}