/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class EVA2_EJERCICIO_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Ejercicio: Solicitar un número al usuario, indicar si el número es positivo, negativo o cero. 
            Después de solicitar el número y darle la respuesta al usuario, se le debe preguntar si desea 
            terminar el programa.*/ 
         Scanner captu = new Scanner (System.in);
        int nume;
        
        int respu ;
        
        
       
        
        System.out.println("ingrese un numero");
        nume = captu.nextInt();
        
        if (nume < 0)
            System.out.println("el numero " + nume + " es negativo");
        if (nume == 0)
            System.out.println("el nuemero " + nume + " es cero");
        if (nume > 0 )
            System.out.println("el numero "+ nume + " es positivo");
        
         
         
        
         System.out.println("¿deseas terminar el programa? si=1 no=2 ");
         respu = captu.nextInt();
          switch(respu){
              case 1:
                  System.out.println("fin del programa");
                  break;
           
              case 2:
                  System.out.println("el programa sigue ");
              
                     
             while (respu != 3 );
                
              
              
          
          
             
         

            
            
        
          }           
          }

}         
      
            
        
    
