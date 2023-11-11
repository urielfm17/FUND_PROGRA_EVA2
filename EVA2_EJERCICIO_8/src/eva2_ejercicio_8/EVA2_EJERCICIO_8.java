/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class EVA2_EJERCICIO_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Solicitar caracteres alfabéticos al usuario, indicar si es vocal o consonante. El 
         //PROGRAMA termina cuando se introduzca un espacio en blanco.
         Scanner captu = new Scanner (System.in);
         
          char caracter;
        
        do {
            System.out.print("Introduce un caracter alfabético (o espacio en blanco para salir): ");
            caracter = captu.nextLine().charAt(0);

            if (caracter != ' ') {
                if (esVocal(caracter)) {
                    System.out.println("Es una vocal.");
                } else {
                    System.out.println("Es una consonante.");
                }
            }

        } while (caracter != ' ');

        System.out.println("Programa terminado.");
        captu.close();
    }

    // Método para verificar si un caracter es vocal
    private static boolean esVocal(char c) {
        c = Character.toLowerCase(c); // Convertir a minúscula para hacer la comparación más simple
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
        
                 
                
         }
         
       
         
         
         
         
         
         
         

    

         
         
         
            
                    
                 
                 
                 
                 
         
         
         
    
    
    

