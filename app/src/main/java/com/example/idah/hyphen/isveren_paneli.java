package com.example.idah.hyphen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;


public class isveren_paneli extends AppCompatActivity {

    Button cikis;
    Button anasayfa;
    Spinner spn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isveren_paneli);
        cikis=(Button)findViewById(R.id.cikis);
        anasayfa=(Button)findViewById(R.id.anasayfa);
        spn=(Spinner)findViewById(R.id.spn);
        anasayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(isveren_paneli.this,isveren_paneli.class));
            }
        });
        cikis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(isveren_paneli.this,Hyphen.class));
            }
        });
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:startActivity(new Intent(isveren_paneli.this,profil.class)); break;
                    case 1:startActivity(new Intent(isveren_paneli.this,duyuru_islemleri.class)); break;
                    case 2:startActivity(new Intent(isveren_paneli.this,mesaj_islemleri.class)); break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
