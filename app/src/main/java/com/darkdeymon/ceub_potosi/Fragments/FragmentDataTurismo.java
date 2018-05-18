package com.darkdeymon.ceub_potosi.Fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.darkdeymon.ceub_potosi.staticDataClases.TurismoData;
import com.darkdeymon.ceub_potosi.R;
import com.darkdeymon.ceub_potosi.adapters.AdapterTurismo;
import com.darkdeymon.ceub_potosi.clases.Turismo;
import com.google.gson.Gson;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDataTurismo extends Fragment implements AdapterView.OnItemClickListener {

    private ArrayList<Turismo> arTurismo;
    private AdapterTurismo adTurismo;
    private ListView lstTurismo;

    public FragmentDataTurismo() {
        // Required empty public constructor
        arTurismo = TurismoData.getTurismoData();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_data_turismo, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        adTurismo = new AdapterTurismo(getActivity(),arTurismo);
        lstTurismo = (ListView)view.findViewById(R.id.listaturismo);
        lstTurismo.setAdapter(adTurismo);
        lstTurismo.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Turismo t = (Turismo)parent.getAdapter().getItem(position);
        Bundle b = new Bundle();
        b.putString("turismo",new Gson().toJson(t));
        FragmentDetailsTurismo nextFrag= new FragmentDetailsTurismo();
        nextFrag.setArguments(b);
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.contenedor, nextFrag)
                .addToBackStack(null)
                .commit();
    }
}
