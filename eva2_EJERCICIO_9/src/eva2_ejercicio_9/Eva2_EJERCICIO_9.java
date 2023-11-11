/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_ejercicio_9;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class Eva2_EJERCICIO_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner captu= new Scanner(System.in);

        System.out.print("Introduce una cadena de texto: ");
        String cadena = captu.nextLine();

        System.out.print("Introduce un carácter a buscar: ");
        char caracter = captu.nextLine().charAt(0);

        int contador = 0;

        // Recorre cada caracter en la cadena y cuenta las ocurrencias del carácter deseado
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }

        System.out.println("El carácter '" + caracter + "' aparece " + contador + " veces en la cadena.");

        captu.close();
    }
    
}
