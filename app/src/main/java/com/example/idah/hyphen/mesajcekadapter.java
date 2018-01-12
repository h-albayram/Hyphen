package com.example.idah.hyphen;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by idah on 12.01.2018.
 */

public class mesajcekadapter extends BaseAdapter {

    public Activity activity;
    private ArrayList<mesajgor> mesajgorArrayList;
    private LayoutInflater mInflater;
    public mesajcekadapter(Activity activity, ArrayList<mesajgor> Listuyeler) {
        this.activity = activity;

        mInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.mesajgorArrayList = Listuyeler;
    }
    @Override
    public int getCount() {
        return mesajgorArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return mesajgorArrayList.size();
    }

    @Override
    public long getItemId(int position) {
        return mesajgorArrayList.size();
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View satirView;
        satirView = mInflater.inflate(R.layout.mesajlist, parent, false);

        TextView Adi = (TextView) satirView.findViewById(R.id.Ad);
        TextView Soyad = (TextView) satirView.findViewById(R.id.Soyad);
        TextView mesajkonusu = (TextView) satirView.findViewById(R.id.mesajkonusu);
        TextView mesaj1 = (TextView) satirView.findViewById(R.id.mesaj);
        final TextView tarih = (TextView) satirView.findViewById(R.id.tarih);


        final mesajgor u = mesajgor.mesajgorArrayList.get(position);
        Adi.setText(""+u.getK_adi().toString());
        Soyad.setText(""+u.getK_soyad().toString());
        mesajkonusu.setText(""+u.getMesajbasligi().toString());
        mesaj1.setText(""+u.getMesaj().toString());
        tarih.setText(""+u.getTarih());



        return satirView;
    }
}
