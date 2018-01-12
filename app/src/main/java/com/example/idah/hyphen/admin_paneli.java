package com.example.idah.hyphen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

public class admin_paneli extends AppCompatActivity {

    Button cikis;
    Button anasayfa;
    Spinner spnr;
    String gelenemail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_paneli);
        cikis = (Button) findViewById(R.id.cikis);
        anasayfa = (Button) findViewById(R.id.anasayfa);
        spnr = (Spinner) findViewById(R.id.spn);
        Bundle extras = getIntent().getExtras();
        gelenemail = extras.getString("email");


        spnr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:

                        break;
                    case 1:
                        startActivity(new Intent(admin_paneli.this, profil.class));
                        Intent intent = new Intent(admin_paneli.this, profil.class);
                        intent.putExtra("email",gelenemail);
                        startActivity(intent);
                        break;
                    case 2:
                        startActivity(new Intent(admin_paneli.this, uye_islemleri.class));
                        break;
                    case 3:
                        startActivity(new Intent(admin_paneli.this, tlislemleri.class));
                        break;
                    case 4:
                        startActivity(new Intent(admin_paneli.this, isveren_islemleri.class));
                        break;
                    case 5:
                        startActivity(new Intent(admin_paneli.this, gorev_islemleri.class));
                        break;
                    case 6:
                        startActivity(new Intent(admin_paneli.this, duyuru_islemleri.class));
                        Intent intent6 = new Intent(admin_paneli.this, duyuru_islemleri.class);
                        intent6.putExtra("email",gelenemail);
                        startActivity(intent6);
                        break;
                    case 7:
                        startActivity(new Intent(admin_paneli.this, mesaj_islemleri.class));
                        Intent intent1 = new Intent(admin_paneli.this, mesaj_islemleri.class);
                        intent1.putExtra("email",gelenemail);
                        startActivity(intent1);
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
                startActivity(new Intent(admin_paneli.this, Hyphen.class));
            }
        });
        anasayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(admin_paneli.this,admin_paneli.class));
            }
        });
    }
}
