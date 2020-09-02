package be.infernalwhale;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
        EntityManager em = emf.createEntityManager();

        User user = em.find(User.class, 17);
        user.setUsername("Chocolate Chipolata");
        System.out.println(user.toString());

        em.refresh(user);
        System.out.println(user.toString());

        em.close();
        emf.close();
    }
}
