package dc.bmstu.behavioral.strategy.strategy

class InsertionSortStrategy<T> : ISortStrategy<T> {
    override fun sort(numbers: MutableList<T>, order: (T, T) -> Int) {
        val size: Int = numbers.size

        for (i in 1 ..< size) {
            val key: T = numbers[i]
            var j = i - 1

            while (j >= 0 && order(key, numbers[j]) > 0) {
                numbers[j + 1] = numbers[j]
                j -= 1
            }

            numbers[j + 1] = key
        }
    }
}

