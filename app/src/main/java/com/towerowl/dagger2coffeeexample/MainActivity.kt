package com.towerowl.dagger2coffeeexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.Component
import javax.inject.Singleton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerCoffeeShop.builder()
            .build()
            .make()
            .brew()
    }
}

@Singleton
@Component(modules = [DripCoffeeModule::class])
interface CoffeeShop {
    fun make() : CoffeeMaker
}
