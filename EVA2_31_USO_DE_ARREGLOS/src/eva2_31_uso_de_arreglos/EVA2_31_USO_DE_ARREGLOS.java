/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_31_uso_de_arreglos;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class EVA2_31_USO_DE_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // generar un arreglo tamaño 15
        // llenando conn valores aleatorios: 0 + 99
        
        int[] arreglo = new int[15];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
            
        }
         for (int i = 0; i < arreglo.length; i++) {
             System.out.print("["+ arreglo[i] + "] " );
            
        }
         Scanner captu = new Scanner (System.in);
         System.out.println("");
         System.out.println("que valor necesitas");
         int valor = captu.nextInt();
         int posi = -1;
        for (int i = 0; i < arreglo.length; i++) {
            if(valor == arreglo[i]);{
            posi = i;
           
          break;  
        }
            
        }
        if(posi != -1)
            System.out.println("el valor esta en la posicion "+ posi);
        else
            System.out.println("vslor no encontrado");
                   
    }
    
}
