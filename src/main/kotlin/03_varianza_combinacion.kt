interface Printer<in T> {
    fun print(element: T): Unit
}

fun main(args: Array<String>) {
    var fx : (Printer<Any>)    -> Unit = {_ -> }
    var gx : (Printer<String>) -> Unit = {_ -> }

    // Qué tiene que ver ser "in" con todo esto???
    // gx = fx // Falla!
    fx = gx // Funciona: Contravariante de Contravariante.
}
