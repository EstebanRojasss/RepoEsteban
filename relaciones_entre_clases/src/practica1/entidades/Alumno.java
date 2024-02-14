package practica1.entidades;

public class Alumno {
    private String nombreCompleto;
    private Integer dni;
    private int cantidadDeVotos;

    public Alumno() {

    }

    public Alumno(String nombreCompleto, Integer dni, int cantidadDeVotos) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantidadDeVotos = cantidadDeVotos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public int getCantidadDeVotos() {
        return cantidadDeVotos;
    }

    public void setCantidadDeVotos(int cantidadDeVotos) {
        this.cantidadDeVotos = cantidadDeVotos;
    }

    @Override
    public String toString() {
        return " \nAlumno: " +
                " \nNombre completo: " + nombreCompleto +
                " \nDNI: " + dni +
                " \nCantidad de votos: " + cantidadDeVotos ;
    }
}
