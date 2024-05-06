package libreria.repositorios;

import java.util.List;
import libreria.entidades.Prestamo;

public class PrestamoRepositorio extends Dao<Prestamo> {

    public PrestamoRepositorio() {
        super();
    }

    public void createPrestamo(Prestamo prestamo){
        super.create(prestamo);
    }
    
    public void updatePrestamo(Prestamo prestamo){
        super.update(prestamo);
    }
    
    public void deletePrestamo(Long id){
        Prestamo prestamo = em.find(Prestamo.class, id);
        super.delete(prestamo);
    }
    
    public Prestamo buscarPrestamoPorID(Long id){
        super.conect();
        Prestamo prestamo = em.find(Prestamo.class, id);
        super.disconect();
        return prestamo;
    }
    
    public List<Prestamo> buscarPrestamoPorCliente(String nombre){
        super.conect();
        List<Prestamo> prestamos = em.createQuery
        ("SELECT p FROM Prestamo p WHERE p.cliente.id = (SELECT c.id FROM Cliente c WHERE c.nombre = :nombre)", Prestamo.class)
                .setParameter("nombre",nombre).getResultList();
        return prestamos;
    }
    
    public List<Prestamo> buscarLibrosPrestados(String titulo){
        super.conect();
        List<Prestamo> prestamos = em.createQuery
        ("SELECT p FROM Prestamo p WHERE p.libro.ISBN = (SELECT l.ISBN FROM Libro l WHERE l.titulo = :titulo)", Prestamo.class)
                .setParameter("titulo", titulo).getResultList();
        super.disconect();
        return prestamos;
    }
    
}
