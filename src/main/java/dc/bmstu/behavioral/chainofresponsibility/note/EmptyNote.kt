package dc.bmstu.behavioral.chainofresponsibility.note

import dc.bmstu.behavioral.chainofresponsibility.Handler

class EmptyNote() : Handler() {
    override var condition: NoteType = NoteType.Empty
    override var next: Handler? = null

    override fun run(): Boolean {
        println(condition.note)
        return true
    }
}

