package dc.bmstu.behavioral.chainofresponsibility.note

import dc.bmstu.behavioral.chainofresponsibility.Handler

class BuyGroceriesNote() : Handler() {
    override var condition: NoteType = NoteType.Groceries
    override var next: Handler? = EmptyNote()

    override fun run(): Boolean {
        println(condition.note)
        return true
    }
}

