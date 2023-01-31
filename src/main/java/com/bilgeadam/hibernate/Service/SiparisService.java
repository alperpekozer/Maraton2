package com.bilgeadam.hibernate.Service;

import com.bilgeadam.hibernate.Entity.Musteri;
import com.bilgeadam.hibernate.Entity.Siparis;
import com.bilgeadam.hibernate.Entity.SiparisKalemi;
import com.bilgeadam.hibernate.Entity.Urun;
import com.bilgeadam.hibernate.Repository.SiparisRepository;
import com.bilgeadam.hibernate.Utility.HibernateUtil;

import javax.persistence.EntityManager;
import java.util.Arrays;
import java.util.List;

public class SiparisService {


    SiparisRepository siparisRepository = new SiparisRepository();
    public void save(Siparis siparis){
        siparisRepository.save(siparis);

    }

    public void soru2ASiparisleriListele(){
        List<Siparis> siparisList = siparisRepository.getAll();

        for (Siparis s : siparisList){
            int toplam = 0;
            System.out.println("Siparis ID: " + s.getId() + ", Müsteri Ad-Soyad : " + s.getMusteri().getName() + " " + s.getMusteri().getSurname() + "Musteri ID: " +s.getMusteri().getId());
            for (SiparisKalemi sk : s.getSiparisKalemi()){
                System.out.println("Ürün Adı: " + sk.getUrun().getName() + ", Fiyat: " + sk.getUrun().getPrice() + ", Adet Sayısı: " + sk.getUrunAdedi());
                toplam = toplam + sk.getUrunAdedi() * sk.getUrun().getPrice();
                System.out.println("        Siparis Toplam" + toplam);
            }



        }
    }

    public void soru2c() {

        try {
            siparisRepository.soru2c();


        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void update() {
        Musteri musteri6 = new Musteri("Alp", "Peközer");
        Urun urun6 = new Urun("Iphone14 Pro Max", 300000);
        SiparisKalemi siparisKalemi6 = new SiparisKalemi(urun6, 2);
        Siparis siparis7 = new Siparis(musteri6,
                Arrays.asList(siparisKalemi6));
        SiparisRepository.update(siparis7);
    }



}
