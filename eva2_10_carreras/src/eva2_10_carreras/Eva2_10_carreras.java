/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_carreras;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class Eva2_10_carreras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner captu = new Scanner (System.in);
         
         int carrera;
         
         System.out.println("ingrese el numero de la carrera");
         carrera = captu.nextInt();
         
         switch (carrera){
             case 1:
                 System.out.println("ingeniereia en sistemas computacionales");
                 break;
             case 2:
                 System.out.println("ingenieria industrial");
                 break;
             case 3:
                 System.out.println("ingenieria informatica");
             case 4:
                 System.out.println("ingenieria en diseño indusrial");
                 break;
             case 5:
                 System.out.println("Ingenieria en Gestion Empresarial");
                 break;
             case 6:
                 System.out.println("Licenciatura en Administración");
                 break;
             case 7:
                 System.out.println("ingenieria en Arquitectura");
                  break;
             case 8:
                 System.out.println("ciencias de la ingieneria");
                 break;
                 
                 
                 
                         
             
             
         }
        
        
    }
    
}
