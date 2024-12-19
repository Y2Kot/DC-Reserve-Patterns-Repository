package dc.bmstu.behavioral.chainofresponsibility

import dc.bmstu.behavioral.chainofresponsibility.note.NoteType
import dc.bmstu.behavioral.chainofresponsibility.note.BuyGroceriesNote
import dc.bmstu.behavioral.chainofresponsibility.note.WashDishNote
import dc.bmstu.behavioral.chainofresponsibility.note.WashFloorNote

fun main() {
    val chain = BuyGroceriesNote()
    chain.add(WashDishNote())
    chain.add(WashFloorNote())

    chain.handle(NoteType.Floor)
}

