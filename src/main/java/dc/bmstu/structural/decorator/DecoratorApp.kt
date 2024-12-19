package dc.bmstu.structural.decorator

import dc.bmstu.structural.decorator.decorator.MilkDecorator
import dc.bmstu.structural.decorator.decorator.SugarDecorator
import dc.bmstu.structural.decorator.manager.ICoffee
import dc.bmstu.structural.decorator.manager.SimpleCoffee

fun main() {
    val simpleCoffee: ICoffee = SimpleCoffee()
    simpleCoffee.makeCoffee()
    println("Current cost of coffee is: ${simpleCoffee.cost}")

    val milkCoffee: ICoffee = MilkDecorator(simpleCoffee)
    milkCoffee.makeCoffee()
    println("Current cost of coffee is: ${milkCoffee.cost}")

    val milkAndSugarCoffee: ICoffee = SugarDecorator(milkCoffee)
    milkAndSugarCoffee.makeCoffee()
    println("Current cost of coffee is: ${milkAndSugarCoffee.cost}")
}

