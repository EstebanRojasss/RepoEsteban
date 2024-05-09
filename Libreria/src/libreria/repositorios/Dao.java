package libreria.repositorios;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public abstract class Dao<T> {

    protected EntityManagerFactory emf;
    public EntityManager em;

    public Dao() {
        this.emf = Persistence.createEntityManagerFactory("LibreriaPU");
        this.em = emf.createEntityManager();
    }

    protected void conect() {
        if (!em.isOpen()) {
            em = emf.createEntityManager();
        }
    }

    protected void disconect() {
        if (em.isOpen()) {
            em.close();
        }
    }

    protected void create(T object) {
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

    protected void update(T object) {
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

    protected void delete(T object) {
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
