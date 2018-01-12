package com.example.idah.hyphen;

import android.app.Activity;
import android.content.Context;
import android.graphics.ColorSpace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by idah on 10.01.2018.
 */

public class profiladapter extends BaseAdapter {

    public Activity activity;
    private ArrayList<UyeGor> Listuyeler;
    private LayoutInflater mInflater;

    public profiladapter(Activity activity, ArrayList<UyeGor> Listuyeler) {
        this.activity = activity;

        mInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.Listuyeler = Listuyeler;
    }

    @Override
    public int getCount() {
        return Listuyeler.size();
    }

    @Override
    public Object getItem(int position) {
        return Listuyeler.size();
    }

    @Override
    public long getItemId(int position) {
        return Listuyeler.size();
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View satirView;
        satirView = mInflater.inflate(R.layout.profilgor, parent, false);

        TextView Adi = (TextView) satirView.findViewById(R.id.P_Ad);
        TextView Soyad = (TextView) satirView.findViewById(R.id.P_Soyad);
        TextView Sifre = (TextView) satirView.findViewById(R.id.P_Sifre);
        TextView eposta = (TextView) satirView.findViewById(R.id.P_eposta);
        final TextView takim = (TextView) satirView.findViewById(R.id.P_Takim);
        TextView kayit_tar = (TextView) satirView.findViewById(R.id.P_kayittarihi);
        TextView takim_kayit = (TextView) satirView.findViewById(R.id.P_t_kayittar);

        final UyeGor u = UyeGor.listeUyeGor.get(position);
        Adi.setText("" + u.getAdi().toString());
        Soyad.setText("" + u.getSoyadi().toString());
        Sifre.setText("" + u.getSifre().toString());
        eposta.setText("" + u.getEmail().toString());
        takim.setText("" + u.getTakim());
        takim_kayit.setText("" + u.getTakim_kaytar());
        kayit_tar.setText("" + u.getKay_tar());


        return satirView;
    }
}
