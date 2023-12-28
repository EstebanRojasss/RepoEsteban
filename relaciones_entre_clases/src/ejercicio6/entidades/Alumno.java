package ejercicio6.entidades;

import java.util.HashMap;

public class Alumno {
    HashMap<Integer, String> nombreYDni;
    private Integer cantidadVotos;

    public Alumno() {
    }

    public Alumno(HashMap<Integer, String> nombreYDni, Integer cantidadVotos) {
        this.nombreYDni = nombreYDni;
        this.cantidadVotos = cantidadVotos;
    }

    public HashMap<Integer, String> getNombreYDni() {
        return nombreYDni;
    }

    public void setNombreYDni(HashMap<Integer, String> nombreYDni) {
        this.nombreYDni = nombreYDni;
    }

    public Integer getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(Integer cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    @Override
    public String toString() {
        return "Alumno: " +
                " DNI Y NOMBRE: " + nombreYDni +
                ", Cantidad de votos: " + cantidadVotos ;
    }
}
