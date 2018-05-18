package com.darkdeymon.ceub_potosi.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.darkdeymon.darkd.ceub_potos.StacticMethods;
import com.darkdeymon.ceub_potosi.clases.CentrosSalud;
import com.darkdeymon.ceub_potosi.R;

import java.util.ArrayList;

public class AdapterCentroSalud extends BaseAdapter {

    private Context context;
    private ArrayList<CentrosSalud> aCentroSalud;

    public AdapterCentroSalud(Context context, ArrayList<CentrosSalud> aCentroSalud) {
        this.context = context;
        this.aCentroSalud = aCentroSalud;
    }

    @Override
    public int getCount() {
        return aCentroSalud.size();
    }

    @Override
    public Object getItem(int position) {
        return aCentroSalud.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layout = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layout.inflate(R.layout.adapter_item_centros_salud,parent,false);

        final CentrosSalud cs = aCentroSalud.get(position);

        ((TextView)view.findViewById(R.id.nombre)).setText(cs.getNombre());
        ((TextView)view.findViewById(R.id.zona)).setText(cs.getZona());
        ((TextView)view.findViewById(R.id.nombre)).setText(cs.getNombre());
        ((Button)view.findViewById(R.id.llevame)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StacticMethods.llevame(context,cs.getUbicacion());
            }
        });
        return view;
    }
}
