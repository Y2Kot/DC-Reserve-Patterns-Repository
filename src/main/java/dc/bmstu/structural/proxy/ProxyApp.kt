package dc.bmstu.structural.proxy

private const val TEST_KEY = "Zero"
private const val TEST_EXCEPTION_KEY = "One"
private const val EXCEPTION_DESCRIPTION = "No such key or value under this key"
private const val TEST_VALUE = 56

fun main() {
    val hashMap = mutableMapOf<String, Int>()
    val proxy: MutableMap<String, Int> = HashMapProxy(hashMap)

    println("Is has map empty: ${proxy.isEmpty()}")
    proxy.put(TEST_KEY, TEST_VALUE)

    try {
        println("Trying to get value: ${proxy.get(TEST_EXCEPTION_KEY)}")
    } catch (e: NullPointerException) {
        println(EXCEPTION_DESCRIPTION)
    }

    println("Is hash map contains key = ${TEST_KEY} : ${proxy.containsKey(TEST_KEY)}")
    println("Is hash map contains value = $TEST_VALUE : ${proxy.containsValue(TEST_VALUE)}")
}

