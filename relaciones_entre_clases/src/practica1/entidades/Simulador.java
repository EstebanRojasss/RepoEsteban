package practica1.entidades;

import practica1.enums.APELLIDO;
import practica1.enums.NOMBRE;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/*
• La clase Simulador debe tener un método que genere un listado de alumnos
manera aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser
generadas de manera aleatoria. Nota: usar listas de tipo String para generar los
nombres y los apellidos.
• Ahora hacer un generador de combinaciones de DNI posibles, deben estar
dentro de un rango real de números de documentos. Y agregar a los alumnos su
DNI. Este método debe retornar la lista de dnis.
• Ahora tendremos un método que, usando las dos listas generadas, cree una
cantidad de objetos Alumno, elegidos por el usuario, y le asigne los nombres y los
dnis de las dos listas a cada objeto Alumno. No puede haber dos alumnos con el
mismo dni, pero si con el mismo nombre.
• Se debe imprimir por pantalla el listado de alumnos.
• Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como
atributos, un objeto Alumno que será el alumno que vota y una lista de los
alumnos a los que votó.
• Crearemos un método votación en la clase Simulador que, recibe el listado de
alumnos y para cada alumno genera tres votos de manera aleatoria. En este
método debemos guardar a el alumno que vota, a los alumnos a los que votó y
sumarle uno a la cantidad de votos a cada alumno que reciba un voto, que es un
atributo de la clase Alumno.
Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una
vez al mismo alumno. Utilizar un hashset para resolver esto.
• Se debe crear un método que muestre a cada Alumno con su cantidad de votos
y cuales fueron sus 3 votos.
• Se debe crear un método que haga el recuento de votos, este recibe la lista de
Alumnos y comienza a hacer el recuento de votos.
• Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben
crear 5 facilitadores suplentes con los 5 segundos alumnos más votados.
 */
public class Simulador {
    private static ArrayList<String> generarNombre(int cantidadAGenerar) {
        Random random = new Random();
        NOMBRE[] nombres = NOMBRE.values();
        APELLIDO[] apellidos = APELLIDO.values();
        ArrayList<String> nombresAlumnos = new ArrayList<>();
        for (int i = 0; i < cantidadAGenerar; i++) {
            nombresAlumnos.add(i, nombres[random.nextInt(nombres.length)] + " ".concat(String.valueOf(apellidos[random.nextInt(apellidos.length)])));
        }
        return nombresAlumnos;
    }

    private static ArrayList<Integer> generadorDNI(int cantidadAgenerar) {
        ArrayList<Integer> DNIs = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < cantidadAgenerar; i++) {
            DNIs.add(i, random.nextInt(1000000, 7000000));
        }
        return DNIs;
    }

    private static ArrayList<Alumno> generarAlumnos() {
        int cantidadAGenerar = 20;
        ArrayList<String> nombresYApellidos = generarNombre(cantidadAGenerar);
        ArrayList<Integer> dnis = generadorDNI(cantidadAGenerar);
        ArrayList<Alumno> alumnos = new ArrayList<>();
        for (int i = 0; i < cantidadAGenerar; i++) {
            Alumno alumno = new Alumno();
            alumno.setNombreCompleto(nombresYApellidos.get(i));
            alumno.setDni(dnis.get(i));
            alumno.setCantidadDeVotos(0);
            alumnos.add(alumno);
        }
        return alumnos;
    }

    private static void votacion(Voto voto, ArrayList<Alumno> alumnos) {
        Random random = new Random();
        HashSet<Alumno> alumnosVotados = new HashSet<>();
        ArrayList<Alumno> alumnoQueVoto = new ArrayList<>();
        for (int i = 0; i < alumnos.size(); i++) {
            if (!alumnoQueVoto.contains(alumnos.get(i))) {
                voto.setAlumno(alumnos.get(i));
                for (int j = 0; j < 3; j++) {
                    alumnosVotados.add(alumnos.get(random.nextInt(alumnos.size())));
                }
                alumnoQueVoto.add(alumnos.get(i));
                voto.setVotoA(alumnosVotados);
                for (Alumno alumnosVotado : alumnosVotados) {
                    alumnosVotado.setCantidadDeVotos(alumnosVotado.getCantidadDeVotos() + 1);
                }
            }
        }
    }

    public ArrayList<Alumno> simulador() {
        ArrayList<Alumno> alumnos = generarAlumnos();
        Voto voto = new Voto();
        votacion(voto, alumnos);
        return alumnos;
    }

    public void imprimirListaAlumnos(ArrayList<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.print(alumno);
        }
    }


}
