package dc.bmstu.creational.builder.builder

import dc.bmstu.creational.builder.Car
import dc.bmstu.creational.builder.component.Body
import dc.bmstu.creational.builder.component.Engine
import dc.bmstu.creational.builder.component.Suspension

interface IBuilder {
    fun withBody(body: Body): IBuilder
    fun withEngine(engine: Engine): IBuilder
    fun withSuspension(suspension: Suspension): IBuilder
    fun build(): Car
}
