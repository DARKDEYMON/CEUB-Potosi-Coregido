package com.darkdeymon.ceub_potosi.clases;

import com.google.android.gms.maps.model.LatLng;

public class Entretenimiento {
    private String nonbre;
    private String calle;
    private String caracteristicas;
    private LatLng ubicacion;

    public Entretenimiento(String nonbre, String calle, String caracteristicas, float Lat, float Lng) {
        this.nonbre = nonbre;
        this.calle = calle;
        this.caracteristicas = caracteristicas;
        this.ubicacion = new LatLng(Lat,Lng);
    }

    public String getNonbre() {
        return nonbre;
    }

    public void setNonbre(String nonbre) {
        this.nonbre = nonbre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public LatLng getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(LatLng ubicacion) {
        this.ubicacion = ubicacion;
    }
}
