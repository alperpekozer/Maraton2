package com.bilgeadam.jdbc.entity;

public class Calisan {

    private int calisanid;
    private String isim;
    private int yas;
    private int maas;
    private String departman;

    private Sirket calisilanSirket;



    public Calisan(int calisanid, String isim, int yas, int maas, String departman, Sirket calisilanSirket) {
        this.calisanid = calisanid;
        this.isim = isim;
        this.yas = yas;
        this.maas = maas;
        this.departman = departman;
        this.calisilanSirket = calisilanSirket;
    }

    public Calisan(String isim, int yas, int maas, String departman, Sirket calisilanSirket) {
        this.isim = isim;
        this.yas = yas;
        this.maas = maas;
        this.departman = departman;
        this.calisilanSirket = calisilanSirket;
    }

    public int getCalisanid() {
        return calisanid;
    }

    public void setCalisanid(int calisanid) {
        this.calisanid = calisanid;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public Sirket getCalisilanSirket() {
        return calisilanSirket;
    }

    public void setCalisilanSirket(Sirket calisilanSirket) {
        this.calisilanSirket = calisilanSirket;
    }


}
