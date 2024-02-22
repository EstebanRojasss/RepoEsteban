package ejercicio4.entidades;

import java.time.LocalDate;

public class AlquilerAmarre {
    private String nombre;
    private int documentoCliente;
    private LocalDate fechaDeAlquiler;
    private LocalDate fechaDevolucion;
    private String posicion;
    private Barco barco;

    public AlquilerAmarre() {
    }

    public AlquilerAmarre(String nombre, int documentoCliente, LocalDate fechaDeAlquiler, LocalDate fechaDevolucion, String posicion, Barco barco) {
        this.nombre = nombre;
        this.documentoCliente = documentoCliente;
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicion = posicion;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(int documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public LocalDate getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(LocalDate fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
}
