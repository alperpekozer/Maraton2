package com.bilgeadam.hibernate.Repository;

import com.bilgeadam.hibernate.Entity.Siparis;
import com.bilgeadam.hibernate.Utility.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import java.util.List;

public class SiparisRepository {

    Session session = HibernateUtil.getSessionFactory().openSession();
    public void save(Siparis siparis) {
        try {

            session.beginTransaction();
            session.save(siparis);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            e.getCause();
        }
    }

    public List<Siparis> getAll() {
        List<Siparis> list = null;
        try {
            session.beginTransaction();
            list = session.createQuery("select siparis from Siparis siparis").list(); //jpql --> java persistence query language
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
        return list;
    }

    public static void update(Siparis siparis) {
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();
            session.update(siparis);
            session.getTransaction().commit();
            session.close();
        }
        catch (Exception e) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void deleteById(int id) {
        Session session = null;
        Siparis siparis = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();
            siparis = session.load(Siparis.class,id);
            session.delete(siparis);
            session.getTransaction().commit();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void soru2c() {
        List<Object[]> siparisList = null;
        try {
            EntityManager entityManager = HibernateUtil.getSessionFactory().createEntityManager();
            String query = "SELECT m.id, count(musteri_id) from siparis as s\n" +
                    "inner join musteri as m on s.musteri_id = m.id\n" +
                    "group by m.id;";
            siparisList = entityManager.createNativeQuery(query).getResultList();
            for (Object[] item : siparisList) {

                System.out.println("MusteriId: " + item[0] + " --"
                        + " SiparisSayisi: " + item[1]

                );
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }



}
