package com.bilgeadam.jdbc.entity;

public class Sirket {


    private  int sirketid;
    private String  sirketIsmi;
    private String  sirketsahibi;
    private String  unvani;
    private String faaliyetAlani;
    private int kurulusYili;

    public Sirket(int sirketid) {
        this.sirketid = sirketid;
    }

    public Sirket(int sirketid, String sirketIsmi, String sirketsahibi, String unvani, String faaliyetAlani, int kurulusYili) {
        this.sirketid = sirketid;
        this.sirketIsmi = sirketIsmi;
        this.sirketsahibi = sirketsahibi;
        this.unvani = unvani;
        this.faaliyetAlani = faaliyetAlani;
        this.kurulusYili = kurulusYili;
    }

    public Sirket(String sirketIsmi, String sirketsahibi, String unvani, String faaliyetAlani, int kurulusYili) {
        this.sirketIsmi = sirketIsmi;
        this.sirketsahibi = sirketsahibi;
        this.unvani = unvani;
        this.faaliyetAlani = faaliyetAlani;
        this.kurulusYili = kurulusYili;
    }

    public int getSirketid() {
        return sirketid;
    }

    public void setSirketid(int sirketid) {
        this.sirketid = sirketid;
    }

    public String getSirketIsmi() {
        return sirketIsmi;
    }

    public void setSirketIsmi(String sirketIsmi) {
        this.sirketIsmi = sirketIsmi;
    }

    public String getSirketsahibi() {
        return sirketsahibi;
    }

    public void setSirketsahibi(String sirketsahibi) {
        this.sirketsahibi = sirketsahibi;
    }

    public String getUnvani() {
        return unvani;
    }

    public void setUnvani(String unvani) {
        this.unvani = unvani;
    }

    public String getFaaliyetAlani() {
        return faaliyetAlani;
    }

    public void setFaaliyetAlani(String faaliyetAlani) {
        this.faaliyetAlani = faaliyetAlani;
    }

    public int getKurulusYili() {
        return kurulusYili;
    }

    public void setKurulusYili(int kurulusYili) {
        this.kurulusYili = kurulusYili;
    }

    @Override
    public String toString() {
        return "Sirket{" +
                "sirketid=" + sirketid +
                ", sirketIsmi='" + sirketIsmi + '\'' +
                ", sirketsahibi='" + sirketsahibi + '\'' +
                ", unvani='" + unvani + '\'' +
                ", faaliyetAlani='" + faaliyetAlani + '\'' +
                ", kurulusYili=" + kurulusYili +
                '}';
    }
}
