
package libreria.repositorios;
import java.util.List;
import libreria.entidades.Libro;

public class LibroRepositorio extends Dao<Libro>{
    public LibroRepositorio(){
        super();
    }
    
    public void createLibro(Libro libro){
        super.create(libro);
    }
    
    public void updateLibro(Libro libro){
        super.update(libro);
    }
    
    public void deleteLibro(Long ISBN){
        Libro libro = em.find(Libro.class, ISBN);
        super.delete(libro);
    }
    
    public Libro buscarLibroPorISBN(Long ISBN){
        super.conect();
        Libro libro = em.find(Libro.class, ISBN);
        super.disconect();
        return libro;
    }
    
    public List<Libro> buscarLibroPorTitulo(String titulo){
        super.conect();
        List<Libro>libros = em.createQuery("SELECT l FROM Libro l WHERE l.titulo = :titulo", Libro.class)
                .setParameter("titulo", titulo).getResultList();
        super.disconect();
        return libros;
    }
    
    public List<Libro> buscarLibroPorNombreAutor(String nombre){
        super.conect();
        List<Libro> libros = em.createQuery
        ("SELECT l FROM Libro l WHERE l.autor.id = (SELECT a.id FROM Autor a WHERE a.nombre = :nombre)", Libro.class)
                .setParameter("nombre", nombre).getResultList();
        super.disconect();
        return libros;
    }
    
    public List<Libro> buscarLibroPorNombreEditorial(String nombre){
        super.conect();
        List<Libro> libros = em.createQuery
        ("SELECT l FROM Libro l WHERE l.editorial.id = (SELECT e.id FROM Editorial e WHERE e.nombre = :nombre)", Libro.class)
                .setParameter("nombre", nombre).getResultList();
        super.disconect();
        return libros;
    }

}
