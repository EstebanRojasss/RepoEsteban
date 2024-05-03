
package libreria.servicios;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Dao <T>{
    EntityManagerFactory emf;
    EntityManager em;
  public Dao(){
      emf = Persistence.createEntityManagerFactory("LibreriaPU");
      em = emf.createEntityManager();
  }
  
  
  
}
