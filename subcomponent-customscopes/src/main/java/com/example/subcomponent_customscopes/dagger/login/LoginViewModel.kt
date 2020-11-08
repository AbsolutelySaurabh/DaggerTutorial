package com.example.subcomponent_customscopes.dagger.login

import com.example.subcomponent_customscopes.dagger.scope.ActivityScope
import com.example.subcomponent_customscopes.dagger.datasource.UserRepository
import javax.inject.Inject

// @Inject tells Dagger how to create instances of LoginViewModel
// A unique instance of LoginViewModel is provided in Components annotated with @ActivityScope
@ActivityScope
class LoginViewModel @Inject constructor(private val userRepository: UserRepository) {

}