package com.example.subcomponent_customscopes

import com.example.subcomponent_customscopes.dagger.datasource.UserRepository
import javax.inject.Inject

//// @Inject tells Dagger how to create instances of LoginViewModel
class LoginViewModel @Inject constructor(private val userRepository: UserRepository) {

}