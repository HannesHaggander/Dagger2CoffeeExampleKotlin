package com.towerowl.dagger2coffeeexample

import android.util.Log
import javax.inject.Inject

class Thermosiphon
@Inject constructor(val heater : Heater) : Pump  {
    override fun pump() {
        if(heater.isHot()){
            Log.d("Coffee", "=> => pumping => =>")
        }
    }
}