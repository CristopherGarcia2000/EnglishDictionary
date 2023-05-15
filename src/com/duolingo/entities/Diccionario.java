package com.duolingo.entities;

import java.util.*;

public class Diccionario {
    private Map<String,Set<String>> palabras = new HashMap<>();
    Scanner teclado = new Scanner(System.in);


    public  void añadirPalabra(String palabra){
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
    public void eliminarPalabra(String palabraAEliminar){
            boolean palabraEliminada = false;
            for (Set<String> coleccionPalabras : palabras.values()) {
                if (coleccionPalabras.contains(palabraAEliminar)) {
                    coleccionPalabras.remove(palabraAEliminar);
                    palabraEliminada = true;
                    break;
                }
            }

            if (palabraEliminada) {
                System.out.println("La palabra ha sido eliminada");
            } else {
                System.out.println("La palabra no existe");
            }
        }

    public void existePalabra(String palabraAComparar) {
        boolean palabraExiste = false;
        for (Set<String> coleccionPalabras : palabras.values()) {
            if (coleccionPalabras.contains(palabraAComparar)) {
                palabraExiste = true;
                break;
            }
        }
        if (palabraExiste) {
            System.out.println("La palabra existe");
        } else {
            System.out.println("La palabra no existe");
        }
    }


    public void mostrarIniciales(){
        System.out.println(palabras.keySet());
    }
    public void mostrarPalabras(String inicial){
        System.out.println(palabras.get(inicial));
    }

    @Override
    public String toString() {
        return "Diccionario"+palabras;
    }
}

