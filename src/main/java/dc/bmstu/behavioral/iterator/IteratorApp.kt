package dc.bmstu.behavioral.iterator

import dc.bmstu.behavioral.iterator.ListUtil.reverseIterator

fun main() {
    val digits = listOf(1, 3, 5, 9, 7, 3)
    val iterator = digits.reverseIterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }

    // default iterator
    for (digit in digits) {
        println(digit)
    }
}
