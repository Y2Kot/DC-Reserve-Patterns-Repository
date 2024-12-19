package dc.bmstu.structural.adapter

import dc.bmstu.structural.adapter.adapter.FahrenheitTempAdapter
import dc.bmstu.structural.adapter.adapter.ITempAdapter
import dc.bmstu.structural.adapter.thermometer.CelsiusThermometer
import dc.bmstu.structural.adapter.thermometer.IThermometer

fun main() {
    val thermometer: IThermometer = CelsiusThermometer()
    println("Temperature in celsius: ${thermometer.temperature}")
    val adapter: ITempAdapter = FahrenheitTempAdapter(thermometer)
    println("Temperature in fahrenheit: ${adapter.temperature}")
}
