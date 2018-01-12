package com.example.idah.hyphen;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

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

    Button mesajyaz,  cikis, anasayfa;
    Spinner spnr;
    EditText mesajkonusu;
    MultiAutoCompleteTextView mesajicerigi;
    String gelenemail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duyuru_islemleri);
        mesajicerigi = (MultiAutoCompleteTextView) findViewById(R.id.mlttext);
        mesajkonusu = (EditText) findViewById(R.id.edt1);

        cikis = (Button) findViewById(R.id.cikis);
        anasayfa = (Button) findViewById(R.id.anasayfa);
        spnr = (Spinner) findViewById(R.id.spn);
        mesajyaz = (Button) findViewById(R.id.duyuru);
        mesajyaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle extras = getIntent().getExtras();
                gelenemail = extras.getString("email");
                String mesajkonus=mesajkonusu.getText().toString();
                String mesaj=mesajicerigi.getText().toString();
                veritabani vrtbn = new veritabani();
                String donus=vrtbn.duyuruekle(gelenemail,mesajkonus,mesaj);
                Toast.makeText(getApplicationContext(),donus, Toast.LENGTH_LONG).show();
            }
        });
        spnr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:

                        break;
                    case 1:
                        startActivity(new Intent(duyuru_islemleri.this, profil.class));
                        Intent intent = new Intent(duyuru_islemleri.this, profil.class);
                        intent.putExtra("email",gelenemail);
                        startActivity(intent);
                        break;
                    case 2:
                        startActivity(new Intent(duyuru_islemleri.this, uye_islemleri.class));
                        break;
                    case 3:
                        startActivity(new Intent(duyuru_islemleri.this, tlislemleri.class));
                        Intent intent2 = new Intent(duyuru_islemleri.this, tlislemleri.class);
                        intent2.putExtra("email",gelenemail);
                        startActivity(intent2);
                        break;
                    case 4:
                        startActivity(new Intent(duyuru_islemleri.this, isveren_islemleri.class));
                        Intent intent3 = new Intent(duyuru_islemleri.this, isveren_islemleri.class);
                        intent3.putExtra("email",gelenemail);
                        startActivity(intent3);
                        break;
                    case 5:
                        startActivity(new Intent(duyuru_islemleri.this, gorev_islemleri.class));
                        Intent intent4 = new Intent(duyuru_islemleri.this, gorev_islemleri.class);
                        intent4.putExtra("email",gelenemail);
                        startActivity(intent4);
                        break;
                    case 6:
                        startActivity(new Intent(duyuru_islemleri.this, duyuru_islemleri.class));
                        Intent intent6 = new Intent(duyuru_islemleri.this, duyuru_islemleri.class);
                        intent6.putExtra("email",gelenemail);
                        startActivity(intent6);
                        break;
                    case 7:
                        startActivity(new Intent(duyuru_islemleri.this, mesaj_islemleri.class));
                        Intent intent5 = new Intent(duyuru_islemleri.this, mesaj_islemleri.class);
                        intent5.putExtra("email",gelenemail);
                        startActivity(intent5);
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
                startActivity(new Intent(duyuru_islemleri.this, Hyphen.class));
            }
        });
        anasayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(duyuru_islemleri.this, admin_paneli.class));
            }
        });
    }
}
