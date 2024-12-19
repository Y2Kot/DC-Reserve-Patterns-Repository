package dc.bmstu.creational.abstractfactory.factory

import dc.bmstu.creational.abstractfactory.tool.hammer.MetalHammer
import dc.bmstu.creational.abstractfactory.tool.saw.MetalHacksaw


class MetalFactory : AbstractFactory {
    override fun createHammer(): MetalHammer {
        return MetalHammer()
    }

    override fun createHacksaw(): MetalHacksaw {
        return MetalHacksaw()
    }
}

