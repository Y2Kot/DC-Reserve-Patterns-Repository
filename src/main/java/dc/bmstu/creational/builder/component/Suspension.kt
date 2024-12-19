package dc.bmstu.creational.builder.component

abstract class Suspension(val type: String)

class AirSuspension(type: String): Suspension(type)
