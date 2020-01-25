package com.shzlabs.mab.ui.base

import androidx.appcompat.app.AppCompatActivity
import com.shzlabs.mab.di.components.AppComponent
import com.shzlabs.mab.BaseApplication

open class BaseActivity: AppCompatActivity() {

    fun getDiComponent() : AppComponent {
        return (application as BaseApplication).appComponent
    }

}