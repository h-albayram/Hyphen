package com.example.idah.hyphen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class uye_islemleri extends AppCompatActivity {
    RequestQueue requestQueue;
    Button cikis;
    Button anasayfa;
    Spinner spn;
    Button show;
    ListView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uye_islemleri);
        result = (ListView) findViewById(R.id.result);
        uyecek.uyeler.clear();
        veritabani.GetUyler();
        result.setAdapter(new uyecekadapter(uye_islemleri.this, uyecek.uyeler));



    }
}
