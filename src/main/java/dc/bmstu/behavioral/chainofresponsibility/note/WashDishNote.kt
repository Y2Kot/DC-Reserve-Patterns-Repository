package dc.bmstu.behavioral.chainofresponsibility.note

import dc.bmstu.behavioral.chainofresponsibility.Handler

class WashDishNote() : Handler() {
    override var condition: NoteType = NoteType.Dishes
    override var next: Handler? = EmptyNote()

    override fun run(): Boolean {
        println(condition.note)
        return true
    }
}

