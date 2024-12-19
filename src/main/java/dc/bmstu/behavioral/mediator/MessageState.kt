package dc.bmstu.behavioral.mediator

import java.time.LocalTime

sealed class MessageState {
    data object Initial: MessageState()
    data class Sent(val timeSent: LocalTime = LocalTime.now()): MessageState()
    data class Received(
        val timeSent: LocalTime,
        val timeReceived: LocalTime = LocalTime.now()
    ): MessageState()
}