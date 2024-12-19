package dc.bmstu.creational.factorymethod

import dc.bmstu.creational.factorymethod.car.Audi
import dc.bmstu.creational.factorymethod.car.Bmw
import dc.bmstu.creational.factorymethod.car.Bugatti
import dc.bmstu.creational.factorymethod.factory.AudiFactory
import dc.bmstu.creational.factorymethod.factory.BmwFactory
import dc.bmstu.creational.factorymethod.factory.BugattiFactory
import dc.bmstu.creational.factorymethod.factory.CarFactory

fun main() {
    val audi = Audi() // можно создавать объект там где необходимо
    val audiFactory: CarFactory = AudiFactory()
    val audi1 = audiFactory.createCar()
    println(audi1.getDescription())
    audi1.drive()

    val audi2 = audiFactory.createCar()
    println(audi2.getDescription())
    audi2.drive()

    val bmw = Bmw() // можно создавать объект там где необходимо
    val bmwFactory: CarFactory = BmwFactory()
    val bmw1 = bmwFactory.createCar()
    println(bmw1.getDescription())
    bmw1.drive()

//    val bugatti = Bugatti() // ошибка компиляции, нельзя вызвать protected constructor
    val bugattiFactory = BugattiFactory()
    val bugatti1: Bugatti = bugattiFactory.createCar()
    println(bugatti1.getDescription())
    bugatti1.drive()

    val bugatti2: Bugatti = bugattiFactory.createCar()
    println(bugatti2.getDescription())
    bugatti2.drive()
}
