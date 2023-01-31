package com.bilgeadam.jdbc.Manager;

import com.bilgeadam.jdbc.entity.Sirket;
import com.bilgeadam.jdbc.service.SirketService;

public class SirketManager {
    public static void main(String[] args) {


        SirketService sirketService = new SirketService();

        Sirket sirket1 = new Sirket("Trendyol","Alibaba Group","unvan1","Giyim Ürünleri",2010);
        Sirket sirket2 = new Sirket("Koç Holding","Rahmi Koç","unvan2","Enerji",1926);
        Sirket sirket3 = new Sirket("Sabanci Holding","Sakip Sabanci","unvan3","Sanayi",1967);

        sirketService.save(sirket3);
    }
}
