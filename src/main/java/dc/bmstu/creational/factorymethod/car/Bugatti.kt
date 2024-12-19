package dc.bmstu.creational.factorymethod.car

open class Bugatti protected constructor(): ICar {
    override val model: String = "Chiron"

    override fun drive() {
        println("Drive like a boss")
    }

    override fun getDescription(): String = "Brand: Bugatti, model: Chiron, revision: ${this.hashCode()}"
}
