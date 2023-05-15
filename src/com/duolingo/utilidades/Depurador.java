package com.duolingo.utilidades;

public class Depurador {
    public static String formateador(String palabra){
        String palabraDepurada;
        palabraDepurada = palabra.toLowerCase();
        palabraDepurada = palabraDepurada.trim();
        return palabraDepurada;
    }
}
