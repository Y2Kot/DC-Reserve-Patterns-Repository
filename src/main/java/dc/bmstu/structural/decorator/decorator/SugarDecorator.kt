package dc.bmstu.structural.decorator.decorator

import dc.bmstu.structural.decorator.manager.ICoffee

class SugarDecorator(coffee: ICoffee) : CoffeeDecorator(coffee) {

    override val cost: Int = super.cost + SUGAR_COST

    override fun makeCoffee() {
        println("Sugar was added.")
    }

    companion object {
        private const val SUGAR_COST = 1
    }
}

