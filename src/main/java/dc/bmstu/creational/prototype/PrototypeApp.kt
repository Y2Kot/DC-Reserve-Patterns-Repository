package dc.bmstu.creational.prototype

fun main() {
    // Kotlin
    val myCandy = Candy("Mishka","delicious", "Noname")
    val sistersCandy = myCandy.copy()

    println("Is candies equals: ${myCandy == sistersCandy}")
    println("My candy: ${System.identityHashCode(myCandy)}")
    println("Sisters candy: ${System.identityHashCode(sistersCandy)}")

    println("---------")

    // Java
    val myJavaCandy = CandyJava("Kitty","delicious", "Well known")
    val brothersJavaCandy = myJavaCandy.clone()

    println("Is java candies equals: ${myJavaCandy == brothersJavaCandy}")
    println("My java candy: ${System.identityHashCode(myJavaCandy)}")
    println("Brothers java candy: ${System.identityHashCode(brothersJavaCandy)}")
}
