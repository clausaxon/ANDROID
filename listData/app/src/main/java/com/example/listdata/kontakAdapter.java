package com.example.listdata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.w3c.dom.Text;

import java.util.List;

public class kontakAdapter extends ArrayAdapter<kontak> {
    private static class ViewHolder {
        TextView nama;
        TextView nohp;
    }

    public kontakAdapter(Context context, int resource, List<kontak> objects) {
        super(context, resource, objects);
    }

    public View getView(int position, View ConvertView, ViewGroup parent) {
        kontak dtkontak = getItem(position);

        ViewHolder viewKontak;
        if (ConvertView == null) {
            viewKontak = new ViewHolder();
            ConvertView = LayoutInflater.from(getContext()).
                    inflate(R.layout.item_user, parent, false);
            viewKontak.nama = (TextView) ConvertView.findViewById(R.id.tNama);
            viewKontak.nohp = (TextView) ConvertView.findViewById(R.id.tnoHp);

            ConvertView.setTag(viewKontak);

            //Button btn = (Button) ConvertView.findViewById(R.id.btn);
            //btn.setTag(position);
            //btn.setOnClickListener(op);
        } else {
            viewKontak = (ViewHolder) ConvertView.getTag();
            //TextView tNama= (TextView) ConvertView.findViewById(R.id.tNama);
            //TextView tnoHp= (TextView) ConvertView.findViewById(R.id.tnoHp);

            //tNama.setText(dtkontak.getNama());
            //tnoHp.setText(dtkontak.getNoHp());

            //return ConvertView;
        }
        viewKontak.nama.setText(dtkontak.getNama());
        viewKontak.nohp.setText(dtkontak.getNoHp());
        return ConvertView;

    }
}
