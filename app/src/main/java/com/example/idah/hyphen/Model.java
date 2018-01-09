package com.example.idah.hyphen;

import java.util.ArrayList;


class UyeGor {


    public UyeGor() {
        super();
    }

    public static ArrayList<UyeGor> listeUyeGor = new ArrayList<UyeGor>();
    private int id;
    private String k_adi;
    private String k_soyad;
    private String k_sifre;
    private int k_tip;
    private String email;
    private Boolean kullanici_durum;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getK_adi() {
        return k_adi;
    }

    public void setK_adi(String k_adi) {
        this.k_adi = k_adi;
    }

    public String getK_soyad() {
        return k_soyad;
    }

    public void setK_soyad(String k_soyad) {
        this.k_soyad = k_soyad;
    }

    public String getK_sifre() {
        return k_sifre;
    }

    public void setK_sifre(String k_sifre) {
        this.k_sifre = k_sifre;
    }

    public int getK_tip() {
        return k_tip;
    }

    public void setK_tip(int k_tip) {
        this.k_tip = k_tip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getKullanici_durum() {
        return kullanici_durum;
    }

    public void setKullanici_durum(Boolean kullanici_durum) {
        this.kullanici_durum = kullanici_durum;
    }
}

class MusteriGor {

    public MusteriGor() {
        super();
    }

    public static ArrayList<MusteriGor> listeMusteriGor = new ArrayList<MusteriGor>();
    private int id;
    private String k_adi;
    private String k_soyad;
    private String k_sifre;
    private int k_tip;
    private String email;
    private Boolean kullanici_durum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getK_adi() {
        return k_adi;
    }

    public void setK_adi(String k_adi) {
        this.k_adi = k_adi;
    }

    public String getK_soyad() {
        return k_soyad;
    }

    public void setK_soyad(String k_soyad) {
        this.k_soyad = k_soyad;
    }

    public String getK_sifre() {
        return k_sifre;
    }

    public void setK_sifre(String k_sifre) {
        this.k_sifre = k_sifre;
    }

    public int getK_tip() {
        return k_tip;
    }

    public void setK_tip(int k_tip) {
        this.k_tip = k_tip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getKullanici_durum() {
        return kullanici_durum;
    }

    public void setKullanici_durum(Boolean kullanici_durum) {
        this.kullanici_durum = kullanici_durum;
    }

}

class İlanGor {

    public İlanGor() {
        super();
    }

    public static ArrayList<İlanGor> listeİlanGor = new ArrayList<İlanGor>();
    private int id;
    private int k_id;
    private String baslik;
    private String konu;
    private String fiyat;
    private int dosya_id;
    private int is_zaman;
    private Boolean ilan_durumu;
    private String aciklama;
    private int dil_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getK_id() {
        return k_id;
    }

