package dc.bmstu.behavioral.iterator

import dc.bmstu.behavioral.iterator.iterator.ReverseIterator

object ListUtil {
    fun <T>List<T>.reverseIterator(): ReverseIterator<T> = ReverseIterator(this)
}
