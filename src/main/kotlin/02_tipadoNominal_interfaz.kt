interface Programa {
    fun ejecutar()
}

fun correr(programa: Programa) {
    programa.ejecutar()
}

class Saludador : Programa {
    override fun ejecutar() {
        print("¡Hola!")
    }
}

class Conejito {
    private var diasDeVida = 1000

    fun ejecutar() {
        this.diasDeVida = 0
    }
}

fun main() {
    // Esto compila
    correr(Saludador())

    // Esto no
    // correr(Conejito());
}