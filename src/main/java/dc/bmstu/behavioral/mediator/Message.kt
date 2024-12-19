package dc.bmstu.behavioral.mediator

import dc.bmstu.behavioral.mediator.device.DeviceType
import dc.bmstu.behavioral.mediator.device.SmartHomeDevice

class Message(
    val sender: SmartHomeDevice,
    val recipientType: DeviceType,
    val content: String
) {
    private var _messageState: MessageState = MessageState.Initial
    val messageState: MessageState
        get() = _messageState

    fun markSent() {
        val currentState = messageState
        if (currentState is MessageState.Initial) {
            _messageState = MessageState.Sent()
        } else {
            error("Illegal state for sending message: $currentState")
        }
    }

    fun markReceived() {
        val currentState = messageState
        if (currentState is MessageState.Sent) {
            _messageState = MessageState.Received(
                timeSent = currentState.timeSent
            )
        } else {
            error("Illegal state for receiving message: $currentState")
        }
    }
}

