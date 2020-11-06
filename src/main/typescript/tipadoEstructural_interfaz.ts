interface Programa {
    ejecutar(): void
}

function correr(programa: Programa) {
    programa.ejecutar();
}

class Saludador implements Programa {
    ejecutar() {
        console.log('¡Hola!');
    }
}

// Esto compila
correr(new Saludador());



class Conejito {
    private diasDeVida = 1000;

    ejecutar() {
        this.diasDeVida = 0;
    }
}

// ¡Esto también!
correr(new Conejito());

// $ node_modules/.bin/ts-node tipadoEstructural_interfaz.ts