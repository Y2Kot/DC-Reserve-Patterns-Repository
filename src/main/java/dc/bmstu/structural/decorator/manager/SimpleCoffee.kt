package dc.bmstu.structural.decorator.manager

class SimpleCoffee : ICoffee {

    override val cost: Int = BASE_COST

    override fun makeCoffee() {
        println("Simple coffee was made.")
    }

    companion object {
        private const val BASE_COST = 5
    }
}

