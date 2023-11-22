/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_34_for_each;

/**
 *
 * @author frias
 */
public class EVA2_34_for_each {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // for each --> es un for para recorrer arreglos
        //solo sirve para leer arreglos
        
        int arreglo[] = new int [10];
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
            
            
        }
             for (int valor : arreglo) {
                 System.out.print("[" + valor + "]");
            
        }
           System.out.println("");  
        String mensaje[] = { "hola"," ", "mundo"," ","cruel"};
        for (String valor : mensaje) {
            System.out.print(valor);
                    
            
        }
        
    }
    
}
