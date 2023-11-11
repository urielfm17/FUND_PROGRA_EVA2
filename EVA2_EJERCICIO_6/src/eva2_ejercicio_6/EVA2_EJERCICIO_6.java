/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class EVA2_EJERCICIO_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Solicitar un número entero positivo al usuario e imprimir el equivalente en sistema 
//        binario.
        Scanner captu = new Scanner (System.in);
        int numerodecimal;
        
      //Solicitar un número entero positivo al usuario
        System.out.print("Ingrese un número entero positivo: ");
        int numeroDecimal = captu.nextInt();

        // Verificar si el número ingresado es positivo
        if (numeroDecimal < 0) {
            System.out.println("Por favor, ingrese un número entero positivo.");
            return;
        }

        // Calcular el equivalente en sistema binario
        String binario = convertirABinario(numeroDecimal);// el codigo ya esta por defecto 

        // Imprimir el resultado
        System.out.println("El equivalente en sistema binario es: " + binario);
    }

    // Método para convertir un número decimal a binario
    private static String convertirABinario(int numeroDecimal) {
        if (numeroDecimal == 0) { 
            return "0";
        }

        StringBuilder binario = new StringBuilder();
        for (int i = numeroDecimal; i > 0; i /= 2) {
            binario.insert(0, i % 2);
        }

        return binario.toString();
    }
}