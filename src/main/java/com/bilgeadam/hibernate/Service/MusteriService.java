package com.bilgeadam.hibernate.Service;

import com.bilgeadam.hibernate.Entity.Musteri;
import com.bilgeadam.hibernate.Entity.Siparis;
import com.bilgeadam.hibernate.Entity.SiparisKalemi;
import com.bilgeadam.hibernate.Repository.MusteriRepository;

import java.util.List;

public class MusteriService {

    static MusteriRepository musteriRepository = new MusteriRepository();

    public static void save(Musteri musteri){
        try{
            musteriRepository.save(musteri);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

    public  void soru2b(){
        List<Musteri> musteriList = musteriRepository.getAll();
        for (Musteri item : musteriList) {
            System.out.println("Musteri id:" + item.getId() + " Musteri ad:" + item.getName() + " Soyadi:"+item.getSurname());
            for (Siparis item2 : item.getSiparisList()) {
                System.out.println("Siparis Id:" + item2.getId());

                int siparisToplam = 0;
                int urunFiyat = 0;
                for (SiparisKalemi item3 :  item2.getSiparisKalemi()) {
                    System.out.println("Urun:" + item3.getUrun().getName() + " Fiyat:" + item3.getUrun().getPrice() +" Alınan Urun Adedi:"+ item3.getUrunAdedi());
                    urunFiyat = item3.getUrun().getPrice();
                    siparisToplam = siparisToplam + urunFiyat* item3.getUrunAdedi();
                }

                System.out.println("Toplam Harcama:"+siparisToplam);
            }
        }}

    public void soru2d() {

        try {
            musteriRepository.soru2d();


        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }



}
