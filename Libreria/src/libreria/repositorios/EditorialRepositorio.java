
package libreria.repositorios;
import java.util.List;
import libreria.entidades.Editorial;
public class EditorialRepositorio extends Dao<Editorial>{
    
    public EditorialRepositorio(){
        super();
    }
    
    public void createEditorial(Editorial editorial){
        super.create(editorial);
    }
    public void updateEditorial(Editorial editorial){
        super.update(editorial);
    }
    
    public void deleteEditorial(Long id){
        Editorial editorial = em.find(Editorial.class, id);
        super.delete(editorial);
    }
    
    public Editorial buscarPorId(Long id){
        super.conect();
        Editorial editorial = em.find(Editorial.class, id);
        super.disconect();
        return editorial;
    }
    
    public List<Editorial> buscarEditorialPorNombre(String nombre){
        super.conect();
        List<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e WHERE e.nombre = :nombre", Editorial.class)
                .setParameter("nombre", nombre).getResultList();
        super.disconect();
        return editoriales;
    }
}
