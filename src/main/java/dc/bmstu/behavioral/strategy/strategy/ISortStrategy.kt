package dc.bmstu.behavioral.strategy.strategy

interface ISortStrategy<T> {
    fun sort(numbers: MutableList<T>, order: (T, T) -> Int)
}

