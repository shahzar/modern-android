package com.shzlabs.mab.di.components

import android.app.Application
import com.shzlabs.mab.di.ViewModelBuilder
import com.shzlabs.mab.di.modules.AppModule
import com.shzlabs.mab.di.modules.NetworkModule
import com.shzlabs.mab.ui.home.HomeFragment
import com.shzlabs.mab.ui.home.HomeViewModel
import com.shzlabs.mab.MainActivity
import dagger.Component

@Component(modules = [AppModule::class, NetworkModule::class, ViewModelBuilder::class])
interface AppComponent {

    fun application(application: Application)
    fun inject(mainActivity: MainActivity)
    fun inject(homeFragment: HomeFragment)
    fun inject(homeViewModel: HomeViewModel)

}