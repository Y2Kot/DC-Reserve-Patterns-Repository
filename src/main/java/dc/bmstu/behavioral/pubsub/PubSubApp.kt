package dc.bmstu.behavioral.pubsub

import dc.bmstu.behavioral.pubsub.subscribers.BadSubscriber
import dc.bmstu.behavioral.pubsub.subscribers.GoodSubscriber
import dc.bmstu.behavioral.pubsub.subscribers.NeutralSubscriber

fun main() {
    val publisher = Publisher()

    val goodSubscriber = GoodSubscriber()
    val badSubscriber = BadSubscriber()
    val neutralSubscriber = NeutralSubscriber()

    publisher.subscribe(goodSubscriber)
    publisher.subscribe(badSubscriber)
    publisher.subscribe(neutralSubscriber)

    publisher.doAction()

    publisher.unsubscribe(badSubscriber)

    publisher.doAction()
}
