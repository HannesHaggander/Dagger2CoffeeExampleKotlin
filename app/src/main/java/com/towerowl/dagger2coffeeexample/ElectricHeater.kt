package com.towerowl.dagger2coffeeexample

import android.util.Log

class ElectricHeater : Heater {

    var heating = false

    override fun on() {
        Log.d("Coffee", "~ ~ ~ heating ~ ~ ~")
        heating = true
    }

    override fun off() {
        heating = false
    }

    override fun isHot(): Boolean {
        return heating
    }

}