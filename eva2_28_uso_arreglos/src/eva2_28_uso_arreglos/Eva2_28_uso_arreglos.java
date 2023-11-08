/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class Eva2_28_uso_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int cant;
          int[] califas;
          Scanner captu = new Scanner (System.in);
          System.out.println("cuantas calificaciones desea capturar");
          cant = captu.nextInt();
          
          califas = new int[cant];
          
          for (int i = 0; i <cant; i++) {
              System.out.println("introduce la calificacion");
              califas[i] = captu.nextInt();
              
            
        }
           for (int i = 0; i <cant; i++) {
              System.out.print("[ " + califas [i]+ "] ");
              
          
    }
    
}
}