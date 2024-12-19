package dc.bmstu.behavioral.pubsub.subscribers

class NeutralSubscriber : ISubscriber {
    override fun writeComment() {
        println("Subscriber writes nothing.")
    }
}

