package ejercicio7.entidades;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int numId;
    protected String estadoCivil;

    public Persona() {

    }

    public Persona(String nombre, String apellido, int numId, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numId = numId;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumId() {
        return numId;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
