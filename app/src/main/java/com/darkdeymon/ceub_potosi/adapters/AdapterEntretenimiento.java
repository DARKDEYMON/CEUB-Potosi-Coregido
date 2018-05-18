package com.darkdeymon.ceub_potosi.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.darkdeymon.ceub_potosi.clases.Entretenimiento;
import com.darkdeymon.ceub_potosi.R;
import com.darkdeymon.darkd.ceub_potos.StacticMethods;

import java.util.ArrayList;

public class AdapterEntretenimiento extends BaseAdapter {

    Context context;
    ArrayList<Entretenimiento> aEntretenimiento;

    public AdapterEntretenimiento(Context context, ArrayList<Entretenimiento> aEntretenimiento) {
        this.context = context;
        this.aEntretenimiento = aEntretenimiento;
    }

    @Override
    public int getCount() {
        return aEntretenimiento.size();
    }

    @Override
    public Object getItem(int position) {
        return aEntretenimiento.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layout = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layout.inflate(R.layout.adapter_item_entretenimiento,parent,false);

        final Entretenimiento en = aEntretenimiento.get(position);

        ((TextView)view.findViewById(R.id.nombre)).setText(en.getNonbre());
        ((TextView)view.findViewById(R.id.calle)).setText("Calle: "+en.getCalle());
        ((TextView)view.findViewById(R.id.caracteristicas)).setText("Caracteristicas: "+en.getCaracteristicas());
        ((Button)view.findViewById(R.id.llevame)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StacticMethods.llevame(context,en.getUbicacion());
            }
        });
        return view;
    }
}
