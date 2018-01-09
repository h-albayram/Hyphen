package com.example.idah.hyphen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

public class uye_anasayfa extends AppCompatActivity {
    Button cikis;
    Button anasayfa;
    Spinner spn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uye_anasayfa);
        cikis=(Button)findViewById(R.id.cikis);
        anasayfa=(Button)findViewById(R.id.anasayfa);
        spn=(Spinner)findViewById(R.id.spn);
        cikis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(uye_anasayfa.this,Hyphen.class));
            }
        });
        anasayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(uye_anasayfa.this,uye_islemleri.class));
            }
        });
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:startActivity(new Intent(uye_anasayfa.this,profil.class)); break;
                    case 1: startActivity(new Intent(uye_anasayfa.this,gorevler.class)); break;
                    case 2: startActivity(new Intent(uye_anasayfa.this,duyuru_islemleri.class)); break;
                    case 3:startActivity(new Intent(uye_anasayfa.this,mesaj_islemleri.class)); break;}
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}