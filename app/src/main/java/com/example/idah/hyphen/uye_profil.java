package com.example.idah.hyphen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

public class uye_profil extends AppCompatActivity {

    Button cikis,anasayfa;
    Spinner spn;
    String gelenemail;
    ListView prof;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uye_profil);
        cikis = (Button) findViewById(R.id.cikis);
        anasayfa = (Button) findViewById(R.id.anasayfa);
        spn = (Spinner) findViewById(R.id.spn);
        prof=(ListView)findViewById(R.id.listprofil) ;
        Bundle extras = getIntent().getExtras();
        gelenemail = extras.getString("email");
        UyeGor uye = new UyeGor();
        UyeGor.listeUyeGor.clear();
        veritabani.profil(gelenemail.trim().toString());
        prof.setAdapter(new profiladapter(uye_profil.this, uye.listeUyeGor));
        cikis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(uye_profil.this, Hyphen.class));
            }
        });
        anasayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(uye_profil.this, uye_anasayfa.class));
            }
        });
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:

                        break;
                    case 1:
                        startActivity(new Intent(uye_profil.this, uye_profil.class));
                        Intent intent = new Intent(uye_profil.this, uye_profil.class);
                        intent.putExtra("email",gelenemail);
                        startActivity(intent);
                        break;
                    case 2:
                        startActivity(new Intent(uye_profil.this, uye_gorev.class));
                        break;
                    case 3:
                        startActivity(new Intent(uye_profil.this, uye_duyuru.class));
                        break;
                    case 4:
                        startActivity(new Intent(uye_profil.this, uye_mesaj.class));
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
