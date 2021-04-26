package com.code.parcial2_mm18014;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.code.parcial2_mm18014.models.Libro;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    public ArrayList<Libro> libros;
    public Context context;

    public CustomAdapter(ArrayList<Libro> libros, Context context) {
        this.libros = libros;
        this.context = context;
    }

    @Override
    public int getCount() {
        return libros.size();
    }

    @Override
    public Object getItem(int position) {
        return libros.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Libro libro = (Libro) getItem(position);
        convertView = LayoutInflater.from(context).inflate(R.layout.item_list, null);

        ImageView im = (ImageView)convertView.findViewById(R.id.imageViewDetail);
        TextView titulo = (TextView)convertView.findViewById(R.id.txtTitulo);
        im.setImageResource(libro.portadaImg);
        titulo.setText(libro.TituloLibro);
        return convertView;
    }
}
