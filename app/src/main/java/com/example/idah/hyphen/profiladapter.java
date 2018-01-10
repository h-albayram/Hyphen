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

public class profiladapter extends BaseAdapter{

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

        TextView Adi = (TextView) satirView.findViewById(R.id.Ad);
        TextView Soyad = (TextView) satirView.findViewById(R.id.Soyad);
        TextView Sifre = (TextView) satirView.findViewById(R.id.Sifre);
        TextView eposta = (TextView) satirView.findViewById(R.id.eposta);
        final TextView takim = (TextView) satirView.findViewById(R.id.Takim);
        TextView kayit_tar = (TextView) satirView.findViewById(R.id.kayittarihi);
        TextView takim_kayit=(TextView)satirView.findViewById(R.id.t_kayittar);

        final UyeGor u = UyeGor.listeUyeGor.get(position);
        Adi.setText(""+u.getAdi().toString());
        Soyad.setText(""+u.getSoyadi().toString());
        Sifre.setText(""+u.getSifre().toString());
        eposta.setText(""+u.getEmail().toString());
        takim.setText(""+u.getTakim().toString());
        takim_kayit.setText(""+u.getTakim_kaytar().toString());
        kayit_tar.setText(""+u.getKay_tar().toString());


        return satirView;
    }
}
