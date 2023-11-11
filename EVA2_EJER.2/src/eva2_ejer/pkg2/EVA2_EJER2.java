/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_ejer.pkg2;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class EVA2_EJER2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nume;
        int nume2;
        
          Scanner captu = new Scanner (System.in);
        
        System.out.println("ingrese el primer numero");
        nume = captu.nextInt();
        System.out.println("ingrese el segundo  numero");
        nume2 = captu.nextInt();
        
        
        
        
            for (int i = nume; i <= nume2; i++) {
                if ((i % 2) != 0)
                 continue;
                System.out.println(i);
            }
        
    }
    
}
