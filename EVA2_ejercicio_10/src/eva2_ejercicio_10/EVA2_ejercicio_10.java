/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_ejercicio_10;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class EVA2_ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner captu = new Scanner(System.in);

        System.out.print("Introduce una cadena de texto: ");
        String cadena = captu.nextLine();

        int longitud = cadena.length();
        int indice = 0;

        // Manejo del signo opcional
        if (cadena.charAt(0) == '-' || cadena.charAt(0) == '+') {
            indice = 1;
            // Si la cadena solo tiene el signo, no es un número válido
            if (longitud == 1) {
                System.out.println("La cadena NO representa un número válido.");
                return;
            }
        }

        // Verificación de los caracteres restantes
        while (indice < longitud) {
            char caracter = cadena.charAt(indice);
            if (!Character.isDigit(caracter)) {
                System.out.println("La cadena NO representa un número válido.");
                return;
            }
            indice++;
        }

        System.out.println("La cadena representa un número válido.");

        captu.close();
    }
    
}
