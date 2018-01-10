package com.example.idah.hyphen;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.Map;

public class Hyphen extends AppCompatActivity {

    TextView txt;
    TextView txt1;
    EditText editText3;
    EditText editText;
    Button btn;
    private ProgressDialog progress;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hyphen);
        txt=(TextView)findViewById(R.id.textView);
        txt1=(TextView)findViewById(R.id.textView1) ;
        editText3=(EditText)findViewById(R.id.editText3);
        editText=(EditText)findViewById(R.id.editText);
        btn=(Button)findViewById(R.id.button2);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mail= editText3.getText().toString();
                String sifre= editText.getText().toString();
                veritabani vrtbn = new veritabani();
                int mssg = vrtbn.Giris( mail,sifre);
                uyecek uye = new uyecek();
                    if(mssg==1 || mssg==2 || mssg==3 || mssg ==4 ){
                    switch (mssg) {
                        case 1:
                        Toast.makeText(getApplicationContext(), "Giriş Başarılı", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(getApplicationContext(), admin_paneli.class));
                        uye.setEmail(mail);
                        break;
                        case 2:
                            Toast.makeText(getApplicationContext(), "Giriş Başarılı", Toast.LENGTH_LONG).show();
                            startActivity(new Intent(getApplicationContext(), uye_anasayfa.class));
                            uye.setEmail(mail);
                            break;
                        case 3:
                            Toast.makeText(getApplicationContext(), "Giriş Başarılı", Toast.LENGTH_LONG).show();
                            startActivity(new Intent(getApplicationContext(), takimlideri_paneli.class));
                            uye.setEmail(mail);
                            break;
                        case 4:
                            Toast.makeText(getApplicationContext(), "Giriş Başarılı", Toast.LENGTH_LONG).show();
                            startActivity(new Intent(getApplicationContext(), isveren_paneli.class));
                            uye.setEmail(mail);
                            break;

                    }
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "E posta yada şifre hatalı", Toast.LENGTH_LONG).show();
                    }

            }
        });


        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                startActivity(new Intent(Hyphen.this,uye_ol.class));
            }
        });
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Hyphen.this,sifremi_unuttum.class));
            }
        });
        };


    }


