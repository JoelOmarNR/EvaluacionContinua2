package com.jonr.loginsqlite.model;

public class Menu {
    private String nombre;
    private String descripcion;
    private int imgResource;

    public Menu() {
    }

    public Menu(String nombre, String descripcion, int imgResource) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imgResource = imgResource;
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

    public int getImgResource() {
        return imgResource;
    }

    public void setImgResource(int imgResource) {
        this.imgResource = imgResource;
    }
}
