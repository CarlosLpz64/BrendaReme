package com.example.remedial.Modelos;

public class Permisos {

    private String NombreNoR;
    private String NombreReal;

    public String getNombreNoR() {
        return NombreNoR;
    }

    public void setNombreNoR(String nombreNoR) {
        NombreNoR = nombreNoR;
    }

    public String getNombreReal() {
        return NombreReal;
    }

    public void setNombreReal(String nombreReal) {
        NombreReal = nombreReal;
    }

    public Permisos(String nombreNoR, String nombreReal) {
        NombreNoR = nombreNoR;
        NombreReal = nombreReal;
    }
}
