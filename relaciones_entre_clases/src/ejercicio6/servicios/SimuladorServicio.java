package ejercicio6.servicios;

import ejercicio6.entidades.Alumno;
import ejercicio6.entidades.Voto;
import ejercicio6.enums.APELLIDO;
import ejercicio6.enums.NOMBRE;

import java.util.*;

public class SimuladorServicio {

    private static ArrayList<String> generarNombres() {
        Random random = new Random();
        NOMBRE[] nombres = NOMBRE.values();
        APELLIDO[] apellidos = APELLIDO.values();
        ArrayList<String> nombreAlumnos = new ArrayList<>();
        nombreAlumnos.add(nombres[random.nextInt(nombres.length)] + " ".concat(String.valueOf(apellidos[random.nextInt(apellidos.length)])));
        return nombreAlumnos;
    }

    private static ArrayList<Integer> generarDnis() {
        Random random = new Random();
        int numero = random.nextInt(30124);
        ArrayList<Integer> dnis = new ArrayList<>();
        dnis.add(numero * random.nextInt(1, 3));
        return dnis;
    }

    private static Alumno generarAlumno() {
        Random random = new Random();
        Alumno alumno = new Alumno();
        ArrayList<Integer> dnis = generarDnis();
        ArrayList<String> nombres = generarNombres();
        HashMap<Integer, String> nombresYDni = new HashMap<>();
        nombresYDni.put(dnis.get(random.nextInt(dnis.size())), nombres.get(random.nextInt(nombres.size())));
        alumno.setNombreYDni(nombresYDni);
        alumno.setCantidadVotos(0);
        return alumno;
    }

    public ArrayList<Alumno> listaAlumnos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos que desea generar: ");
        int cantidadAlumnos = sc.nextInt();
        ArrayList<Alumno> alumnos = new ArrayList<>();
        for (int i = 0; i < cantidadAlumnos; i++) {
            alumnos.add(generarAlumno());
        }
        return alumnos;
    }

    public void votacion(ArrayList<Alumno> alummnos) {
        Random random = new Random();
        Voto voto = new Voto();

        for (int i = 0; i < alummnos.size(); i++) {
            voto.setAlumno(alummnos.get(i));
            ArrayList<Alumno> alumnosVotados = new ArrayList<>();
            do {
                alumnosVotados.add(alummnos.get(random.nextInt(alummnos.size())));
            } while (!alumnosVotados.contains(alummnos.get(i)) && alumnosVotados.size() <= 3);
            voto.setAlumnosVotados(alumnosVotados);
            sumarVotos(voto);
        }
        recuentoDeVotos(alummnos);
        mostrarListado(alummnos);
    }

    private static void sumarVotos(Voto voto) {
        for (int i = 0; i < voto.getAlumnosVotados().size(); i++) {
            voto.getAlumnosVotados().get(i).setCantidadVotos(voto.getAlumnosVotados().get(i).getCantidadVotos() + 1);
        }
    }

    private static void recuentoDeVotos(ArrayList<Alumno> alumnos) {
        alumnos.sort(mayorAMenorVotado);
        ArrayList<Alumno> facilitadoresPrimeros = new ArrayList<>();
        ArrayList<Alumno>facilitadoresSegundos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            facilitadoresPrimeros.add(alumnos.get(i));
            if(i == 4){
                int k = i + 1;
                while(k < 10){
                    facilitadoresSegundos.add(alumnos.get(k));
                    k++;
                }
            }
        }

        System.out.println("Primeros 5 facilitadores: ");
        for (Alumno alumno : facilitadoresPrimeros) {
            System.out.println(alumno);
        }
        System.out.println(" ");
        System.out.println("Primeros 5 facilitadores suplentes: ");
        for (Alumno alumno : facilitadoresSegundos) {
            System.out.println(alumno);
        }
        System.out.println(" ");
    }

    private static final Comparator<Alumno> mayorAMenorVotado = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno o1, Alumno o2) {
            return o2.getCantidadVotos().compareTo(o1.getCantidadVotos());
        }
    };

    public void mostrarListado(ArrayList<Alumno> alumnos) {
        System.out.println("Listado alumnos");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }

}
