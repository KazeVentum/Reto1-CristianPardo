/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author KazeVentum
 */
public class Punto1 {

    public static void main(String[] args) throws IOException {

        String oracion = "";
        String palabra = "";
        int    contador= 0;
        int i = 0;
        int longitud;
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese por favor la frase, recuerde al final de la oración INCLUIR un ESPACIO.");
        oracion = br.readLine();
        
        /*longitud = oracion.length();*/
        
        longitud = oracion.length();
        
        if(oracion.charAt(longitud-1) == ' '){
            for(i=0;i<oracion.length();i++){
            palabra+=oracion.charAt(i);
            if(oracion.charAt(i)==' '){
                palabra=palabra.trim();
                contador ++ ;
                }    
            }
            System.out.println("\n Palabras encontradas: "+contador);
            System.out.println("\n PROGRAMA FINALIZADO");
        } 
        else{
            System.out.println("Ha sucedido un error.\n No has seguido las instrucciones correctamente.");
            System.out.println("\n----------- PROGRAMA FINALIZADO -----------");
        }
              
                
                

            
              
    }    
}
    
