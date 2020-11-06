interface Figura {
    fun area(): Double
}

class Circulo(var radio: Double) : Figura {
    private val pi: Double = 3.14

    override fun area(): Double {
        return pi * radio * radio
    }
}

class Rectangulo(var base: Double, var altura: Double) : Figura {
    override fun area(): Double {
        return base * altura
    }
}


fun main() {
    val circulo = Circulo(5.2)
    println("""El círculo tiene un área de ${circulo.area()}""")
    val rectangulo = Rectangulo(5.0, 4.2)
    println("""El rectángulo tiene un área de ${rectangulo.area()}""")
}