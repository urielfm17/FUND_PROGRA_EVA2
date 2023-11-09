/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_30_uso_de_arreglos;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class EVA2_30_USO_DE_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] listaprod = new String[10];
        
        listaprod[0] = "tacos"; 
        listaprod[1] = "tortas"; 
        listaprod[2] = "tamales"; 
        listaprod[3] = "tlacoyos"; 
        listaprod[4] = "tlayudas"; 
        listaprod[5] = "tampiquenas"; 
        listaprod[6] = "tortas ahogadas"; 
        listaprod[7] = "chilaquiles"; 
        listaprod[8] = "t-bone"; 
        listaprod[9] = "tripas"; 
        
        double[] listaprecios = {20,40,15,50,30,54,60,200,400,10}; 
        
        System.out.println("---------menu---------");
        for (int i = 0; i < listaprod.length; i++) {
            System.out.println("- "+ listaprod[i]  + "$"+ listaprecios[i] );
            
        }
        Scanner captu = new Scanner (System.in);
        int opc, cant;
                System.out.println("¿que deseas ordenar?"); 
                opc = captu.nextInt();
                System.out.println("¿cauntas ordenes?"); 
                cant = captu.nextInt();
                
                System.out.println("tu total es de: "+ (cant * listaprecios[opc] ));
           
             
    }
    
}
