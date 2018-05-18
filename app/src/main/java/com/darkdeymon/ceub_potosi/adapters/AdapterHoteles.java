package com.darkdeymon.ceub_potosi.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.darkdeymon.ceub_potosi.R;
import com.darkdeymon.ceub_potosi.clases.Hoteles;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.util.ArrayList;

public class AdapterHoteles extends BaseAdapter {

    private Context context;
    private ArrayList<Hoteles> aHoteles;

    public AdapterHoteles(Context context, ArrayList<Hoteles> aHoteles) {
        this.context = context;
        this.aHoteles = aHoteles;
    }

    @Override
    public int getCount() {
        return aHoteles.size();
    }

    @Override
    public Object getItem(int position) {
        return aHoteles.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layout = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layout.inflate(R.layout.adapter_item_hoteles,parent,false);

        Hoteles ho =aHoteles.get(position);
        final LinearLayout layoutbase = view.findViewById(R.id.lineaprinsipal);


        //ImageView i = (ImageView) view.findViewById(R.id.image);
        //Log.e("Aqui",ho.getImagen().toString());
        //Picasso.with(context).load(ho.getImagen().toString()).into(i);

        Picasso.with(context).load(ho.getImagen().toString()).into(new Target() {
            @Override
            public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                layoutbase.setBackground(new BitmapDrawable(bitmap));
            }

            @Override
            public void onBitmapFailed(Drawable errorDrawable) {

            }

            @Override
            public void onPrepareLoad(Drawable placeHolderDrawable) {

            }
        });

        ((TextView)view.findViewById(R.id.nombre)).setText(ho.getNombre());
        ((TextView)view.findViewById(R.id.telefono)).setText(ho.getTelefono());
        return view;
    }
}