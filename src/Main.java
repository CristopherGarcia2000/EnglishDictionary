import com.duolingo.entities.Diccionario;

public class Main {
    public static void main(String[] args) {
        Diccionario diccionario = new Diccionario();

        diccionario.añadirPalabara("Hola");
        diccionario.añadirPalabara("Hola");
        diccionario.añadirPalabara("Pepe");
        diccionario.añadirPalabara("Maromo");

        System.out.println(diccionario);
    }
}