package dc.bmstu.structural.adapter.thermometer

class CelsiusThermometer : IThermometer {
    override val temperature: Double = DEFAULT_TEMPERATURE

    companion object {
        private const val DEFAULT_TEMPERATURE: Double = 15.0
    }


}

