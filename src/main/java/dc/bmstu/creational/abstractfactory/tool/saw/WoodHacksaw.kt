package dc.bmstu.creational.abstractfactory.tool.saw

class WoodHacksaw : AbstractHacksaw(SAW_TYPE) {
    companion object {
        private const val SAW_TYPE = "Wood"
    }
}

