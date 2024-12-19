package dc.bmstu.behavioral.pubsub

import dc.bmstu.behavioral.pubsub.subscribers.ISubscriber

class Publisher {
    private val subs: MutableSet<ISubscriber> = mutableSetOf()

    fun subscribe(subscriber: ISubscriber): Boolean = subs.add(subscriber)

    fun unsubscribe(subscriber: ISubscriber): Boolean = subs.remove(subscriber)

    fun doAction() {
        println("Creating post")
        for (sub in subs)
            sub.writeComment()
    }
}

