package com.shzlabs.mab

import android.app.Application
import com.shzlabs.mab.di.modules.AppModule
import com.shzlabs.mab.di.components.AppComponent
import com.shzlabs.mab.di.components.DaggerAppComponent

class BaseApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
        appComponent.application(this)
    }

}