package ejercicio7.entidades;

import ejercicio7.enums.ESTADO_CIVIL;
import ejercicio7.enums.SECCION;

import java.time.LocalDate;

public class PersonalDServicio extends Empleado{
    private SECCION seccion;

    public PersonalDServicio() {
    }

    public PersonalDServicio(String nombre, String apellido, int numId, ESTADO_CIVIL estadoCivil, LocalDate anioIncorporacion, int numeroDespacho, SECCION seccion) {
        super(nombre, apellido, numId, estadoCivil, anioIncorporacion, numeroDespacho);
        this.seccion = seccion;
    }

    public SECCION getSeccion() {
        return seccion;
    }

    public void setSeccion(SECCION seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "PersonalDeServicio " +
                "\nNombre: " + nombre +
                "\nApellido: " + apellido +
                "\nNumero Id: " + numId +
                "\nEstado Civil: " + estadoCivil +
                "\nSeccion: " + seccion +
                "\nAnho de incorporacion: " + anioIncorporacion +
                "\nNumero de despacho: " + numeroDespacho ;
    }
}
