package dc.bmstu.creational.abstractfactory.tool.saw

import dc.bmstu.creational.abstractfactory.tool.ITool

abstract class AbstractHacksaw(
    private val type: String,
    private val name: String = SAW_NAME
) : ITool {
    override fun use() {
        println("Instrument: $name can be used for $type")
    }

    companion object {
        protected const val SAW_NAME: String = "Saw"
    }
}

