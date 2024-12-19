package dc.bmstu.behavioral.chainofresponsibility

import dc.bmstu.behavioral.chainofresponsibility.note.NoteType

abstract class Handler {

    abstract var next: Handler?
    abstract var condition: NoteType

    abstract fun run(): Boolean

    fun add(note: Handler): Boolean {
        return when (next?.condition) {
            is NoteType.Empty -> {
                next = note
                true
            }
            else -> next?.add(note) == true
        }
    }

    fun handle(message: NoteType): Boolean =
        if (condition.note == message.note) {
            run()
        } else {
            next?.handle(message) == true
        }
}

