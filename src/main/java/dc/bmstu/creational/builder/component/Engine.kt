package dc.bmstu.creational.builder.component

abstract class Engine(val capacity: Double)

class InternalCombustionEngine(capacity: Double) : Engine(capacity)
