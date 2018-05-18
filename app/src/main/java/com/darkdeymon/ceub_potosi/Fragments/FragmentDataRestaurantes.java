package com.darkdeymon.ceub_potosi.Fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.darkdeymon.ceub_potosi.clases.Restaurantes;
import com.darkdeymon.ceub_potosi.R;
import com.darkdeymon.ceub_potosi.adapters.AdapterRestaurantes;
import com.darkdeymon.ceub_potosi.staticDataClases.RestaurantesData;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDataRestaurantes extends Fragment {

    private ArrayList<Restaurantes> arRestaurantes;
    private AdapterRestaurantes adRestaurantes;
    private ListView lstRestaurantes;

    public FragmentDataRestaurantes() {
        // Required empty public constructor
        this.arRestaurantes = RestaurantesData.getRestaurantesData();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_data_restaurantes, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adRestaurantes = new AdapterRestaurantes(getActivity(),arRestaurantes);

        lstRestaurantes = (ListView)view.findViewById(R.id.listarestaurantes);
        lstRestaurantes.setAdapter(adRestaurantes);
        //lstRestaurantes.setOnItemClickListener(this);
    }
}
