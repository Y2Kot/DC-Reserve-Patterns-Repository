package dc.bmstu.structural.decorator.decorator

import dc.bmstu.structural.decorator.manager.ICoffee

abstract class CoffeeDecorator(private val coffee: ICoffee) : ICoffee {

    override val cost: Int = coffee.cost

    override fun makeCoffee() {
        coffee.makeCoffee()
    }
}


