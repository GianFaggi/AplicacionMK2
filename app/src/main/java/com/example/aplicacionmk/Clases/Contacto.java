package com.example.aplicacionmk.Clases;

public class Contacto {

    //usaremos este atributo como id para cada contacto

    private String Color;

    private String nombreProducto;

    private String nombreUsuario;

    private String Estado;

    public Contacto(String Color, String nombreProducto, String nombreUsuario, String estado) {
        this.Color = Color;
        this.nombreProducto = nombreProducto;
        this.nombreUsuario = nombreUsuario;
        this.Estado = estado;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
}


