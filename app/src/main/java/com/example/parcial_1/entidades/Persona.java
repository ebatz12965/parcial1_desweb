package com.example.parcial_1.entidades;

public class Persona {

        private Integer dpi;
        private String nombre;
        private String apellido;
        private String altura;

    public Persona(Integer dpi, String nombre, String apellido, String altura) {
        this.dpi = dpi;
        this.nombre = nombre;
        this.apellido = apellido;
        this.altura = altura;
    }

    public Integer getDpi() {
        return dpi;
    }

    public void setDpi(Integer dpi) {
        this.dpi = dpi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
}
