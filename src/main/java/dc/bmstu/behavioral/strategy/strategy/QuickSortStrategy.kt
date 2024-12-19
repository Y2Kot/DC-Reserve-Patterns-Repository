package dc.bmstu.behavioral.strategy.strategy

class QuickSortStrategy<T> : ISortStrategy<T> {
    override fun sort(numbers: MutableList<T>, order: (T, T) -> Int) {
        numbers.sortWith(order)
    }
}

