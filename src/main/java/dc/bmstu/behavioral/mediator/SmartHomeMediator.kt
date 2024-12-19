package dc.bmstu.behavioral.mediator

import dc.bmstu.behavioral.mediator.device.SmartHomeDevice

class SmartHomeMediator {
    private val devices = mutableListOf<SmartHomeDevice>()

    fun add(device: SmartHomeDevice) {
        devices.add(device)
        device.mediator = this
    }

    fun send(message: Message) {
        message.markSent()
        val currentMsgState = message.messageState
        require(currentMsgState is MessageState.Sent)
        println("${message.sender.name} send the message: ${message.content} at time: ${currentMsgState.timeSent}")
        devices
            .filter { smartHomeDevice ->  smartHomeDevice.deviceType == message.recipientType }
            .forEach { smartHomeDevice ->
                message.markReceived()
                smartHomeDevice.receive(message)
            }
    }
}

