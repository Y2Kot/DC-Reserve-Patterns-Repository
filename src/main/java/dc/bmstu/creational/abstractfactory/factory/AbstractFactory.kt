package dc.bmstu.creational.abstractfactory.factory

import dc.bmstu.creational.abstractfactory.tool.hammer.AbstractHammer
import dc.bmstu.creational.abstractfactory.tool.saw.AbstractHacksaw


interface AbstractFactory {
    fun createHacksaw(): AbstractHacksaw
    fun createHammer(): AbstractHammer
}
