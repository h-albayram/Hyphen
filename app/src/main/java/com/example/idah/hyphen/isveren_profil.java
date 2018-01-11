package com.example.idah.hyphen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

public class isveren_profil extends AppCompatActivity {
    Button cikis;
    Button anasayfa;
    Spinner spn;
    String gelenemail;
    ListView prof;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isveren_profil);
        cikis = (Button) findViewById(R.id.cikis);
        anasayfa = (Button) findViewById(R.id.anasayfa);
        spn = (Spinner) findViewById(R.id.spn);
        prof=(ListView)findViewById(R.id.listprofil);
        Bundle extras = getIntent().getExtras();
        gelenemail = extras.getString("email");
        UyeGor uye = new UyeGor();
        UyeGor.listeUyeGor.clear();
        veritabani.profil(gelenemail.trim().toString());
        prof.setAdapter(new profiladapter(isveren_profil.this, uye.listeUyeGor));
        anasayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(isveren_profil.this, isveren_paneli.class));
            }
        });
        cikis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(isveren_profil.this, Hyphen.class));
            }
        });
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:

                        break;
                    case 1:
                        startActivity(new Intent(isveren_profil.this, isveren_profil.class));
                        Intent intent = new Intent(isveren_profil.this, isveren_profil.class);
                        intent.putExtra("email",gelenemail);
                        startActivity(intent);
                        break;
                    case 2:
                        startActivity(new Intent(isveren_profil.this, isveren_duyuru.class));
                        break;
                    case 3:
                        startActivity(new Intent(isveren_profil.this, isveren_mesaj.class));
                        Intent intent1 = new Intent(isveren_profil.this, isveren_mesaj.class);
                        intent1.putExtra("email",gelenemail);
                        startActivity(intent1);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
