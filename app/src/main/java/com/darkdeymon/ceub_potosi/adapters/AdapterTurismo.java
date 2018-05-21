package com.darkdeymon.ceub_potosi.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.darkdeymon.ceub_potosi.clases.Turismo;
import com.darkdeymon.ceub_potosi.R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.util.ArrayList;

public class AdapterTurismo extends BaseAdapter {
    private Context context;
    private ArrayList<Turismo> aTurismo;

    public AdapterTurismo(Context context, ArrayList<Turismo> aTurismo) {
        this.context = context;
        this.aTurismo = aTurismo;
    }

    @Override
    public int getCount() {
        return aTurismo.size();
    }

    @Override
    public Object getItem(int position) {
        return aTurismo.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layout = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layout.inflate(R.layout.adapter_item_turismo,parent,false);

        //final LinearLayout layoutbase = view.findViewById(R.id.lineaprinsipal);

        Turismo tu = aTurismo.get(position);

        ((TextView)view.findViewById(R.id.nombre)).setText(tu.getNombre());
        ((TextView)view.findViewById(R.id.calle)).setText("Calle: "+tu.getCalle());
        ImageView i = (ImageView) view.findViewById(R.id.image);
        Picasso.with(context).load(tu.getImagen().toString()).into(i);
        /*
        Picasso.with(context).load(tu.getImagen().toString()).into(new Target() {
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
        */
        return view;
    }
}
