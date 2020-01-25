package com.shzlabs.mab

import android.os.Bundle
import android.widget.Toast
import com.shzlabs.mab.ui.base.BaseActivity
import com.shzlabs.mab.ui.home.HomeFragment
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var injected: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NavMgr().pushFragment(this, HomeFragment.newInstance())

        getDiComponent().inject(this)

        if (injected != null) Toast.makeText(this, injected, Toast.LENGTH_LONG).show()
    }

    override fun onBackPressed() {
        if(!NavMgr().pop(this)) {
            finish()
        }
    }
}
