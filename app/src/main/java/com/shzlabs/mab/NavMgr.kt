package com.shzlabs.mab

import com.shzlabs.mab.ui.base.BaseActivity
import com.shzlabs.mab.ui.base.BaseFragment

class NavMgr() {

    fun pushFragment(baseActivity: BaseActivity, baseFragment: BaseFragment) {
        baseActivity
            .supportFragmentManager
            .beginTransaction()
            .addToBackStack("")
            .replace(R.id.content, baseFragment)
            .commit()
    }


    fun pop(baseActivity: BaseActivity): Boolean {

        if (baseActivity.supportFragmentManager.backStackEntryCount <= 1) {
            return false
        }

        baseActivity
            .supportFragmentManager
            .popBackStack()

        return true
    }
}