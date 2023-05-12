package com.duolingo.entities;

import java.util.*;

public class Diccionario {
    private Map<String,Set<String>> palabras = new HashMap<>();
    Scanner teclado = new Scanner(System.in);


    public  void añadirPalabara(String palabra){
        String inicial;
        inicial = palabra.substring(0,1);
        if(palabras.containsKey(inicial)){
            palabras.get(inicial).add(palabra);
        } else {
            Set<String> newSet = new HashSet<>();
            palabras.put(inicial,newSet);
            palabras.get(inicial).add(palabra);

        }
    }

    @Override
    public String toString() {
        return "Diccionario"+palabras;
    }
}

