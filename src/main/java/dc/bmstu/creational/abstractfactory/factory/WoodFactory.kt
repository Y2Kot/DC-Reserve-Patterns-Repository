package dc.bmstu.creational.abstractfactory.factory

import dc.bmstu.creational.abstractfactory.tool.hammer.WoodenHammer
import dc.bmstu.creational.abstractfactory.tool.saw.WoodHacksaw

class WoodFactory : AbstractFactory {
    override fun createHammer(): WoodenHammer {
        return WoodenHammer()
    }

    override fun createHacksaw(): WoodHacksaw {
        return WoodHacksaw()
    }
}
