package com.example.idah.hyphen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

public class profil extends AppCompatActivity {
    ListView result;
    Button cikis;
    Button anasayfa;
    Spinner spnr;
    String gelenemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        result = (ListView) findViewById(R.id.listprofil);
        cikis = (Button) findViewById(R.id.cikis);
        anasayfa = (Button) findViewById(R.id.anasayfa);
        spnr = (Spinner) findViewById(R.id.spn);
        UyeGor uye = new UyeGor();
        UyeGor.listeUyeGor.clear();
        Bundle extras = getIntent().getExtras();
        gelenemail = extras.getString("email");

        veritabani.profil(gelenemail.trim().toString());
        result.setAdapter(new profiladapter(profil.this, uye.listeUyeGor));
        spnr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        break;

                    case 1:
                        startActivity(new Intent(profil.this, profil.class));
                        break;
                    case 2:
                        startActivity(new Intent(profil.this, uye_islemleri.class));
                        break;
                    case 3:
                        startActivity(new Intent(profil.this, tlislemleri.class));
                        break;
                    case 4:
                        startActivity(new Intent(profil.this, isveren_islemleri.class));
                        break;
                    case 5:
                        startActivity(new Intent(profil.this, gorev_islemleri.class));
                        break;
                    case 6:
                        startActivity(new Intent(profil.this, duyuru_islemleri.class));
                        break;
                    case 7:
                        startActivity(new Intent(profil.this, mesaj_islemleri.class));
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
                startActivity(new Intent(profil.this, Hyphen.class));
            }
        });
        anasayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profil.this, admin_paneli.class));
            }
        });


    }
}
