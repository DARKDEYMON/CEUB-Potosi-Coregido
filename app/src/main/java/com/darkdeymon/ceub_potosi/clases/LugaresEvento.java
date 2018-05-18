package com.darkdeymon.ceub_potosi.clases;

import com.google.android.gms.maps.model.LatLng;

public class LugaresEvento {
    private String lugar;
    private LatLng ubicacion;

    public LugaresEvento(String lugar,float Lat, float Lng) {
        this.lugar = lugar;
        this.ubicacion = new LatLng(Lat,Lng);
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LatLng getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(LatLng ubicacion) {
        this.ubicacion = ubicacion;
    }
}
