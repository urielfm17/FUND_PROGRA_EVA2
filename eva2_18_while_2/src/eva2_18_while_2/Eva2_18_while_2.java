/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_while_2;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class Eva2_18_while_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        int nume = 100;
        int captu = 0;
        
        while(captu != nume){
            System.out.println("introduce el numero");
            captu = input.nextInt();
            if (captu == nume)
                System.out.println("adivinaste");
        }
        
     
    }
    
}
