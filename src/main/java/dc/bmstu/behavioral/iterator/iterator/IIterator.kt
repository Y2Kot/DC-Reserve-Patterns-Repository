package dc.bmstu.behavioral.iterator.iterator

interface IIterator<T> {
    fun hasNext(): Boolean
    fun next(): T
}

