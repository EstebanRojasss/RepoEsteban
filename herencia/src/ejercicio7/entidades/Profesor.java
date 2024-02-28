package ejercicio7.entidades;

import ejercicio7.enums.CURSOS;
import ejercicio7.enums.ESTADO_CIVIL;

import java.time.LocalDate;

public class Profesor extends Empleado{
    private CURSOS cursos;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, int numId, ESTADO_CIVIL estadoCivil, LocalDate anioIncorporacion, int numeroDespacho, CURSOS cursos) {
        super(nombre, apellido, numId, estadoCivil, anioIncorporacion, numeroDespacho);
        this.cursos = cursos;
    }

    public CURSOS getCursos() {
        return cursos;
    }

    public void setCursos(CURSOS cursos) {
        this.cursos = cursos;
    }
}
