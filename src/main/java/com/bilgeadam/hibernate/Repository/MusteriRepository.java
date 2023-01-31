package com.bilgeadam.hibernate.Repository;

import com.bilgeadam.hibernate.Entity.Musteri;
import com.bilgeadam.hibernate.Entity.Siparis;
import com.bilgeadam.hibernate.Utility.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import java.util.List;

public class MusteriRepository {


    public void save(Musteri musteri) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(musteri);
            session.getTransaction().commit();
            System.out.println("Musteri is added");
            session.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }
    public List<Musteri> getAll() {

        List<Musteri> list = null;

        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            list = session.createQuery("select musteri from Musteri musteri").list();
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void soru2d() {
        List<Object[]> siparisList = null;
        try {
            EntityManager entityManager = HibernateUtil.getSessionFactory().createEntityManager();
            String query = "select m.name,m.surname,s.id as siparis_no from musteri as m\n" +
                    "inner join siparis as s on s.musteri_id=m.id";
            siparisList = entityManager.createNativeQuery(query).getResultList();
            for (Object[] item : siparisList) {

                System.out.println(" Müşteri name: " + item[0] + " --"
                        + " Müşteri Surname: " + item[1] + " --"
                        + " Sipariş No: " + item[2]

                );

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}