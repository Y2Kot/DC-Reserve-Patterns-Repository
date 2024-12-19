package dc.bmstu.creational.abstractfactory

import dc.bmstu.creational.abstractfactory.factory.MetalFactory
import dc.bmstu.creational.abstractfactory.factory.WoodFactory
import dc.bmstu.creational.abstractfactory.tool.hammer.MetalHammer
import dc.bmstu.creational.abstractfactory.tool.hammer.WoodenHammer
import dc.bmstu.creational.abstractfactory.tool.saw.MetalHacksaw
import dc.bmstu.creational.abstractfactory.tool.saw.WoodHacksaw

fun main() {
    val metalFactory = MetalFactory()
    val metalHammer: MetalHammer = metalFactory.createHammer()
    metalHammer.use()
    val metalHacksaw: MetalHacksaw = metalFactory.createHacksaw()
    metalHacksaw.use()

    val woodFactory = WoodFactory()
    val woodenHammer: WoodenHammer = woodFactory.createHammer()
    woodenHammer.use()
    val woodHacksaw: WoodHacksaw = woodFactory.createHacksaw()
    woodHacksaw.use()
}
