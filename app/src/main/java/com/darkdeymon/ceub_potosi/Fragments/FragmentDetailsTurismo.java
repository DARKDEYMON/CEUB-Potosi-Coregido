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
import com.darkdeymon.ceub_potosi.clases.Turismo;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetailsTurismo extends Fragment {

    private Turismo turismo;
    public FragmentDetailsTurismo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_details_turismo, container, false);
        turismo = new Gson().fromJson(getArguments().getString("turismo"),Turismo.class);

        ImageView i = (ImageView) view.findViewById(R.id.imagen);
        Picasso.with(getContext()).load(turismo.getImagen().toString()).into(i);

        ((TextView)view.findViewById(R.id.nombre)).setText(turismo.getNombre());
        ((TextView)view.findViewById(R.id.calle)).setText(turismo.getCalle());
        ((TextView)view.findViewById(R.id.descripcion)).setText(turismo.getDescripcion());

        ((Button)view.findViewById(R.id.llevame)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StacticMethods.llevame(getActivity(),turismo.getUbicacion());
            }
        });
        return view;
    }

}
