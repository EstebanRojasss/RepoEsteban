package libreria.servicios;

import java.time.LocalDate;
import java.util.Scanner;
import libreria.entidades.Prestamo;
import libreria.repositorios.ClienteRepositorio;
import libreria.repositorios.LibroRepositorio;
import libreria.repositorios.PrestamoRepositorio;

public class PrestamoServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    PrestamoRepositorio dao;
    LibroRepositorio lr;
    ClienteRepositorio cr;

    public PrestamoServicio() {
        dao = new PrestamoRepositorio();
        lr = new LibroRepositorio();
        cr = new ClienteRepositorio();
    }

    public void crearPrestamo() {
        Prestamo prestamo = new Prestamo();
        String fecha;
        LocalDate fechaParseada;
        do {
            System.out.println("Ingrese la fecha del prestamo: (FORMATO aaaa-mm-dd)");
            try {
                fecha = sc.next();
                fechaParseada = LocalDate.parse(fecha);
                break;
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error.");
                System.out.println("El formato de ingreso es: aaaa-mm-dd");
            }
        } while (true);
        prestamo.setFechaPrestamo(fechaParseada);
        int opcion;
        do{
            System.out.println("Ingrese la cantidad de tiempo del prestamo."
                    + "1. Prestamo de dias."
                    + "2. Prestamo de meses."
                    + "3. Prestamo de anios.");
            try{
                opcion = sc.nextInt();
                break;
            }catch(Exception e){
                System.out.println("Ha ocurrido un error.");
            }
        }while(true);
    }
}
