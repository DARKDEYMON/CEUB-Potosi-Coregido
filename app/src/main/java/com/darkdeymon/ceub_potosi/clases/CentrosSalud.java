package com.darkdeymon.ceub_potosi.clases;

import com.google.android.gms.maps.model.LatLng;

public class CentrosSalud {
    private String nombre;
    private String zona;
    private String telefono;
    private LatLng ubicacion;

    public CentrosSalud(String nombre, String zona, String telefono, float Lat, float Lng) {
        this.nombre = nombre;
        this.zona = zona;
        this.telefono = telefono;
        this.ubicacion = new LatLng(Lat,Lng);
    }

    public String getNombre() {
        return nombre.toUpperCase();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LatLng getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(LatLng ubicacion) {
        this.ubicacion = ubicacion;
    }
}
