package com.example.idah.hyphen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class uye_islemleri extends AppCompatActivity {
    RequestQueue requestQueue;

    Button show;
    ListView result;
    Button cikis;
    Button anasayfa;
    Spinner spnr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uye_islemleri);
        result = (ListView) findViewById(R.id.result);
        uyecek.uyeler.clear();
        veritabani.GetUyler();
        result.setAdapter(new uyecekadapter(uye_islemleri.this, uyecek.uyeler));
        cikis = (Button) findViewById(R.id.cikis);
        anasayfa = (Button) findViewById(R.id.anasayfa);
        spnr = (Spinner) findViewById(R.id.spn);
        spnr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:

                        break;
                    case 1:
                        startActivity(new Intent(uye_islemleri.this, profil.class));
                        break;
                    case 2:
                        startActivity(new Intent(uye_islemleri.this, uye_islemleri.class));
                        break;
                    case 3:
                        startActivity(new Intent(uye_islemleri.this, tlislemleri.class));
                        break;
                    case 4:
                        startActivity(new Intent(uye_islemleri.this, isveren_islemleri.class));
                        break;
                    case 5:
                        startActivity(new Intent(uye_islemleri.this, gorev_islemleri.class));
                        break;
                    case 6:
                        startActivity(new Intent(uye_islemleri.this, duyuru_islemleri.class));
                        break;
                    case 7:
                        startActivity(new Intent(uye_islemleri.this, mesaj_islemleri.class));
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        cikis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(uye_islemleri.this, Hyphen.class));
            }
        });
       anasayfa.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(uye_islemleri.this,admin_paneli.class));
           }
       });

    }
}
