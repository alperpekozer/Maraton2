package com.bilgeadam.jdbc.Manager;

import com.bilgeadam.jdbc.entity.Calisan;
import com.bilgeadam.jdbc.entity.Sirket;
import com.bilgeadam.jdbc.service.CalisanService;

public class CalisanManager {
    public static void main(String[] args) {


        CalisanService calisanService = new CalisanService();
        Sirket sirket1 = new Sirket(1);

        Calisan calisan1 = new Calisan("Alper",27,10000,"Ürün Yerleştirme",sirket1);
       /* Calisan calisan2 = new Calisan("Ahmet",30,15000,"İnsan Kaynakları","Koç Holding");
        Calisan calisan3 = new Calisan("Mehmet",25,20000,"Kalite Kontrol","Sabanci Holding"); */


       calisanService.save(calisan1);
        //calisanService.update(calisan1);
        //calisanService.delete(4);

    }
}