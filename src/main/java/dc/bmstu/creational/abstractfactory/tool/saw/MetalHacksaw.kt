package dc.bmstu.creational.abstractfactory.tool.saw

class MetalHacksaw : AbstractHacksaw(SAW_TYPE) {
    companion object {
        private const val SAW_TYPE = "Metal"
    }
}

