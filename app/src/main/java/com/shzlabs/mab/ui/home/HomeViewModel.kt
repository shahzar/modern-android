package com.shzlabs.mab.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.shzlabs.mab.data.DataManager
import com.shzlabs.mab.data.model.SampleDataModel
import com.shzlabs.mab.di.components.AppComponent
import com.shzlabs.mab.ui.base.BaseViewModel
import javax.inject.Inject

class HomeViewModel @Inject constructor (val dataManager: DataManager) : BaseViewModel(){

    private val _sampleData = MutableLiveData<SampleDataModel>()

    val sampleData: LiveData<SampleDataModel>
        get() = _sampleData

    fun inject(appComponent: AppComponent) {
        appComponent.inject(this)
    }

    fun getSampleData() {

        ioLaunch(
            block = {
                dataManager.getSampleData()
            },
            onSuccess = {
                _sampleData.value = it
            }
        )

    }

}
