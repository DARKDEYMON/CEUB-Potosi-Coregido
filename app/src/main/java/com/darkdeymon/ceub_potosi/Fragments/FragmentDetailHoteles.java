package com.darkdeymon.ceub_potosi.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.darkdeymon.ceub_potosi.R;
import com.darkdeymon.darkd.ceub_potos.StacticMethods;
import com.darkdeymon.ceub_potosi.clases.Hoteles;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetailHoteles extends Fragment {

    private Hoteles hotel;

    public FragmentDetailHoteles() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_detail_hoteles, container, false);

        hotel = new Gson().fromJson(getArguments().getString("hotel"),Hoteles.class);

        ImageView i = (ImageView) view.findViewById(R.id.imagen);
        Picasso.with(getContext()).load(hotel.getImagen().toString()).into(i);

        ((TextView)view.findViewById(R.id.nombre)).setText(hotel.getNombre());
        ((TextView)view.findViewById(R.id.direccion)).setText(hotel.getDireccion());
        ((TextView)view.findViewById(R.id.web)).setText(hotel.getWeb());
        ((TextView)view.findViewById(R.id.email)).setText(hotel.getEmail());
        ((Button)view.findViewById(R.id.llevame)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StacticMethods.llevame(getActivity(),hotel.getUbicacion());
            }
        });
        return view;
    }

}
