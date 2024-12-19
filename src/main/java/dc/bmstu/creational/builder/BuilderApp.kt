package dc.bmstu.creational.builder

import dc.bmstu.creational.builder.builder.CamryBuilder

fun main() {
    val director = Director(CamryBuilder())
    val camry = director.create()

    println(
        "Director created camry! " +
                "Body: ${camry.body.bodyType}, " +
                "engine: ${camry.engine.capacity}, " +
                "suspension: ${camry.suspension.type}"
    )
}
