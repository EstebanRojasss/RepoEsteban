package libreria.main;

import java.util.Scanner;
import libreria.servicios.AutorService;
import libreria.servicios.EditorialService;
import libreria.servicios.LibroService;

public class Main {

    public static void main(String[] args) {
        AutorService as = new AutorService();
        EditorialService es = new EditorialService();
        LibroService ls = new LibroService();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        boolean menu = true;
        do {
            int opcion = 0;
            do {
                try {
                    System.out.println("\n");
                    System.out.println("MENU DE OPCIONES");
                    System.out.println("1. Agregar autor, editorial, libro.");
                    System.out.println("2. Dar de alta/baja autor, editorial, libro");
                    System.out.println("3. Buscar Autor por nombre.");
                    System.out.println("4. Buscar libro por ISBN.");
                    System.out.println("5. Buscar libro por Título.");
                    System.out.println("6. Buscar libro/s por nombre de Autor.");
                    System.out.println("7. Buscar libro/s por nombre de Editorial.");
                    System.out.println("8. Salir.");

                    opcion = sc.nextInt();
                    break;
                } catch (Exception e) {
                    sc.next();
                    System.out.println("");
                    System.out.println("Ha ocurrido un error.");
                }
            } while (true);
            switch (opcion) {
                case 1 -> {
                    do {
                        try {
                            System.out.println("""
                                       1.Autor
                                       2.Editorial
                                       3.Libro""");
                            opcion = sc.nextInt();
                            break;
                        } catch (Exception e) {
                            sc.next();
                            System.out.println("");
                            System.out.println("Debe ingresar un dato numerico correcto");
                        }
                    } while (true);
                    switch (opcion) {
                        case 1 -> {
                            as.crearAutor();
                            break;
                        }
                        case 2 -> {
                            es.crearEditorial();
                            break;
                        }
                        case 3 -> {
                            ls.crearLibro();
                        }
                        default -> {
                            System.out.println("Opcion no valida.");
                            break;
                        }
                    }
                    break;
                }
                case 2 -> {
                    do {
                        try {
                            System.out.println("""
                                       1.Autor
                                       2.Editorial
                                       3.Libro""");
                            opcion = sc.nextInt();
                            break;
                        } catch (Exception e) {
                            sc.next();
                            System.out.println("");
                            System.out.println("Debe ingresar un dato numerico correcto");
                        }
                    } while (true);
                    switch (opcion) {
                        case 1 -> {
                            as.darBajaorEditar();
                            break;
                        }
                        case 2 -> {
                            es.darBajaorEditar();
                            break;
                        }
                        case 3 -> {
                            ls.darBajaorEditar();
                            break;
                        }
                        default -> {
                            System.out.println("Opcion no valida.");
                            break;
                        }
                    }
                    break;
                }
                case 3 -> {
                    as.buscarAutorPorNombre();
                    break;
                }
                case 4 -> {
                    System.out.println(ls.buscarLibroPorISBN());
                    break;
                }
                case 5 -> {
                    ls.buscarLibroPorTitulo();
                    break;
                }
                case 6 -> {
                    ls.buscarPorNombreAutor();
                    break;
                }
                case 7 -> {
                    ls.buscarPorNombreEditorial();
                    break;
                }
                case 8 -> {
                    menu = false;
                    System.out.println("-Que tenga un buen dia-");
                    break;
                }
                default -> {
                    System.out.println("Opcion no disponible.");
                    break;
                }
            }

        } while (menu);

    }
}
