package ejercicio7.entidades;

import ejercicio7.enums.CURSOS;
import ejercicio7.enums.ESTADO_CIVIL;

public class Estudiante extends Persona{
    private CURSOS curso;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, int numId, ESTADO_CIVIL estadoCivil, CURSOS curso) {
        super(nombre, apellido, numId, estadoCivil);
        this.curso = curso;
    }

    public CURSOS getCurso() {
        return curso;
    }

    public void setCurso(CURSOS curso) {
        this.curso = curso;
    }
}
