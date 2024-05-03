
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
  
  protected void conect(){
      if(!em.isOpen()) em = emf.createEntityManager();
  }
  protected void disconect(){
      if(em.isOpen())em.close();
  }
  
  public void create(T object){
      conect();
      em.getTransaction().begin();
      em.persist(object);
      em.getTransaction().commit();
      disconect();
  }
  public void update(T object){
      conect();
      em.getTransaction().begin();
      em.merge(object);
      em.getTransaction().commit();
      disconect();
  }
  
  public void delete(T object){
      conect();
      em.getTransaction().begin();
      em.remove(object);
      em.getTransaction().commit();
      disconect();
  }
  
  
}
