package dc.bmstu.creational.factorymethod.car

interface ICar {
    val model: String
    fun drive()
    fun getDescription(): String
}
