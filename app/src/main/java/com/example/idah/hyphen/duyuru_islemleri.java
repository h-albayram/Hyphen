package com.example.idah.hyphen;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class duyuru_islemleri extends AppCompatActivity {


    static final String url="http://hadialbayram.co.nf/uyeler.php";
    JSONObject json;
    TextView text;
    ListView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duyuru_islemleri);
        text=(TextView)findViewById(R.id.deneme);
        txt=(ListView)findViewById(R.id.txt);
        new baglan().execute();

    }
    protected JSONObject webservice() throws IOException, JSONException {
        HttpClient client = new DefaultHttpClient();
        HttpGet get= new HttpGet(url);
        HttpResponse cevap= client.execute(get);
        StatusLine statu=cevap.getStatusLine();
        int s= statu.getStatusCode();
        if(s==200){
            HttpEntity e =cevap.getEntity();
            String gelen= EntityUtils.toString(e);
            JSONArray veri=new JSONArray(gelen);
            JSONObject sondeger=veri.getJSONObject(0);
            return sondeger;
        }
        return null;
    }
    public class baglan extends AsyncTask<String,String,String>{

        @Override
        protected String doInBackground(String... strings) {
            HttpClient client = new DefaultHttpClient();
            HttpGet get= new HttpGet(url);
            HttpResponse cevap= null;
            try {
                cevap = client.execute(get);
            } catch (IOException e) {
                e.printStackTrace();
            }
            StatusLine statu=cevap.getStatusLine();
            int s= statu.getStatusCode();
            if(s==200){
                HttpEntity e =cevap.getEntity();
                String gelen= null;
                try {
                    gelen = EntityUtils.toString(e);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                JSONArray veri= null;
                try {
                    veri = new JSONArray(gelen);
                } catch (JSONException e1) {
                    e1.printStackTrace();
                }
                JSONObject sondeger= null;
                try {
                    for(int i =0;i<=veri.length();i++){
                    sondeger = veri.getJSONObject(i);
                    json=sondeger;
                    String id=json.getString("Id");
                        String ad = json.getString("Ad");
                        String soyad = json.getString("Soyad");
                        String e_posta = json.getString("E_posta");
                        String dogtar = json.getString("Dog_tar");
                        String kayit_tar = json.getString("Kayit_tar");
                        String yetki = json.getString("Yetki");
                        String[] deneme = {id, ad, soyad, e_posta, yetki};
                        ArrayAdapter<Object> veriAdaptoru = new ArrayAdapter<Object>
                                (duyuru_islemleri.this, android.R.layout.simple_list_item_1, android.R.id.text1, deneme);
                        txt.setAdapter(veriAdaptoru);

                    }

                } catch (JSONException e1) {
                    e1.printStackTrace();
                }

            }

            return null;

        }

        @Override
        protected void onPostExecute(String data) {
            text.setText(data);
        }
    }
}
