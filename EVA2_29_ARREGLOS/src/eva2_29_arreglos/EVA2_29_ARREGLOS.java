/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_arreglos;

/**
 *
 * @author frias
 */
public class EVA2_29_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int[100];
        //vamos a llenar un arreglo de valores entre 0 y 99
        for (int i = 0; i < 100; i++) {
            //casting: convierto un double a entero
            arreglo[i] = (int)(Math.random() * 100);
            System.out.print("["+ arreglo[i]+ "]");
            
            
            
        }
    }
    
}
