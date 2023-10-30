/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_while_infinito;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class EVA2_19_WHILE_INFINITO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Scanner input = new Scanner (System.in);
        
        int nume = 100;
        int captu = 0;
        
        while(true){
            System.out.println("introduce un numero");
            captu = input.nextInt();
            if (captu == nume)
                System.out.println("adivinaste");
            break;
            
        }
                
    }
    
}
