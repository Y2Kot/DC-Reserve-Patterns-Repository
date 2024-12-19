package dc.bmstu.creational.factorymethod.car

class Bmw: ICar {
    override val model: String = "3 series"

    override fun drive() {
        println("No one knows when the driver will change lanes")
    }

    override fun getDescription(): String = "Brand: Bmw, model: 3 series, revision: ${this.hashCode()}"
}
