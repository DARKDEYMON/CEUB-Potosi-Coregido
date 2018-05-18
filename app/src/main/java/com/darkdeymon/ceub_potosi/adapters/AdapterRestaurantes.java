package com.darkdeymon.ceub_potosi.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.darkdeymon.darkd.ceub_potos.StacticMethods;
import com.darkdeymon.ceub_potosi.clases.Restaurantes;
import com.darkdeymon.ceub_potosi.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterRestaurantes extends BaseAdapter {

    private Context context;
    private ArrayList<Restaurantes> aRestaurantes;

    public AdapterRestaurantes(Context context, ArrayList<Restaurantes> aRestaurantes) {
        this.context = context;
        this.aRestaurantes = aRestaurantes;
    }

    @Override
    public int getCount() {
        return aRestaurantes.size();
    }

    @Override
    public Object getItem(int position) {
        return aRestaurantes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layout = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layout.inflate(R.layout.adapter_item_restaurantes,parent,false);

        final Restaurantes re =aRestaurantes.get(position);
        ImageView i = (ImageView) view.findViewById(R.id.image);
        Log.e("Aqui",re.getImagen().toString());
        Picasso.with(context).load(re.getImagen().toString()).into(i);

        ((TextView)view.findViewById(R.id.nombre)).setText(re.getNombre());
        ((TextView)view.findViewById(R.id.telefono)).setText("Telefono: "+re.getTelefono());
        ((TextView)view.findViewById(R.id.direccion)).setText("Direcciòn: "+re.getDireccion());
        ((Button)view.findViewById(R.id.llevame)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StacticMethods.llevame(context,re.getUbicacion());
            }
        });
        return view;
    }
}
