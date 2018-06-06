package de.hs_coburg.mgse.persistence;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    private static SessionFactory SESSION_FACTORY_INSTANCE;

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
}
