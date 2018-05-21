package com.darkdeymon.ceub_potosi.clases;

import android.util.Log;

import com.google.android.gms.maps.model.LatLng;

public class Bancos {
    private String nombre;
    private String calle;
    private String tipo;
    private LatLng ubicacion;

    public Bancos(String nombre, String calle, String tipo, float Lat, float Lng) {
        this.nombre = nombre;
        this.calle = calle;
        this.tipo = tipo;
        this.ubicacion = new LatLng(Lat, Lng);
    }

    public String getNombre() {
        return nombre.toUpperCase();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LatLng getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(LatLng ubicacion) {
        this.ubicacion = ubicacion;
    }
}
