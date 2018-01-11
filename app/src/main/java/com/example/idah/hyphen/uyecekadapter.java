package com.example.idah.hyphen;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by idah on 9.01.2018.
 */

public class uyecekadapter extends BaseAdapter {
    public Activity activity;
    private ArrayList<uyecek> Listuyeler;
    private LayoutInflater mInflater;
    public uyecekadapter(Activity activity, ArrayList<uyecek> Listuyeler) {
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
        satirView = mInflater.inflate(R.layout.listuyecek, parent, false);
        Button silme = (Button) satirView.findViewById(R.id.sill);

        TextView Adi = (TextView) satirView.findViewById(R.id.Ad);
        TextView Soyad = (TextView) satirView.findViewById(R.id.Soyad);
        TextView Sifre = (TextView) satirView.findViewById(R.id.Sifre);
       final TextView Tipi = (TextView) satirView.findViewById(R.id.eposta);
        final TextView Email = (TextView) satirView.findViewById(R.id.yetki);
        TextView Kullanici_Durum = (TextView) satirView.findViewById(R.id.kayittarihi);
        final uyecek u = uyecek.uyeler.get(position);


        Adi.setText(u.getAdi().toString());
        Soyad.setText(u.getSoyadi().toString());
        Sifre.setText(u.getSifre().toString());
        Tipi.setText(u.getemail().toString());
        Email.setText(u.getYetki().toString());
        Kullanici_Durum.setText(u.getKay_tar().toString());
        silme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Listuyeler.remove(position); //or some other task
                veritabani webServis = new veritabani();
                String donus;
                String mail=Tipi.getText().toString();
               donus = webServis.uyesil(mail);
               Toast.makeText(activity, "" + donus, Toast.LENGTH_LONG).show();
               notifyDataSetChanged();
            }
        });

        return satirView;
    }
}
