package dc.bmstu.behavioral.iterator.iterator

class ReverseIterator<T>(private val collection: List<T>) : IIterator<T> {
    private var currentIndex: Int = collection.size - 1

    override fun hasNext(): Boolean = currentIndex >= 0

    override fun next(): T {
        val item = collection[currentIndex--]
        return item
    }
}

