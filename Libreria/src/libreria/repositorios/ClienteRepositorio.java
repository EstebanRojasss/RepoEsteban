
package libreria.repositorios;
import java.util.List;
import libreria.entidades.Cliente;
public class ClienteRepositorio extends Dao<Cliente>{

    public ClienteRepositorio() {
        super();
    }
    @Override
    public void create(Cliente cliente) {
        super.create(cliente);
    }

    @Override
    public void update(Cliente cliente) {
        super.update(cliente);
    }
    
    @Override
    public void delete(Cliente cliente) {
        super.delete(cliente);
    }

    public Cliente buscarClientePorID(Long id){
        super.conect();
        Cliente cliente = em.find(Cliente.class, id);
        super.disconect();
        return cliente;
    }
    
    public List<Cliente> buscarClientePorNombre(String nombre){
        super.conect();
        List<Cliente> clientes = em.createQuery
        ("SELECT c FROM Cliente c WHERE c.nombre = :nombre", Cliente.class)
                .setParameter("nombre",nombre).getResultList();
        super.disconect();
        return clientes;
    }
    
    public Cliente buscarClientePorDNI(Long DNI){
        super.conect();
        Cliente cliente = em.createQuery("SELECT c FROM Cliente c WHERE c.documento = :DNI",Cliente.class)
                .setParameter("DNI", DNI).getSingleResult();
        super.disconect();
        return cliente;
    }
    
    public Cliente buscarClientePorTel(Long tel){
        super.conect();
        Cliente cliente = em.createQuery("SELECT c FROM Cliente c WHERE c.telefono = :tel", Cliente.class)
                .setParameter("tel",tel).getSingleResult();
        super.disconect();
        return cliente;
    } 
}
