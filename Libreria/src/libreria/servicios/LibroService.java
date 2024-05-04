package libreria.servicios;

import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.repositorios.LibroRepositorio;

public class LibroService {

    LibroRepositorio dao = new LibroRepositorio();
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    AutorService as = new AutorService();
    EditorialService es = new EditorialService();

    public void crearLibro() {
        Libro libro = new Libro();
        Long isbn;
        do {
            try {
                isbn = sc.nextLong();
                libro.setISBN(isbn);
                if (buscarLibroISBN(isbn)) {
                    break;
                } else {
                    System.out.println("El ISBN ya se encuentra registrado");
                }
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error.");
                sc.next();
            }
        } while (true);
        do {
            String titulo;
            System.out.println("Ingrese el titulo del libro: ");
            titulo = sc.next();
            libro.setTitulo(titulo);
            if (dao.buscarLibroPorTitulo(titulo).isEmpty()) {
                break;
            } else {
                System.out.println("El titulo ya se encuentra registrado.");
            }
        } while (true);
        do {
            Integer anio;
            System.out.println("Ingrese el anio del libro: ");
            try {
                anio = sc.nextInt();
                libro.setAnio(anio);
                if (anio > 0) {
                    break;
                } else {
                    System.out.println("Debe ingresar un anio real.");
                }
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error.");
                sc.next();
            }
        } while (true);
        do {
            Integer ejemplares;
            System.out.println("Ingrese la cantidad de ejemplares: ");
            try {
                ejemplares = sc.nextInt();
                libro.setEjemplares(ejemplares);
                libro.setEjemplaresPrestados(0);
                libro.setEjemplaresRestantes(libro.getEjemplares() - libro.getEjemplaresPrestados());
                break;
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error.");
            }
        } while (true);

        do {
            String nombre;
            String respuesta;
            System.out.println("Ingrese el nombre del autor: ");
            try {
                nombre = sc.next();
                if (as.buscarAutorPorNombre(nombre).isEmpty()) {
                    System.out.println("El nombre no se ha regsitrado. Desea hacerlo? S/N");
                    respuesta = sc.next();
                    if (respuesta.equalsIgnoreCase("S")) {
                        Autor autor = as.crearAutor(nombre);
                        libro.setAutor(autor);
                        break;
                    }
                } else {
                    System.out.println("El nombre ya se encuentra registrado.");
                }
            } catch (Exception e) {
                System.out.println("Ocurrio un error.");
            }
        } while (true);

        do {
            String nombre;
            String respuesta;
            System.out.println("Ingrese el nombre de la editorial: ");
            try {
                nombre = sc.next();
                if (es.buscarEditorialNombre(nombre).isEmpty()) {
                    System.out.println("El nombre no se ha regsitrado. Desea hacerlo? S/N");
                    respuesta = sc.next();
                    if (respuesta.equalsIgnoreCase("S")) {
                        Editorial editorial = es.crearEditorial(nombre);
                        libro.setEditorial(editorial);
                        break;
                    }
                } else {
                    System.out.println("El nombre ya se encuentra registrado.");
                }
            } catch (Exception e) {
                System.out.println("Ocurrio un error.");
            }
        } while (true);
        libro.setAlta(true);
    }

    public void darBajaorEditar() {
        Long ISBN;
        do {
            System.out.println("Ingrese el ISBN del libro a editar/dar de baja/alta ");
            try {
                ISBN = sc.nextLong();
                if (buscarLibroISBN(ISBN)) {
                    break;
                } else {
                    System.out.println("No se encuentra el libro requerido.");
                }
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error.");
            }
        } while (true);
        Libro libro = retornarLibro(ISBN);
        int opcion;
        do {
            System.out.println("""
                               1. Cambiar titulo del libro.
                               2. Cambiar anio del libro.
                               3. Cambiar cantidad de ejemplares.
                               4. Cambiar autor del libro.
                               5. Cambiar editorial del libro.
                               6. Dar de alta/baja.""");

            try {
                opcion = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error.");
            }
        } while (true);
        switch (opcion) {
            case 1 -> {
                do {
                    String titulo;
                    System.out.println("Ingrese el titulo del libro: ");
                    titulo = sc.next();
                    libro.setTitulo(titulo);
                    if (dao.buscarLibroPorTitulo(titulo).isEmpty()) {
                        break;
                    } else {
                        System.out.println("El titulo ya se encuentra registrado.");
                    }
                } while (true);
            }
            case 2 -> {
                do {
                    Integer anio;
                    System.out.println("Ingrese el anio del libro: ");
                    try {
                        anio = sc.nextInt();
                        libro.setAnio(anio);
                        if (anio > 0) {
                            break;
                        } else {
                            System.out.println("Debe ingresar un anio real.");
                        }
                    } catch (Exception e) {
                        System.out.println("Ha ocurrido un error.");
                        sc.next();
                    }
                } while (true);
            }
            case 3 -> {
                do {
                    Integer ejemplares;
                    System.out.println("Ingrese la cantidad de ejemplares: ");
                    try {
                        ejemplares = sc.nextInt();
                        libro.setEjemplares(ejemplares);
                        break;
                    } catch (Exception e) {
                        System.out.println("Ha ocurrido un error.");
                    }
                } while (true);
            }
            case 4 -> {
                do {
                    String nombre;
                    String respuesta;
                    System.out.println("Ingrese el nombre del autor: ");
                    try {
                        nombre = sc.next();
                        if (as.buscarAutorPorNombre(nombre).isEmpty()) {
                            System.out.println("El nombre no se ha regsitrado. Desea hacerlo? S/N");
                            respuesta = sc.next();
                            if (respuesta.equalsIgnoreCase("S")) {
                                Autor autor = as.crearAutor(nombre);
                                libro.setAutor(autor);
                                break;
                            }
                        } else {
                            System.out.println("El nombre ya se encuentra registrado.");
                        }
                    } catch (Exception e) {
                        System.out.println("Ocurrio un error.");
                    }
                } while (true);
            }
            case 5 -> {
                do {
                    String nombre;
                    String respuesta;
                    System.out.println("Ingrese el nombre de la editorial: ");
                    try {
                        nombre = sc.next();
                        if (es.buscarEditorialNombre(nombre).isEmpty()) {
                            System.out.println("El nombre no se ha regsitrado. Desea hacerlo? S/N");
                            respuesta = sc.next();
                            if (respuesta.equalsIgnoreCase("S")) {
                                Editorial editorial = es.crearEditorial(nombre);
                                libro.setEditorial(editorial);
                                break;
                            }
                        } else {
                            System.out.println("El nombre ya se encuentra registrado.");
                        }
                    } catch (Exception e) {
                        System.out.println("Ocurrio un error.");
                    }
                } while (true);
            }
            case 6 -> {
                    if(libro.getAlta()){
                        libro.setAlta(true);
                    }else libro.setAlta(false);
            }
        }
        dao.updateLibro(libro);
    }

    public Libro buscarLibroPorISBN() {
        System.out.println("Ingrese el ISBN del libro: ");
        Long isbn;
        do {
            try {
                isbn = sc.nextLong();
                break;
            } catch (Exception e) {
                System.out.println("No se encuentra el libro.");
            }
        } while (true);
        return dao.buscarLibroPorISBN(isbn);
    }

    public boolean buscarLibroISBN(Long isbn) {
        try {
            if (dao.buscarLibroPorISBN(isbn) == null) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public Libro retornarLibro(Long ISBN) {
        return dao.buscarLibroPorISBN(ISBN);
    }
}
