package de.hs_coburg.mgse.persistence;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
    private static SessionFactory SESSION_FACTORY_INSTANCE;
    private static EntityManager ENTITY_MANAGER;

    /**
     * This is the bare hibernate API. Use JPA instead
     * @return
     */
    @Deprecated
    public static SessionFactory buildSessionFactory() {
        if(SESSION_FACTORY_INSTANCE != null)
            return SESSION_FACTORY_INSTANCE;

        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            SESSION_FACTORY_INSTANCE = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
        }
        catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.
            StandardServiceRegistryBuilder.destroy( registry );
        }

        return SESSION_FACTORY_INSTANCE;

    }

    /**
     * This is JPA that uses Hibernate
     * @return
     * @throws NamingException
     */
    public static EntityManager getEntityManager() throws NamingException {
        if(ENTITY_MANAGER != null){
            return ENTITY_MANAGER;
        }
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mgse-persistence");
        ENTITY_MANAGER = emf.createEntityManager();
        return emf.createEntityManager();
    }
}
