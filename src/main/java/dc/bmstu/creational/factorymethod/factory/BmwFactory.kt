package dc.bmstu.creational.factorymethod.factory

import dc.bmstu.creational.factorymethod.car.Bmw

class BmwFactory: CarFactory() {
    override fun createCar(): Bmw {
        return Bmw()
    }
}
