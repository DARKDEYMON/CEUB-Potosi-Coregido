package com.darkdeymon.ceub_potosi.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.darkdeymon.ceub_potosi.staticDataClases.EntretenimientoData;
import com.darkdeymon.ceub_potosi.R;
import com.darkdeymon.ceub_potosi.adapters.AdapterEntretenimiento;
import com.darkdeymon.ceub_potosi.clases.Entretenimiento;

import java.util.ArrayList;

public class FragmentDataEntretenimiento extends Fragment {

    private ArrayList<Entretenimiento> arEntretenimiento;
    private AdapterEntretenimiento adEntretenimiento;
    private ListView lstEntretenimeinto;
    public FragmentDataEntretenimiento() {
        // Required empty public constructor
        this.arEntretenimiento = EntretenimientoData.getEnttetenimientoData();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_data_entretenimiento, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        adEntretenimiento = new AdapterEntretenimiento(getActivity(),arEntretenimiento);
        lstEntretenimeinto = (ListView)view.findViewById(R.id.listentretenimiento);
        lstEntretenimeinto.setAdapter(adEntretenimiento);
    }
}
