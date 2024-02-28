package ejercicio7.entidades;

import ejercicio7.enums.ESTADO_CIVIL;
import ejercicio7.enums.SECCION;

import java.time.LocalDate;

public class PersonalDServicio extends Empleado{
    private SECCION secciones;

    public PersonalDServicio() {
    }

    public PersonalDServicio(String nombre, String apellido, int numId, ESTADO_CIVIL estadoCivil, LocalDate anioIncorporacion, int numeroDespacho, SECCION secciones) {
        super(nombre, apellido, numId, estadoCivil, anioIncorporacion, numeroDespacho);
        this.secciones = secciones;
    }

    public SECCION getSecciones() {
        return secciones;
    }

    public void setSecciones(SECCION secciones) {
        this.secciones = secciones;
    }
}
