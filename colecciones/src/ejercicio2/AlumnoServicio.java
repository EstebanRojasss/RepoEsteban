package ejercicio2;
/*
Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
de tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Despues de ese bluce tendremos el siguiente método en la clase Alumno:
Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
método. Dentro del método se usará la lista notas para calcular el promedio final
de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
main.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoServicio {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    protected ArrayList<Alumno> crearAlumno() {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        int nota;
        String resp;
        boolean salirDelBucle = false;
        do {
            Alumno alumno = new Alumno();
            System.out.println("Ingrese su nombre: ");
            alumno.setNombre(sc.next());
            alumno.setNotas(new ArrayList<>());
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota: " + (i + 1));
                nota = sc.nextInt();
                alumno.getNotas().add(i, nota);
            }
            alumno.setNotas(alumno.getNotas());
            alumnos.add(alumno);
            System.out.println("Desea ingresar otro alumno: S/N");
            resp = sc.next();
            if (resp.equalsIgnoreCase("N")) {
                salirDelBucle = true;
            }
        } while (!salirDelBucle);
        return alumnos;
    }

    protected void notaFinal(ArrayList<Alumno> alumnos) {
        boolean buscarAlumno = true;
        do {
            System.out.println("Ingrese el nombre del alumno: ");
            String nombre = sc.next();
            float promedio;
            Iterator<Alumno> iterator = alumnos.iterator();
            while (iterator.hasNext()) {
                Alumno alumno = iterator.next();
                if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                    int sumaNotas = 0;
                    for (int i = 0; i < 3; i++) {
                        sumaNotas += alumno.getNotas().get(i);
                    }
                    promedio = (float) sumaNotas / 3;
                    System.out.println("El promedio del alumno " + alumno.getNombre() + " es: " + promedio);
                }
            }
            System.out.println("Desea buscar otro alumno S/N");
            String resp = sc.next();
            if (resp.equalsIgnoreCase("N")) {
                buscarAlumno = false;
            }
        } while (buscarAlumno);
    }
}
