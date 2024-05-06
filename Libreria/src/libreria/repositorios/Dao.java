package libreria.repositorios;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Dao<T> {

    protected EntityManagerFactory emf;
    public EntityManager em;

    public Dao() {
        emf = Persistence.createEntityManagerFactory("LibreriaPU");
        em = emf.createEntityManager();
    }

    public void conect() {
        if (!em.isOpen()) {
            em = emf.createEntityManager();
        }
    }

    public void disconect() {
        if (em.isOpen()) {
            em.close();
        }
    }

    public void create(T object) {
        try {
            conect();
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            disconect();
        }
    }

    public void update(T object) {
       try {
            conect();
            em.getTransaction().begin();
            em.merge(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            disconect();
        }
    }

    public void delete(T object) {
       try {
            conect();
            em.getTransaction().begin();
            em.remove(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            disconect();
        }
    }

}
