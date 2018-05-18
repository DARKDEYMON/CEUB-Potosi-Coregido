package com.darkdeymon.ceub_potosi.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.darkdeymon.ceub_potosi.clases.Bancos;
import com.darkdeymon.ceub_potosi.R;
import com.darkdeymon.darkd.ceub_potos.StacticMethods;

import java.util.ArrayList;

public class AdapterBancos extends BaseAdapter {

    private Context context;
    private ArrayList<Bancos> aBancos;

    public AdapterBancos(Context context, ArrayList<Bancos> aBancos) {
        this.context = context;
        this.aBancos = aBancos;
    }

    @Override
    public int getCount() {
        return aBancos.size();
    }

    @Override
    public Object getItem(int position) {
        return aBancos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layout = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layout.inflate(R.layout.adapter_iten_bancos,parent,false);

        final Bancos ba = aBancos.get(position);

        ((TextView)view.findViewById(R.id.nombre)).setText(ba.getNombre());
        ((TextView)view.findViewById(R.id.calle)).setText("Calle: "+ba.getCalle());
        ((TextView)view.findViewById(R.id.tipo)).setText("Tipo: "+ba.getTipo());

        ((Button)view.findViewById(R.id.llevame)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StacticMethods.llevame(context,ba.getUbicacion());
            }
        });
        return view;
    }
}
