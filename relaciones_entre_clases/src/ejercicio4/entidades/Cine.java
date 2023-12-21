package ejercicio4.entidades;

public class Cine {
    private Sala sala;

    public Cine() {

    }

    public Cine(Sala sala) {
        this.sala = sala;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