    public void setK_id(int k_id) {
        this.k_id = k_id;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getKonu() {
        return konu;
    }

    public void setKonu(String konu) {
        this.konu = konu;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    public int getDosya_id() {
        return dosya_id;
    }

    public void setDosya_id(int dosya_id) {
        this.dosya_id = dosya_id;
    }

    public int getIs_zaman() {
        return is_zaman;
    }

    public void setIs_zaman(int is_zaman) {
        this.is_zaman = is_zaman;
    }

    public Boolean getIlan_durumu() {
        return ilan_durumu;
    }

    public void setIlan_durumu(Boolean ilan_durumu) {
        this.ilan_durumu = ilan_durumu;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public int getDil_id() {
        return dil_id;
    }

    public void setDil_id(int dil_id) {
        this.dil_id = dil_id;
    }


}

class CevirmenAra {


    public CevirmenAra() {
        super();
    }

    public static ArrayList<CevirmenAra> listeCevirmenAra = new ArrayList<CevirmenAra>();
    private int id;
    private String k_adi;
    private String k_soyad;
    private String k_sifre;
    private int k_tip;
    private String email;
    private Boolean kullanici_durum;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getK_adi() {
        return k_adi;
    }

    public void setK_adi(String k_adi) {
        this.k_adi = k_adi;
    }

    public String getK_soyad() {
        return k_soyad;
    }

    public void setK_soyad(String k_soyad) {
        this.k_soyad = k_soyad;
    }

    public String getK_sifre() {
        return k_sifre;
    }

    public void setK_sifre(String k_sifre) {
        this.k_sifre = k_sifre;
    }

    public int getK_tip() {
        return k_tip;
    }

    public void setK_tip(int k_tip) {
        this.k_tip = k_tip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getKullanici_durum() {
        return kullanici_durum;
    }

    public void setKullanici_durum(Boolean kullanici_durum) {
        this.kullanici_durum = kullanici_durum;
    }
}

class UyeAra {


    public UyeAra() {
        super();
    }

    public static ArrayList<UyeAra> listeUyeAra = new ArrayList<UyeAra>();
    private int id;
    private String k_adi;
    private String k_soyad;
    private String k_sifre;
    private int k_tip;
    private String email;
    private Boolean kullanici_durum;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getK_adi() {
        return k_adi;
    }

    public void setK_adi(String k_adi) {
        this.k_adi = k_adi;
    }

    public String getK_soyad() {
        return k_soyad;
    }

    public void setK_soyad(String k_soyad) {
        this.k_soyad = k_soyad;
    }

    public String getK_sifre() {
        return k_sifre;
    }

    public void setK_sifre(String k_sifre) {
        this.k_sifre = k_sifre;
    }

    public int getK_tip() {
        return k_tip;
    }

    public void setK_tip(int k_tip) {
        this.k_tip = k_tip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getKullanici_durum() {
        return kullanici_durum;
    }

    public void setKullanici_durum(Boolean kullanici_durum) {
        this.kullanici_durum = kullanici_durum;
    }
}

class DilGor {

    public DilGor() {
        super();
    }

    public static ArrayList<DilGor> listeDilGor = new ArrayList<DilGor>();
    private int id;
    private String dil_adi;
    private String dil_kodu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDil_adi() {
        return dil_adi;
    }

    public void setDil_adi(String dil_adi) {
        this.dil_adi = dil_adi;
    }

    public String getDil_kodu() {
        return dil_kodu;
    }

    public void setDil_kodu(String dil_kodu) {
        this.dil_kodu = dil_kodu;
    }
}

class İlanGorCevirmen {
    public static ArrayList<İlanGorCevirmen> listeİlanGorCevirmen = new ArrayList<İlanGorCevirmen>();
    private int id;
    private String baslik;
    private String konu;
    private int is_zamani;

    public int getId() {
        return id;
    }

    public int getIs_zamani() {
        return is_zamani;
    }

    public void setIs_zamani(int is_zamani) {
        this.is_zamani = is_zamani;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String fiyat;
    private String dil_adi;

    public String getDil_adi() {
        return dil_adi;
    }

    public void setDil_adi(String dil_adi) {
        this.dil_adi = dil_adi;
    }
    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getKonu() {
        return konu;
    }

    public void setKonu(String konu) {
        this.konu = konu;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    public İlanGorCevirmen() {

    }
}

class BitenİlanGorCevirmen {
    public static ArrayList<BitenİlanGorCevirmen> listeBitenİlanGorCevirmen = new ArrayList<BitenİlanGorCevirmen>();

    private String baslik;
    private String konu;
    private String fiyat;
    private String dil_adi;

    public String getDil_adi() {
        return dil_adi;
    }

    public void setDil_adi(String dil_adi) {
        this.dil_adi = dil_adi;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getKonu() {
        return konu;
    }

    public void setKonu(String konu) {
        this.konu = konu;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    public BitenİlanGorCevirmen() {

    }
}

class DevamEdenİlanGorCevirmen {
    public static ArrayList<DevamEdenİlanGorCevirmen> listeDevamEdenİlanGorCevirmen = new ArrayList<DevamEdenİlanGorCevirmen>();

    private String baslik;
    private String konu;
    private String fiyat;
    private String dil_adi;

    public String getDil_adi() {
        return dil_adi;
    }

    public void setDil_adi(String dil_adi) {
        this.dil_adi = dil_adi;
    }
    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getKonu() {
        return konu;
    }

    public void setKonu(String konu) {
        this.konu = konu;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    public DevamEdenİlanGorCevirmen() {

    }
}

class İlanGorUye {
    public static ArrayList<İlanGorUye> listeİlanGorUye = new ArrayList<İlanGorUye>();

    private String baslik;
    private String konu;
    private String fiyat;
    private String dil_adi;

    public String getDil_adi() {
        return dil_adi;
    }

    public void setDil_adi(String dil_adi) {
        this.dil_adi = dil_adi;
    }
    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getKonu() {
        return konu;
    }

    public void setKonu(String konu) {
        this.konu = konu;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    public İlanGorUye() {

    }
}

class DevamEdenİlanGorUye {
    public static ArrayList<DevamEdenİlanGorUye> listeDevamEdenİlanGorUye = new ArrayList<DevamEdenİlanGorUye>();

    private String baslik;
    private String konu;
    private String fiyat;
    private String dil_adi;

    public String getDil_adi() {
        return dil_adi;
    }

    public void setDil_adi(String dil_adi) {
        this.dil_adi = dil_adi;
    }
    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getKonu() {
        return konu;
    }

    public void setKonu(String konu) {
        this.konu = konu;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    public DevamEdenİlanGorUye() {

    }
}

class BitenİlanGorUye {
    public static ArrayList<BitenİlanGorUye> listeBitenİlanGorUye = new ArrayList<BitenİlanGorUye>();

    private String baslik;
    private String konu;
    private String fiyat;
    private String dil_adi;

    public String getDil_adi() {
        return dil_adi;
    }

    public void setDil_adi(String dil_adi) {
        this.dil_adi = dil_adi;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getKonu() {
        return konu;
    }

    public void setKonu(String konu) {
        this.konu = konu;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    public BitenİlanGorUye() {

    }
}