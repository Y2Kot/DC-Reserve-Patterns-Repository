package dc.bmstu.creational.factorymethod.factory

import dc.bmstu.creational.factorymethod.car.ICar

abstract class CarFactory {
    abstract fun createCar(): ICar
}
