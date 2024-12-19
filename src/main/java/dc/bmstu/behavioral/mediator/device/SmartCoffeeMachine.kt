package dc.bmstu.behavioral.mediator.device

import dc.bmstu.behavioral.mediator.Message
import dc.bmstu.behavioral.mediator.MessageState

class SmartCoffeeMachine(name: String) : SmartHomeDevice(name) {
    override val deviceType: DeviceType = DeviceType.COFFEE_MACHINE

    override fun send(message: Message) {
        mediator?.send(message) ?: println("Device $name is not tied to the mediator.")
    }

    override fun receive(message: Message) {
        val currentMsgState = message.messageState
        require(currentMsgState is MessageState.Received) // smart cast to Received
        println("$name receive the message: ${message.content} at time: ${currentMsgState.timeReceived}")
    }
}

