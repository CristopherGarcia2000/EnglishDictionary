import com.duolingo.entities.Diccionario;
import com.duolingo.utilidades.Depurador;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Diccionario diccionario = new Diccionario();
        Scanner teclado = new Scanner(System.in);
        String palabra;
        Set<String> palabrasRegistradas = new HashSet<>();
        String inicial;
        int opcion = -1;

        while(opcion != 6){
            System.out.println("Seleccione una opción: ");
            System.out.println("1.-Añadir palabra");
            System.out.println("2.-Eliminar palabra");
            System.out.println("3.-Saber si existe una palabra");
            System.out.println("4.-Mostrar las iniciales disponibles");
            System.out.println("5.-Ver palabras por inicial");
            System.out.println("6.-Salir");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Introduzca una palabra");
                    palabra = teclado.nextLine();
                    palabra = Depurador.formateador(palabra);
                    if (palabrasRegistradas.contains(palabra)){
                        System.out.println("Esa palabra ya ha sido introducida");
                    }else {
                        palabrasRegistradas.add(palabra);
                        diccionario.añadirPalabra(palabra);
                        System.out.println("Palabra añadida");
                    }
                    break;
                case 2:
                    System.out.println("Introduzca la palabra que desea eliminar: ");
                    palabra = teclado.nextLine();
                    palabra = Depurador.formateador(palabra);
                    diccionario.eliminarPalabra(palabra);
                    break;
                case 3:
                    System.out.println("Introduzca la palabra que desea buscar: ");
                    palabra = teclado.nextLine();
                    palabra = Depurador.formateador(palabra);
                    diccionario.existePalabra(palabra);
                    break;
                case 4:
                    diccionario.mostrarIniciales();
                    break;
                case 5:
                    System.out.println("Introduzca una inicial: ");
                    inicial = teclado.nextLine();
                    inicial = Depurador.formateador(inicial);
                    diccionario.mostrarPalabras(inicial);
                    break;
                case 6:
                    System.out.println("Saliendo del Programa");
                    break;
                default:
                    System.out.println("Introduzca un valor válido");
                    break;
            }

        }
    }
}