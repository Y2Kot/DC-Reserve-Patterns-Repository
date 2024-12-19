package dc.bmstu.creational.singleton

fun main() {
    val single1 = Singleton
    val single2 = Singleton
    println("Are the same object: ${single1 == single2}")

    val single3 = LazySingleton.lazyField
    val single4 = LazySingleton.lazyField

    println("Are the same object: ${single3.name == single4.name && single3.surname == single4.surname}")
}