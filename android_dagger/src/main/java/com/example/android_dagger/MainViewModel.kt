package com.example.android_dagger

import com.example.android_dagger.dagger.datasource.UserRepository
import javax.inject.Inject

//// @Inject tells Dagger how to create instances of LoginViewModel
class MainViewModel @Inject constructor(private val userRepository: UserRepository) {

}