package com.example.parcial_1.utilidades;

public class Utilidades {

    //Constantes tabla Persona
    public static final String TABLA_PERSONA="persona";
    public static final String CAMPO_DPI="dpi";
    public static final String CAMPO_NOMBRE="nombre";
    public static final String CAMPO_APELLIDO="apellido";
    public static final String CAMPO_ALTURA="altura";

    public static final String CREAR_TABLA_PERSONA="CREATE TABLE "+TABLA_PERSONA+"(" +
            CAMPO_DPI+" INTEGER PRIMARY KEY AUTOINCREMENT, "+
            CAMPO_NOMBRE+" TEXT, "+
            CAMPO_APELLIDO+" TEXT, "+
            CAMPO_ALTURA+" TEXT)";
}
