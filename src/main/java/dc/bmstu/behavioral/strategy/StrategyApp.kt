package dc.bmstu.behavioral.strategy

import dc.bmstu.behavioral.strategy.strategy.BubbleSortStrategy
import dc.bmstu.behavioral.strategy.strategy.InsertionSortStrategy
import dc.bmstu.behavioral.strategy.strategy.QuickSortStrategy

fun main() {
    val nums1 = mutableListOf(3, 1, -2, 7, 19, -12)
    val nums2 = mutableListOf(3.2, 5.6, 1.2, 7.8)
    val nums3 = mutableListOf(2, 6, -1, 0, 5)
    val str = mutableListOf("some", "values", "from", "words", "dictionary")

    val sortManager = SortManager()

    sortManager.sortArray(nums1, BubbleSortStrategy()) { a: Int, b: Int -> a - b }
    println("Bubble sort integer: $nums1")

    sortManager.sortArray(nums2, QuickSortStrategy()) { a: Double, b: Double -> a.compareTo(b) }
    println("Quick sort double: $nums2")

    sortManager.sortArray(nums3, QuickSortStrategy()) { a: Int, b: Int -> a.compareTo(b) }
    println("Quick sort integer: $nums3")

    sortManager.sortArray(str, InsertionSortStrategy()) { a, b -> b.compareTo(a) }
    println("Insertion sort strings: $str")
}

