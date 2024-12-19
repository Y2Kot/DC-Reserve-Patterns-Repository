package dc.bmstu.behavioral.chainofresponsibility.note

sealed class NoteType(val note: String) {
    data object Groceries : NoteType("Buy groceries")
    data object Floor : NoteType("Wash the floor until you cry")
    data object Empty : NoteType("")
    data object Dishes : NoteType("Wash the dishes")
}
