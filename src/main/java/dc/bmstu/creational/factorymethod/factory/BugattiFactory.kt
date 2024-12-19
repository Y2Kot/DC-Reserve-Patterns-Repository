package dc.bmstu.creational.factorymethod.factory

import dc.bmstu.creational.factorymethod.car.Bugatti

class BugattiFactory : CarFactory() {
    override fun createCar(): Bugatti {
        class ConcreteBugatti : Bugatti()
        return ConcreteBugatti()
    }
}
