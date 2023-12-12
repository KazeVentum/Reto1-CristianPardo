package com.mycompany.punto1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// El codigo en python recibe una cadena de caracteres y mediante un metodo de Strings voltea la cadena, el -1 es para que el recorrido o reorganizacion sea de derecha a izquierda. Mostrando asi el texto de manera contraria.
public class Punto3 {
    public static void main(String[] args) throws IOException {
        String palabra = "";
        String newPalabra = "";
        int j = 0;
        int i = 0;

        // Recibir NIF 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese la palabra: ");
        palabra = br.readLine();
        i = palabra.length();
        
        for (int j = 0; i > (palabra.length()); i--) {
            newPalabra+= palabra.charAt(i);
        }
        System.out.println(newPalabra);

        // NO ALCANCEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE :(
    }
}
