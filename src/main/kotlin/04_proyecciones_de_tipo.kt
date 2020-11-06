class Caja<T>(var contenido: T) {
    fun copiar1(otro: Caja<T>){
        this.contenido = otro.contenido
        // otro.contenido = this.contenido // Acá podríamos asignar el contenido de otro sin problemas
    }

    fun copiar2(otro: Caja<out T>){
        this.contenido = otro.contenido
        // otro.contenido = this.contenido // El compilador va a fallar si queremos hacer esto, porque otro es covariante
    }
}

fun main(args: Array<String>) {
    val a: Caja<Any> = Caja(7)
    val b: Caja<Int> = Caja(5)

    //a.copiar1(b) // Falla porque a y b tienen distinto tipo
    a.copiar2(b) // Pero si forzamos el parámetro covariante funciona!
}
