package com.bilgeadam.hibernate.Utility;

import com.bilgeadam.hibernate.Entity.Musteri;
import com.bilgeadam.hibernate.Entity.Siparis;
import com.bilgeadam.hibernate.Entity.SiparisKalemi;
import com.bilgeadam.hibernate.Entity.Urun;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {

        if (sessionFactory == null){
            try{
                Configuration configuration = new Configuration();
                configuration.addAnnotatedClass(Musteri.class);
                configuration.addAnnotatedClass(Siparis.class);
                configuration.addAnnotatedClass(SiparisKalemi.class);
                configuration.addAnnotatedClass(Urun.class);
                sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}
