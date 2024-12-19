package dc.bmstu.behavioral.pubsub.subscribers

class GoodSubscriber : ISubscriber {
    override fun writeComment() {
        println("Subscriber writes positive comment in comment section.")
    }
}

