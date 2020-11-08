package com.example.subcomponent_customscopes.dagger.module

import com.example.subcomponent_customscopes.dagger.component.LoginComponent
import dagger.Module

/*
The subcomponent attribute in the @Module annotation tells dagger what Subcomponents are children of the Component this module is included in
 */
@Module(subcomponents = [LoginComponent::class])
class SubComponentModule {
}