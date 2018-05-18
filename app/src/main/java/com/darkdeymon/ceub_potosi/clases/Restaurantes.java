package com.darkdeymon.ceub_potosi.clases;

import com.google.android.gms.maps.model.LatLng;

import java.net.MalformedURLException;
import java.net.URL;

public class Restaurantes {
    private String nombre;
    private String direccion;
    private String telefono;
    private LatLng ubicacion;
    private URL imagen;

    public Restaurantes(String nombre, String direccion, String telefono, String imagen, float lat, float lng) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        try {
            this.imagen = new URL(imagen);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        this.ubicacion = new LatLng(lat,lng);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public URL getImagen() {
        return imagen;
    }

    public void setImagen(URL imagen) {
        this.imagen = imagen;
    }
}
