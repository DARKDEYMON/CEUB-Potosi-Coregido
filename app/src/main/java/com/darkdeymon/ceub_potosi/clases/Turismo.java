package com.darkdeymon.ceub_potosi.clases;

import com.google.android.gms.maps.model.LatLng;

import java.net.MalformedURLException;
import java.net.URL;

public class Turismo {
    private String nombre;
    private String descripcion;
    private String calle;
    private URL imagen;
    private LatLng ubicacion;

    public Turismo(String nombre, String descripcion, String calle, String imagen, float Lat, float Lng) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.calle = calle;
        try {
            this.imagen = new URL(imagen);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        this.ubicacion = new LatLng(Lat,Lng);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public URL getImagen() {
        return imagen;
    }

    public void setImagen(URL imagen) {
        this.imagen = imagen;
    }

    public LatLng getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(LatLng ubicacion) {
        this.ubicacion = ubicacion;
    }
}
