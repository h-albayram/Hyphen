package com.example.idah.hyphen;

import android.os.StrictMode;
import android.util.Log;
import android.util.Pair;


import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.MarshalFloat;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.ArrayList;
import java.util.List;

public class veritabani {
    private static String NAMESPACE = "http://microsoft.com/webservices/";
    private static String URL = "http://hyphenidah.somee.com/WebService1.asmx";

    private static SoapSerializationEnvelope startProcess(String namespace, List<Pair<String, Object>> listKeys, boolean marshal) {
        SoapObject request = new SoapObject(NAMESPACE, namespace);
        if (listKeys != null)
            for (int i = 0; i < listKeys.size(); i++)
                request.addProperty(listKeys.get(i).first, listKeys.get(i).second);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);

        if (marshal) {
            envelope.implicitTypes = true;
            envelope.encodingStyle = SoapSerializationEnvelope.XSD;
            MarshalFloat md = new MarshalFloat();
            md.register(envelope);
        }
        envelope.dotNet = true;
        envelope.setOutputSoapObject(request);
        return envelope;
    }

    public String KayitOl(String sifre, String ad, String soyad, String email, String dogtar, int yetki, String foto) {
        String donus = "";

        SoapObject request = new SoapObject(NAMESPACE, "kayit");
        request.addProperty("sifre", sifre);
        request.addProperty("ad", ad);
        request.addProperty("soyad", soyad);
        request.addProperty("email", email);
        request.addProperty("dog_tar", dogtar);
        request.addProperty("yetki", yetki);
        request.addProperty("foto", foto);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(request);
        envelope.dotNet = true;
        HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
        androidHttpTransport.debug = true;
        try {
            androidHttpTransport.call("http://microsoft.com/webservices/kayit", envelope);
            SoapPrimitive response = (SoapPrimitive) envelope.getResponse();
            response = (SoapPrimitive) envelope.getResponse();
            donus = response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("Hata", e.toString());
        }
        return donus;
    }

    public int Giris(String email, String sifre) {
        int donus = 0;
        SoapObject request = new SoapObject(NAMESPACE, "giris");

        request.addProperty("e_posta", email);
        request.addProperty("sifre", sifre);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(request);
        envelope.dotNet = true;
        HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
        androidHttpTransport.debug = true;
        try {
            androidHttpTransport.call("http://microsoft.com/webservices/giris", envelope);
            SoapPrimitive response = (SoapPrimitive) envelope.getResponse();
            response = (SoapPrimitive) envelope.getResponse();

            donus = Integer.parseInt(response.toString());

        } catch (Exception e) {
            e.printStackTrace();

        }
        return donus;
    }

    public static void GetUyler() {
        String nameSpace = "uyegoruntule";
        List<Pair<String, Object>> listKeys = new ArrayList<>();
        SoapSerializationEnvelope envelope = startProcess(nameSpace, listKeys, false);
        HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
        androidHttpTransport.debug = true;
        try {
            androidHttpTransport.call("http://microsoft.com/webservices/" + nameSpace, envelope);
            SoapObject response = (SoapObject) envelope.getResponse();
            response = (SoapObject) response.getProperty(1);
            SoapObject table = (SoapObject) response.getProperty(0);
            uyecek.uyeler.clear();
            for (int i = 0; i < table.getPropertyCount(); i++) {
                SoapObject tableRow = (SoapObject) table.getProperty(i);
                uyecek uyeler = new uyecek();
                uyeler.setId(Integer.parseInt(tableRow.getPropertyAsString("id").toString()));
                uyeler.setSifre(""+(tableRow.getPropertyAsString("sifre").toString()));
                uyeler.setAdi(""+tableRow.getPropertyAsString("ad").toString());
                uyeler.setSoyadi(""+tableRow.getPropertyAsString("soyad").toString());
                uyeler.setEmail(""+tableRow.getPropertyAsString("e_posta").toString());
                uyeler.setDog_tarihi(""+tableRow.getPropertyAsString("dog_tar").toString());
                uyeler.setKay_tar(""+tableRow.getPropertyAsString("kayit_tar").toString());
                uyeler.setYetki(""+tableRow.getPropertyAsString("yetki").toString());
             //   uyeler.setTakim(""+(tableRow.getPropertyAsString("takim_id").toString()));
                uyecek.uyeler.add(uyeler);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void profil(String email) {
        String nameSpace = "profil";
        SoapObject request = new SoapObject(NAMESPACE, nameSpace);
        request.addProperty("mail", email);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(request);
        envelope.dotNet = true;
        HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
        androidHttpTransport.debug = true;

        try {
            androidHttpTransport.call("http://microsoft.com/webservices/"+nameSpace, envelope);
            SoapObject response = (SoapObject) envelope.getResponse();
            response = (SoapObject) response.getProperty(1);
            SoapObject table = (SoapObject) response.getProperty(0);
            UyeGor.listeUyeGor.clear();
            for (int i = 0; i < table.getPropertyCount(); i++) {
                SoapObject tableRow = (SoapObject) table.getProperty(i);
                UyeGor uyeler = new UyeGor();
                uyeler.setSifre(""+(tableRow.getPropertyAsString("sifre").toString()));
                uyeler.setAdi(""+tableRow.getPropertyAsString("ad").toString());
                uyeler.setSoyadi(""+tableRow.getPropertyAsString("soyad").toString());
                uyeler.setEmail(""+tableRow.getPropertyAsString("e_posta").toString());
                uyeler.setDog_tarihi(""+tableRow.getPropertyAsString("dog_tar").toString());
                uyeler.setKay_tar(""+tableRow.getPropertyAsString("kayit_tar").toString());
              //  uyeler.setTakim_kaytar(""+tableRow.getPropertyAsString("takim_kay_tar").toString());
                //   uyeler.setTakim(""+(tableRow.getPropertyAsString("takim_id").toString()));
                UyeGor.listeUyeGor.add(uyeler);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String uyesil(String mail) {
        String donus ="";
        SoapObject request = new SoapObject(NAMESPACE, "uyesil");

        request.addProperty("mail", mail);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(request);
        envelope.dotNet = true;
        HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
        androidHttpTransport.debug = true;
        try {
            androidHttpTransport.call("http://microsoft.com/webservices/uyesil", envelope);
            SoapPrimitive response = (SoapPrimitive) envelope.getResponse();
            response = (SoapPrimitive) envelope.getResponse();

            donus = response.toString();

        } catch (Exception e) {
            e.printStackTrace();

        }
        return donus;
    }

}
