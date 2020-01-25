package com.shzlabs.mab.ui.base

import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.shzlabs.mab.di.components.AppComponent
import com.shzlabs.mab.ui.base.BaseActivity

open class BaseFragment: Fragment() {

    fun getDiComponent() : AppComponent {
        return (activity as BaseActivity).getDiComponent()
    }

    fun showError(view: View, msg: String) {
        Snackbar.make(view, msg, Snackbar.LENGTH_LONG).show()
    }

}