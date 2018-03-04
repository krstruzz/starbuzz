package com.struzzwebsolutions.starbuzz

/**
 * Created by keith on 3/3/18.
 */

class Drink (var name: String, var description: String, var imageResourceId: Int) {
    //Each drink has a name, description, and an image resource

    //drinks is an array of Drinks
    val drinks: Array<Drink> = arrayOf(
        Drink(
                "Latte",
                "A couple of espresso shots with steamed milk",
                R.drawable.latte
        ),
        Drink(
                "Cappuccino",
                "Espresso, hot milk, and a steamed milk foam",
                R.drawable.cappuccino
        ),
        Drink(
                "Filter",
                "Highest quality beans roasted and brewed fresh",
                R.drawable.filter
        )
    )
}