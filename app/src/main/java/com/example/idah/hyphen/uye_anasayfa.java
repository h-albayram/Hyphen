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
    String gelenemail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uye_anasayfa);
        cikis = (Button) findViewById(R.id.cikis);
        anasayfa = (Button) findViewById(R.id.anasayfa);
        spn = (Spinner) findViewById(R.id.spn);
        Bundle extras = getIntent().getExtras();
        gelenemail = extras.getString("email");
        cikis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(uye_anasayfa.this, Hyphen.class));
            }
        });
        anasayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(uye_anasayfa.this, uye_anasayfa.class));
            }
        });
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:

                        break;
                    case 1:
                        startActivity(new Intent(uye_anasayfa.this, uye_profil.class));
                        Intent intent = new Intent(uye_anasayfa.this, uye_profil.class);
                        intent.putExtra("email",gelenemail);
                        startActivity(intent);
                        break;
                    case 2:
                        startActivity(new Intent(uye_anasayfa.this, uye_gorev.class));
                        break;
                    case 3:
                        startActivity(new Intent(uye_anasayfa.this, uye_duyuru.class));
                        break;
                    case 4:
                        startActivity(new Intent(uye_anasayfa.this, uye_mesaj.class));
                        startActivity(new Intent(uye_anasayfa.this, uye_mesaj.class));
                        Intent intent1 = new Intent(uye_anasayfa.this, uye_mesaj.class);
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
