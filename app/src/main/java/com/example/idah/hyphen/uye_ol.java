package com.example.idah.hyphen;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
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

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static android.content.ContentValues.TAG;

public class uye_ol extends AppCompatActivity {
    private static final String url = "http://hadialbayram.co.nf/uyeekle.php";
    private DatePickerDialog.OnDateSetListener mdts;
    private Spinner spn;
    private ProgressDialog progress;
    private int yetki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uye_ol);

        final EditText snc = (EditText) findViewById(R.id.editText7);
        final EditText sifre = (EditText) findViewById(R.id.editText1);
        final EditText ad = (EditText) findViewById(R.id.editText2);
        final EditText soyad = (EditText) findViewById(R.id.editText3);
        final EditText email = (EditText) findViewById(R.id.editText5);
        final TextView dogumtar = (TextView) findViewById(R.id.tarih);
        TextView grntl = (TextView) findViewById(R.id.textView2);
        final String foto = "asd";
        spn = (Spinner) findViewById(R.id.spn);
        String[] sayilar = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] islemler = {"+", "-", "/", "*"};
        final int index = (int) (Math.random() * 9);
        final int index1 = (int) (Math.random() * 9);
        final int index2 = (int) (Math.random() * 3);
        final String isl = islemler[index2];
        final int sayi1 = Integer.valueOf(sayilar[index]);
        final int sayi2 = Integer.valueOf(sayilar[index1]);
        grntl.setText("" + sayilar[index] + "" + isl + "" + sayilar[index1] + "");
        Button kayit = (Button) findViewById(R.id.btn1);
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        yetki = 2;
                        break;
                    case 1:
                        yetki = 3;
                        break;
                    case 2:
                        yetki = 4;
                        break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        dogumtar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int yil = cal.get(Calendar.YEAR);
                int ay = cal.get(Calendar.MONTH);
                int gun = cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog dialog = new DatePickerDialog(uye_ol.this, android.R.style.Theme_Holo_Dialog_MinWidth, mdts, yil, ay, gun);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        mdts = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month = month + 1;

                Log.d(TAG, "onDateSet: gg/aa/yy" + dayOfMonth + "/" + month + "/" + year);
                String tarih = dayOfMonth + "/" + month + "/" + year;
                dogumtar.setText(tarih);
            }
        };

        kayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Date kayittarihi = new Date();

                int sonuc = 0;
                if (index2 == 0) {
                    sonuc = sayi1 + sayi2;
                } else if (index2 == 1) {
                    sonuc = sayi1 - sayi2;
                } else if (index2 == 2) {
                    sonuc = sayi1 / sayi2;
                } else if (index2 == 3) {
                    sonuc = sayi2 * sayi1;
                }

                int kontrol = 0;
                kontrol = Integer.valueOf(snc.getText().toString());
                if (sonuc == kontrol) {

                    veritabani vrtbn = new veritabani();
                    String mssg = vrtbn.KayitOl(sifre.getText().toString(), ad.getText().toString(), soyad.getText().toString(), email.getText().toString(), dogumtar.getText().toString(), yetki, foto);
                    Toast.makeText(uye_ol.this, mssg, Toast.LENGTH_LONG).show();
                } else {
                    String mesaj1 = "Girilen Sonuç Değeri Hatalı";
                    Toast.makeText(uye_ol.this, mesaj1, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}











