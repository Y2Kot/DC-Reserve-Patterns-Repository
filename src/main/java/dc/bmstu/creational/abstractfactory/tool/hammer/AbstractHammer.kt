package dc.bmstu.creational.abstractfactory.tool.hammer

import dc.bmstu.creational.abstractfactory.tool.ITool

abstract class AbstractHammer(
    private val type: String,
    private val name: String = HAMMER_NAME
) : ITool {
    override fun use() {
        println("Instrument: $name can be used for $type")
    }

    companion object {
        protected const val HAMMER_NAME: String = "Hammer"
    }
}


