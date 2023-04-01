package com.example.assignment_day1.Observable

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class Observable : BaseObservable() {
    @get:Bindable

    var height: String= ""
        set(value) {
            field = value
            notifyPropertyChanged(androidx.databinding.library.baseAdapters.BR.h)
        }

    @get:Bindable

    var weight : String =""
    set(value) {
        field = value
        notifyPropertyChanged(BR.weight)
    }
}