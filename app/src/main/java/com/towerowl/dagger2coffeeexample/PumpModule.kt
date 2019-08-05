package com.towerowl.dagger2coffeeexample

import dagger.Binds
import dagger.Module

@Module
abstract class PumpModule {
    @Binds
    abstract fun providePump(pump : Thermosiphon) : Pump
}