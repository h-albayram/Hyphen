package com.example.idah.hyphen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

public class uye_mesaj extends AppCompatActivity {

    Button cikis, anasayfa;
    Spinner spn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uye_mesaj);
        cikis = (Button) findViewById(R.id.cikis);
        anasayfa = (Button) findViewById(R.id.anasayfa);
        spn = (Spinner) findViewById(R.id.spn);
        cikis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(uye_mesaj.this, Hyphen.class));
            }
        });
        anasayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(uye_mesaj.this, uye_anasayfa.class));
            }
        });
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:

                        break;
                    case 1:
                        startActivity(new Intent(uye_mesaj.this, uye_profil.class));
                        break;
                    case 2:
                        startActivity(new Intent(uye_mesaj.this, uye_gorev.class));
                        break;
                    case 3:
                        startActivity(new Intent(uye_mesaj.this, uye_duyuru.class));
                        break;
                    case 4:
                        startActivity(new Intent(uye_mesaj.this, uye_mesaj.class));
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
