package com.darkdeymon.ceub_potosi.clases;

import com.google.android.gms.maps.model.LatLng;

import java.net.MalformedURLException;
import java.net.URL;

public class Hoteles {
    private String nombre;
    private int categoria;
    private String direccion;
    private String telefono;
    private String web;
    private String email;
    private LatLng ubicacion;
    private URL imagen;

    public Hoteles(String nombre, int categoria, String direccion, String telefono, String web, String email, float lat, float lng, String imagen) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.direccion = direccion;
        this.telefono = telefono;
        this.web = web;
        this.email = email;
        this.ubicacion = new LatLng(lat,lng);
        try {
            this.imagen =new URL(imagen);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
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

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
