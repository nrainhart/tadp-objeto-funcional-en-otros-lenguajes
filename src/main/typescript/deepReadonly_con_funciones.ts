export type DeepReadonly<T> = {
    readonly [P in keyof T]: T[P] extends Function ? T[P] : DeepReadonly<T[P]>
}

class Docente {
    nombre: string
}
class Curso {
    docente: Docente
    tieneDocente() { return this.docente != null }
}

// Como readonly es sólo un modificador de tipo no necesito cambiar código
// puedo usar un curso cualquiera y sólo lo "veo" distinto.
let curso: Curso
let cursoDRO: DeepReadonly<Curso> = curso


// cursoDRO.docente.nombre = "Toto" // Que bien! Cascadeo el readonly!
cursoDRO.tieneDocente() // Pero el DeepReadonly no tiene la operación para evaluarse... Que mal!
// Pero qué pasa con los Arrays? ... Y con los Sets?