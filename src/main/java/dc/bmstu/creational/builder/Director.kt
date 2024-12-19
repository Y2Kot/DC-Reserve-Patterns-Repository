package dc.bmstu.creational.builder

import dc.bmstu.creational.builder.builder.IBuilder
import dc.bmstu.creational.builder.component.AirSuspension
import dc.bmstu.creational.builder.component.InternalCombustionEngine
import dc.bmstu.creational.builder.component.SedanBody

class Director(private val builder: IBuilder) {
    fun create(): Car = builder
        .withEngine(InternalCombustionEngine(3.5))
        .build()
}
