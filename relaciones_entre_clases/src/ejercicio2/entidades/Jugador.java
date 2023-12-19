package ejercicio2.entidades;



public class Jugador {
    private long id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(long id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre + id;
        this.mojado = mojado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }


    protected void disparoRevolver(RevolverDeAgua revolverDeAgua) {
        this.mojado = revolverDeAgua.mojar();
        revolverDeAgua.siguienteChorro();
    }

    @Override
    public String toString() {
        return ""+
                "\nnombre: " + nombre +
                " ,mojado: " + mojado;

    }

}
