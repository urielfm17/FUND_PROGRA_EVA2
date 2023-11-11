/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class EVA2_27_EJERCICIO_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nume2;
        int nume;
        Scanner captu = new Scanner (System.in);
        
        System.out.println("ingrese el primer numero");
        nume = captu.nextInt();
        System.out.println("ingrese el segundo  numero");
        nume2 = captu.nextInt();
        
        for (int i = nume; i <= nume2; i++) {
            System.out.println(i);
            
            
        }
        
    }
    
}
