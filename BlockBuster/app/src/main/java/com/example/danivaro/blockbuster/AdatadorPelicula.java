package com.example.danivaro.blockbuster;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class AdatadorPelicula extends BaseAdapter {

    ArrayList<Pelicula> lista;
    LayoutInflater inflador;

    public AdatadorPelicula(Context context, ArrayList<Pelicula> lista){
        this.inflador = LayoutInflater.from(context);
        this.lista=lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {

        return lista.get(position);

    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MainActivity contenedor = null;
        if(convertView == null){
            view = inflador.inflate(R.layout.)
        }
        return null;
    }

}
