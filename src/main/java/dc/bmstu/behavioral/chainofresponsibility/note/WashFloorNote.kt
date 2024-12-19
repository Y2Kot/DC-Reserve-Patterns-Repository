package dc.bmstu.behavioral.chainofresponsibility.note

import dc.bmstu.behavioral.chainofresponsibility.Handler

class WashFloorNote() : Handler() {
    override var condition: NoteType = NoteType.Floor
    override var next: Handler? = EmptyNote()

    override fun run(): Boolean {
        println(condition.note)
        return true
    }
}

