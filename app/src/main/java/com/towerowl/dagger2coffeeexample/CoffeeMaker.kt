package com.towerowl.dagger2coffeeexample

import android.util.Log
import dagger.Lazy
import javax.inject.Inject

class CoffeeMaker
@Inject constructor(val heater: Lazy<Heater>, val pump : Pump) {
    fun brew(){
        heater.get().on()
        pump.pump()
        Log.d("Coffee", " [_]P coffee! [_]P ")
        heater.get().off()
    }
}