package dc.bmstu.behavioral.pubsub.subscribers

class BadSubscriber : ISubscriber {
    override fun writeComment() {
        println("Subscriber writes negative comment in comment section.")
    }
}

