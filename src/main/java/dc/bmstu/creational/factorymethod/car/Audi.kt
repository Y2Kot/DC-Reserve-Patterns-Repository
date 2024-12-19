package dc.bmstu.creational.factorymethod.car

class Audi: ICar {
    override val model: String = "A7"
    override fun drive() {
        println("Rides like an iron")
    }

    override fun getDescription(): String = "Brand: Audi, model: A7, revision: ${this.hashCode()}"
}
