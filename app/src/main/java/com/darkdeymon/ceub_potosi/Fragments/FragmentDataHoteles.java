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

import com.darkdeymon.ceub_potosi.R;
import com.darkdeymon.ceub_potosi.adapters.AdapterHoteles;
import com.darkdeymon.ceub_potosi.clases.Hoteles;
import com.darkdeymon.ceub_potosi.staticDataClases.HotelesData;
import com.google.gson.Gson;

import java.util.ArrayList;

public class FragmentDataHoteles extends Fragment implements AdapterView.OnItemClickListener {

    private ArrayList<Hoteles> arHoteles;
    private AdapterHoteles adHoteles;
    private ListView lsthoteles;

    public FragmentDataHoteles() {
        this.arHoteles = HotelesData.getHotelesData();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_data_hoteles, container, false);
        return  view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adHoteles = new AdapterHoteles(getActivity(),arHoteles);

        lsthoteles = (ListView)view.findViewById(R.id.listahoteles);
        lsthoteles.setAdapter(adHoteles);
        lsthoteles.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Hoteles  h = (Hoteles)parent.getAdapter().getItem(position);
        Bundle b = new Bundle();
        b.putString("hotel",new Gson().toJson(h));
        FragmentDetailHoteles nextFrag= new FragmentDetailHoteles();
        nextFrag.setArguments(b);
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.contenedor, nextFrag)
                .addToBackStack(null)
                .commit();
        //Log.e("item",h.getNombre());
    }
}
