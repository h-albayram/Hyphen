package com.example.idah.hyphen;

import java.util.ArrayList;

public class uyecek {
    public uyecek() {
        super();}
    public static ArrayList<uyecek> uyeler = new ArrayList<uyecek>();
    private int id;
    private String sifre;
    private String adi;
    private String soyadi;
    private String email;
    private String dog_tarihi;
    private String kay_tar;
    private  String yetki;
    private String takim;
    private String fotog;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }
    public String getemail() {
        return email;
    }

    public void setEmail(String email) {
        this.email =email;
    }
    public String getDog_tarihi() {
        return dog_tarihi;
    }

    public void setDog_tarihi(String dog_tarihi) {
        this.dog_tarihi = dog_tarihi;
    }
    public String getKay_tar() {
        return kay_tar;
    }

    public void setKay_tar(String kay_tar) {
        this.kay_tar = kay_tar;
    }
    public String getYetki() {
        return yetki;
    }

    public void setYetki(String yetki) {
        this.yetki = yetki;
    }

    public String getTakim() {
        return takim;
    }

    public void setTakim(String takim) {
        this.takim = takim;
    }
    public String getFotog() {
        return fotog;
    }

    public void setFotog(String fotog) {
        this.fotog = fotog;
    }
}