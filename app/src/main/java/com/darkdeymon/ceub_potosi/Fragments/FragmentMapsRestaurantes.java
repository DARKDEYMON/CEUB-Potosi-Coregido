package com.darkdeymon.ceub_potosi.Fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.darkdeymon.ceub_potosi.clases.Restaurantes;
import com.darkdeymon.ceub_potosi.R;
import com.darkdeymon.darkd.ceub_potos.StaticData;
import com.darkdeymon.ceub_potosi.staticDataClases.RestaurantesData;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentMapsRestaurantes extends Fragment implements OnMapReadyCallback {

    private GoogleMap mMap;
    public FragmentMapsRestaurantes() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_maps_restaurantes, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment map =(SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        map.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(StaticData.LATITUD,StaticData.ALTURA));
        for(Restaurantes dat: RestaurantesData.getRestaurantesData()){
            map.addMarker(new MarkerOptions().title(dat.getNombre()).snippet(dat.getTelefono()).position(dat.getUbicacion()));
        }
    }
}
