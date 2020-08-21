package be.infernalwhale;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
        EntityManager em = emf.createEntityManager();

        Message message = new Message()
                .setId(2)
                .setMessage("Hello Doubters");

        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(message);
        et.commit();

        em.close();
        emf.close();
    }
}
