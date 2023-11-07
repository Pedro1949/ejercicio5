package Pregunta5;

public class Cadena {
    private int longitud;
    private String cadena;

    // Constructor
    public Cadena(String cadena) {
        this.cadena = cadena;
        this.longitud = cadena.length();
    }

    // Método de acceso para obtener la longitud
    public int getLongitud() {
        return longitud;
    }

    // Método de acceso para obtener el contenido de la cadena
    public String getCadena() {
        return cadena;
    }

    // Método para obtener un carácter en el índice especificado
    public char caracter(int i) {
        if (i >= 0 && i < longitud) {
            return cadena.charAt(i);
        } else {
            return (char) -1; // Devuelve -1 en caso de índice fuera de rango
        }
    }

    // Método para visualizar la cadena
    public void visualizar() {
        System.out.println("Cadena: " + cadena);
        System.out.println("Longitud: " + longitud);
    }
}