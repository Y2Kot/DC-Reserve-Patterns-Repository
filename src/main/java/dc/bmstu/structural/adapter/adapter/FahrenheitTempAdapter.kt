package dc.bmstu.structural.adapter.adapter

import dc.bmstu.structural.adapter.thermometer.IThermometer

class FahrenheitTempAdapter(
    private val thermometer: IThermometer
) : ITempAdapter {
    override val temperature: Double = thermometer.temperature * FACTOR + LINEAR_COEFFICIENT

    companion object {
        private const val FACTOR = 1.8
        private const val LINEAR_COEFFICIENT = 32.0
    }
}

