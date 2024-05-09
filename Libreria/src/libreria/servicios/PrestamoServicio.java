package libreria.servicios;

import java.time.LocalDate;
import java.util.Scanner;
import libreria.entidades.Prestamo;
import libreria.repositorios.PrestamoRepositorio;
import libreria.entidades.Libro;
import libreria.entidades.Cliente;

public class PrestamoServicio {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    PrestamoRepositorio dao = new PrestamoRepositorio();
    LibroService ls = new LibroService();
    ClienteServicio cs = new ClienteServicio();
    
    public void asginarPrestamo() {
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
                sc.next();
            }
        } while (true);
        prestamo.setFechaPrestamo(fechaParseada);
        do {
            System.out.println("Ingrese la fecha de la devolucion: (FORMATO aaaa-mm-dd)");
            try {
                fecha = sc.next();
                fechaParseada = LocalDate.parse(fecha);
                if (fechaParseada.isAfter(prestamo.getFechaPrestamo())) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error.");
                System.out.println("El formato de ingreso es: aaaa-mm-dd");
                sc.next();
            }
        } while (true);
        prestamo.setFechaDevolucion(fechaParseada);
        Long ISBN_DNI;
        do {
            System.out.println("Ingrese el ISBN del libro a realizar el prestamo: ");
            try {
                ISBN_DNI = sc.nextLong();
                if (!ls.buscarLibroISBN(ISBN_DNI)) {
                    break;                    
                } else {
                    System.out.println("El libro no se encuentra.");
                }
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error.");
                sc.next();
            }
        } while (true);
        Libro libro = ls.retornarLibro(ISBN_DNI);
        prestamo.setLibro(libro);
        int opcion;
        do {
            System.out.println("Ingrese las opciones de registro de cliente."
                    + "1. Asignar cliente nuevo."
                    + "2. Asginar cliente ya existente en la base de datos.");
            try {
                opcion = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error.");
                sc.next();
            }
        } while (true);
        switch (opcion) {
            case 1 -> {
                Cliente cliente = cs.crearCliente();
                prestamo.setCliente(cliente);
                break;
            }
            case 2 -> {
                do {
                    System.out.println("Ingrese el DNI del cliente a agregar: ");
                    try {
                        ISBN_DNI = sc.nextLong();
                        if (!cs.buscarClientePorDni(ISBN_DNI)) {
                            break;
                        } else {
                            System.out.println("No se ha encontrado el cliente.");
                        }
                    } catch (Exception e) {
                        System.out.println("Ha ocurrido un error.");
                        sc.next();
                    }                    
                } while (true);
                Cliente cliente = cs.buscarClientPorDNI(ISBN_DNI);
                prestamo.setCliente(cliente);
                break;
            }
        }
        dao.createPrestamo(prestamo);
    }
}
