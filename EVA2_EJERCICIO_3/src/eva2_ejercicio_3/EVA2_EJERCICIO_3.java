/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class EVA2_EJERCICIO_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int nume;
        int sumatoria= 0;
        
        Scanner captu = new Scanner (System.in);
        System.out.println("introduce un  numero");
        nume = captu.nextInt();
        
        
        for (int i = 1; i <= nume; i++) {
                
                sumatoria += i ;
                
             
        
    }
       System.out.println("la sumatoria desde 1 hasta "+ nume + " es "+ sumatoria);
    }
}
