package dc.bmstu.structural.proxy

class HashMapProxy<K, V>(
    private val hashMap: MutableMap<K, V>
) : MutableMap<K, V> by hashMap {
    override fun get(key: K): V? {
        val result = hashMap[key]
        if (result == null)
            println("No value under this key found.")
        return result
    }

    override fun put(key: K, value: V): V? {
        val result = hashMap.put(key, value)
        if (result == null)
            println("Value successfully added. No previous values under this key.")
        return result
    }
}
