package com.example.remedial.Modelos;

import android.content.Intent;
import android.widget.ImageView;

public class Opciones {

    private String Nombre;
    private Intent Accion;
    private int Imagencita;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Intent getAccion() {
        return Accion;
    }

    public void setAccion(Intent accion) {
        Accion = accion;
    }

    public int getImagencita() {
        return Imagencita;
    }

    public void setImagencita(int imagencita) {
        Imagencita = imagencita;
    }

    public Opciones(String nombre, Intent accion, int imagencita) {
        Nombre = nombre;
        Accion = accion;
        Imagencita = imagencita;
    }
}
