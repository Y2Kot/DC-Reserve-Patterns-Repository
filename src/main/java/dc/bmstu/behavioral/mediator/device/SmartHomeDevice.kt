package dc.bmstu.behavioral.mediator.device

import dc.bmstu.behavioral.mediator.Message
import dc.bmstu.behavioral.mediator.SmartHomeMediator

abstract class SmartHomeDevice(val name: String) {
    abstract val deviceType: DeviceType
    var mediator: SmartHomeMediator? = null

    abstract fun send(message: Message)
    abstract fun receive(message: Message)
}

