package dc.bmstu.behavioral.mediator

import dc.bmstu.behavioral.mediator.device.DeviceType
import dc.bmstu.behavioral.mediator.device.SmartCoffeeMachine
import dc.bmstu.behavioral.mediator.device.SmartLight
import dc.bmstu.behavioral.mediator.device.SmartTv

fun main() {
    val smartCoffeeMachine = SmartCoffeeMachine("Coffee Machine")
    val smartLivingRoomLight = SmartLight("Living Room Light")
    val smartKitchenLight1 = SmartLight("Kitchen Light1")
    val smartKitchenLight2 = SmartLight("Kitchen Light2")
    val smartHallwayLight = SmartLight("Hallway Light")
    val smartTV = SmartTv("Living Room TV")

    println("The owner of the house is back!")
    val houseMediator = SmartHomeMediator()
    houseMediator.add(smartHallwayLight)
    houseMediator.add(smartKitchenLight1)
    houseMediator.add(smartKitchenLight2)
    houseMediator.add(smartLivingRoomLight)
    houseMediator.add(smartCoffeeMachine)
    houseMediator.add(smartTV)

    smartHallwayLight.send(Message(smartHallwayLight, DeviceType.TV, "Set light on in house!"))
    smartKitchenLight1.send(Message(smartKitchenLight1, DeviceType.COFFEE_MACHINE, "Set light on! Let's make coffee"))

    val list = listOf(1, 2, 3)
    list.indexOf(1)
}

