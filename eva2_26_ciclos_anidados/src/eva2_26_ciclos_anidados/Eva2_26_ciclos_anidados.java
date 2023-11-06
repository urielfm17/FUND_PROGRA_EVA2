/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_ciclos_anidados;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class Eva2_26_ciclos_anidados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int nume;
     Scanner captu = new Scanner (System.in);
     
        System.out.println("introduce un numero");
        nume = captu.nextInt();
        
        for (int i = 1; i <= nume; i++) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.print("*");

                
            }
            System.out.println("");
            
        }
        System.out.println("-----------------------------------");
        for (int i = nume; i >= 1; i--) {
            for (int j = i; j >=1; j--) {
                System.out.print("*");
                
            }
            System.out.println("");
            
        }
        
       
     
     
    }
    
}
