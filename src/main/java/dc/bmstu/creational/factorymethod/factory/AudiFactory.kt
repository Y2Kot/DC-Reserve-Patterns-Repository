package dc.bmstu.creational.factorymethod.factory

import dc.bmstu.creational.factorymethod.car.Audi

class AudiFactory: CarFactory() {
    override fun createCar(): Audi = Audi()
}
