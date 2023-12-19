package ejercicio3.enums;

public enum Palo {
    COPA(1),
    ESPADA(2),
    BASTO(3),
    ORO(4);
    final int numero;

    Palo(int numero) {
        this.numero = numero;
    }

}
