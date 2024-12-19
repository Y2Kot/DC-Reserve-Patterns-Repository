package dc.bmstu.behavioral.strategy.strategy

class BubbleSortStrategy<T> : ISortStrategy<T> {
    override fun sort(numbers: MutableList<T>, order: (T, T) -> Int) {
        val size: Int = numbers.size

        for (i in 0..< size - 1) {
            for (j in 0..< size - i - 1) {
                if (order(numbers[j], numbers[j + 1]) > 0) {
                    val temp: T = numbers[j]
                    numbers[j] = numbers[j + 1]
                    numbers[j + 1] = temp
                }
            }
        }
    }
}

