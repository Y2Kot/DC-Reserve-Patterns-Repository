package dc.bmstu.creational.builder.builder

import dc.bmstu.creational.builder.Car
import dc.bmstu.creational.builder.component.AirSuspension
import dc.bmstu.creational.builder.component.Body
import dc.bmstu.creational.builder.component.Engine
import dc.bmstu.creational.builder.component.InternalCombustionEngine
import dc.bmstu.creational.builder.component.SedanBody
import dc.bmstu.creational.builder.component.Suspension

class CamryBuilder : IBuilder {
    private var body: Body = SedanBody("sedan")
    private var engine: Engine = InternalCombustionEngine(2.5)
    private var suspension: Suspension = AirSuspension("mono-cylinder")

    override fun withBody(body: Body): CamryBuilder {
        this.body = body
        return this
    }

    override fun withEngine(engine: Engine): CamryBuilder {
        this.engine = engine
        return this
    }

    override fun withSuspension(suspension: Suspension): CamryBuilder {
        this.suspension = suspension
        return this
    }

    override fun build(): Car {
        return Car(
            body = body,
            engine = engine,
            suspension = suspension,
        )
    }
}
