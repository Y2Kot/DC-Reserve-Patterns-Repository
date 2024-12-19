package dc.bmstu.creational.builder

import dc.bmstu.creational.builder.component.Body
import dc.bmstu.creational.builder.component.Engine
import dc.bmstu.creational.builder.component.Suspension

class Car(
    val body: Body,
    val engine: Engine,
    val suspension: Suspension
)
