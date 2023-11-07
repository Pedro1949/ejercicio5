package Pregunta5;

public class Pregunta_5 {
   public static void main(String[] args) {
        Cadena miCadena = new Cadena("Ejemplo de cadena"); // Crear un objeto Cadena

        miCadena.visualizar();

        int indice = 5; // Índice para buscar un carácter en la cadena
        char caracterEnIndice = miCadena.caracter(indice);
        if (caracterEnIndice == (char) -1) {
            System.out.println("Índice fuera de rango");
        } else {
            System.out.println("Carácter en el índice " + indice + ": " + caracterEnIndice);
        }
    }
}
