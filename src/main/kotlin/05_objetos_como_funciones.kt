fun f(n: Int) = n + 1

object g {
    operator fun invoke(n: Int): Int = n + 1
}

fun main(args: Array<String>) {
    var aplicable: (Int) -> Int

    aplicable = ::f
    // aplicable = g    // Esto no funciona... g no es una función como en Scala.

    // Pero puedo hacerlo así.
    aplicable = object : (Int) -> Int {
        override operator fun invoke(n: Int): Int = n + 1
    }

    aplicable(5)
}