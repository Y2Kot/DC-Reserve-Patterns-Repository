package dc.bmstu.behavioral.strategy

import dc.bmstu.behavioral.strategy.strategy.ISortStrategy

class SortManager {
    fun <T> sortArray(
        list: MutableList<T>,
        strategy: ISortStrategy<T>,
        order: (T, T) -> Int
    ) {
        strategy.sort(list, order)
    }
}

