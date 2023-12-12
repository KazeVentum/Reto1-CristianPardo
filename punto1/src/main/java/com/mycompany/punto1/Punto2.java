package com.mycompany.punto1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.lang.model.util.ElementScanner14;


public class Punto2 {
    public static void main(String[] args) throws IOException {
        String NIF = "";
        String palabra = "";
        int resto = 0;
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char key;
        char validacion;

        // Recibir NIF 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el NIF: ");
        NIF = br.readLine();

        // Validar longitud y separar los numeros para prepararlos para validacion
        if(NIF.length() == 9 ){
            for (int i = 0; i < (NIF.length()-1); i++) {
                palabra+= NIF.charAt(i);
            }

            Integer Numero = Integer.valueOf(palabra);
            key = NIF.charAt(8);
            resto = Numero % 23;
            
            validacion = letras.charAt(resto-1);
            
            if (key == validacion){
                System.out.println("La contraseña esta en el formato Correcto");
                System.out.println("El resto de "+ Numero +"es: "+ resto);
                System.out.println("La letra correspondiente para dicha contraseña es: "+ validacion);
            }

            else{
                System.out.println("Contraseña Incorrecta");
            }

        }
        else{
            System.out.println("No funciona");
        }

    }
}
