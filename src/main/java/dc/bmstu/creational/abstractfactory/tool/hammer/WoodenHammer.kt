package dc.bmstu.creational.abstractfactory.tool.hammer

class WoodenHammer : AbstractHammer(HAMMER_TYPE) {
    companion object {
        private const val HAMMER_TYPE = "Wood"
    }
}
