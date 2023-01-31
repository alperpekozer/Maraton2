package com.bilgeadam.hibernate;

import com.bilgeadam.hibernate.Entity.Musteri;
import com.bilgeadam.hibernate.Entity.Siparis;
import com.bilgeadam.hibernate.Entity.SiparisKalemi;
import com.bilgeadam.hibernate.Entity.Urun;
import com.bilgeadam.hibernate.Repository.SiparisRepository;
import com.bilgeadam.hibernate.Service.MusteriService;
import com.bilgeadam.hibernate.Service.SiparisService;

import java.util.Arrays;

public class Main {

    private static SiparisService siparisService = new SiparisService();

    private static MusteriService musteriService = new MusteriService();
    public static void main(String[] args) {


        Musteri m1 = new Musteri("Ali", "Kaya");
        Musteri m2 = new Musteri("Veli", "Özkan");
        Musteri m3 = new Musteri("Alper","Pekozer");

        Urun u1 = new Urun("Iphone 11", 17000);
        Urun u2 = new Urun("Samsung S21", 18000);
        Urun u3 = new Urun("LG LED TV", 8500);
        Urun u4 = new Urun("Arçelik Süpürge", 2500);
        Urun u5 = new Urun("Bosch Süpürge", 3000);


        SiparisKalemi sk1 = new SiparisKalemi(u1, 1);
        SiparisKalemi sk2 = new SiparisKalemi(u2, 2);
        Siparis s1 = new Siparis(m1, Arrays.asList(sk1, sk2));

        SiparisKalemi sk3 = new SiparisKalemi(u2, 2);
        SiparisKalemi sk4 = new SiparisKalemi(u3, 1);
        Siparis s2 = new Siparis(m2, Arrays.asList(sk3, sk4));

        SiparisKalemi sk5 = new SiparisKalemi(u4, 2);
        Siparis s3 = new Siparis(m2, Arrays.asList(sk5));

        Siparis s4 = new Siparis(m2, Arrays.asList((new SiparisKalemi(u1, 1))));
        Siparis s5 = new Siparis(m2, Arrays.asList((new SiparisKalemi(u2, 1))));

       // Siparis s6 = new Siparis(new Musteri("Ali","Kaya"), Arrays.asList((new SiparisKalemi(u5, 3))));

        /*siparisRepository.save(s1);
        siparisRepository.save(s2);
        siparisRepository.save(s3);
        siparisRepository.save(s4);
        siparisRepository.save(s5);*/
        //siparisRepository.save(s6);
        //siparisService.update();
        //soru2A

        //siparisService.soru2ASiparisleriListele();

        //musteriService.save(m3);
        //musteriService.soru2b();


        //siparisService.soru2c();

        //musteriService.soru2d();
    }
}
