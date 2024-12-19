package dc.bmstu.creational.abstractfactory.tool.hammer

class MetalHammer : AbstractHammer(HAMMER_TYPE) {
    companion object {
        private const val HAMMER_TYPE = "Metal"
    }
}

