package practica1.entidades;

import java.util.ArrayList;
import java.util.HashSet;

/*
 Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como
atributos, un objeto Alumno que será el alumno que vota y una lista de los
alumnos a los que votó.
 */
public class Voto {
    private Alumno alumno;
    private HashSet<Alumno>votoA;

    public Voto() {

    }

    public Voto(Alumno alumno, HashSet<Alumno> votoA) {
        this.alumno = alumno;
        this.votoA = votoA;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public HashSet<Alumno> getVotoA() {
        return votoA;
    }

    public void setVotoA(HashSet<Alumno> votoA) {
        this.votoA = votoA;
    }

}
