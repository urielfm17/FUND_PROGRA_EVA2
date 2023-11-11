/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class EVA2_EJERCICIO_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Solicitar un número positivo (o cero) al usuario. El programa estará preguntando 
números hasta que el usuario introduzca un número negativo. El programa deberá mostrar 
cual es el número más pequeño y el más grande de todos los que introdujo el usuario.
        */
        Scanner scanner = new Scanner(System.in);

        int numero;
        int numeroMasPequeno = Integer.MAX_VALUE;
        int numeroMasGrande = Integer.MIN_VALUE;

        System.out.println("Introduce números positivos (o cero). Introduce un número negativo para terminar.");

        while (true) {
            System.out.print("Introduce un número: ");
            numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            numeroMasPequeno = Math.min(numero, numeroMasPequeno);
            numeroMasGrande = Math.max(numero, numeroMasGrande);
        }

        if (numeroMasPequeno == Integer.MAX_VALUE || numeroMasGrande == Integer.MIN_VALUE) {
            System.out.println("No se introdujeron números positivos.");
        } else {
            System.out.println("El número más pequeño es: " + numeroMasPequeno);
            System.out.println("El número más grande es: " + numeroMasGrande);
        }
        
        
        
        
        
            
        }
 
    }

    
    
        
                
                
        
        
        
       
        
        
        
    
    

