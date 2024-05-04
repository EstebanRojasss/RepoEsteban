package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.repositorios.AutorRepositorio;
import libreria.entidades.Autor;

public class AutorService {

    AutorRepositorio dao = new AutorRepositorio();
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Autor crearAutor(String nombre) {
        Autor autor = new Autor();
        autor.setNombre(nombre);
        autor.setAlta(true);
        dao.createAutor(autor);
        return autor;
    }
    
    public Autor crearAutor() {
        System.out.println("Ingrese el nombre del autor: ");
        String nombre = sc.next();
        Autor autor = new Autor();
        autor.setNombre(nombre);
        autor.setAlta(true);
        dao.createAutor(autor);
        return autor;
    }

    public void darBajaorEditar() {
        Long id;
        System.out.println("Ingrese el id del autor: ");
        do {
            try {
                id = sc.nextLong();
                break;
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error.");
                sc.next();
            }
        } while (true);

        Autor autor = dao.buscarAutorPorId(id);
        int opcion;
        do {
            System.out.println("""
                               Ingrese la opcion deseada:
                               1.Editar 
                               2.Dar de alta/baja""");
            try {
            opcion = sc.nextInt();
            break;
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error.");
            }
        } while (true);
        String nombre;
        switch(opcion){
            case 1 -> { 
                System.out.println("Ingrese el nombre nuevo: ");
                nombre = sc.next();
                autor.setNombre(nombre);
            }
            case 2 -> {
                if(autor.getAlta()){
                    autor.setAlta(false);
                }else autor.setAlta(true);
            }
        }
        
        dao.update(autor);
    }

    public List<Autor> buscarAutorPorNombre() {
        System.out.println("Ingrese el nombre del autor: ");
        String nombre = sc.next();
        return dao.buscarAutorPorNombre(nombre);
    }

    public Autor retornarPorId(Long id) {
        return dao.buscarAutorPorId(id);
    }
    
    public List<Autor>buscarAutorPorNombre(String nombre){
        return dao.buscarAutorPorNombre(nombre);
    }

}
