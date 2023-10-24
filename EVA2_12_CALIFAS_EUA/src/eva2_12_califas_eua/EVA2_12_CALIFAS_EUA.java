/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_califas_eua;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class EVA2_12_CALIFAS_EUA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner captu= new Scanner (System.in);
        
        int califa;
        
        System.out.println("ingresa el valor de la califa");
        califa = captu.nextInt();
        
        
            
        
        if ((califa >= 0) && (califa <=100)){
            System.out.println("el numero "+ califa+"  es  una calificacion valida");
            
            if(califa >=90)
                System.out.println("A");
            else if ((califa >=80) && (califa <=89))
                System.out.println("B");
            else if ((califa >=70) && (califa<= 79))
                System.out.println("C");
            else if ((califa>= 60) && (califa<= 69))
                System.out.println("D");
            else if ((califa<60) && (califa>= 0))
                System.out.println("F");
                
        
            
            
        }else
            System.out.println("el numero "+ califa + "no es valido");
        
        
    }
    
}
