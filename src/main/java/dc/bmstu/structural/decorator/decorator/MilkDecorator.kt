package dc.bmstu.structural.decorator.decorator

import dc.bmstu.structural.decorator.manager.ICoffee

class MilkDecorator(coffee: ICoffee) : CoffeeDecorator(coffee) {

    override val cost: Int = super.cost + MILK_COST

    override fun makeCoffee() {
        println("Milk was added.")
    }

    companion object {
        private const val MILK_COST = 2
    }
}

