package dc.bmstu.creational.builder.component

abstract class Body(val bodyType: String)

class SedanBody(bodyType: String) : Body(bodyType)
