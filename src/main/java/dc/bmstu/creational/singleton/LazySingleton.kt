package dc.bmstu.creational.singleton

object LazySingleton {
    val lazyField: Teacher by lazy(LazyThreadSafetyMode.PUBLICATION) {
        Teacher(name = "Ivan", surname = "Ivanov")
    }
}
