/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_continue;

/**
 *
 * @author frias
 */
public class EVA2_25_continue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //continue --> interrumpe la interaccion actual
        for (int i = 1; i < 15; i++) {
            if(i == 7)
                continue;
            
            System.out.print(i + " - ");
        }
        System.out.println("----------");
        //break --> detiene por completo la interaccion del break
         for (int i = 1; i < 15; i++) {
            if(i == 7)
                break;
            
            System.out.print(i + " - ");
    }
         System.out.println("--");
         for (int i = 1; i <= 20; i++) {
             if ((i % 2) != 0)
                 continue;
             System.out.print(i + "-");
            
        }
    }
}

    

