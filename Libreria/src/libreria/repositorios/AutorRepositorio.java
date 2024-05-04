package libreria.repositorios;

import java.util.List;
import libreria.entidades.Autor;

public class AutorRepositorio extends Dao<Autor> {

    public AutorRepositorio() {
        super();
    }

    public void createAutor(Autor autor) {
        super.create(autor);
    }

    public void updateAutor(Autor autor) {
        super.update(autor);
    }

    public void deleteAutor(Long id) {
        Autor autor = em.find(Autor.class, id);
        super.delete(autor);
    }

    public Autor buscarAutorPorId(Long id) {
        super.conect();
        Autor autor = em.find(Autor.class, id);
        super.disconect();
        return autor;
    }
    
    public List<Autor> buscarAutorPorNombre(String nombre){
        super.conect();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre", Autor.class)
                .setParameter("nombre", nombre).getResultList();
        super.disconect();
        return autores;
    }
}
