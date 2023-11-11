/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class EVA2_EJERCICIO_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Solicitar al usuario dos números enteros positivos. El primero es la base, el segundo 
es el exponente. Usando ciclos, calcular la potencia de la base elevada al exponente.
        
        */
        int base;
        int exponente;
        int resultado = 1;
        
        Scanner captu = new Scanner (System.in);
        
        System.out.println("ingrese la base( numero entero positivo");
        base = captu.nextInt();
        
        System.out.println("ingrese el exponente ( numero entrero positivo");
        exponente = captu.nextInt();
        
        if (base < 0 || exponente < 0  )
            System.out.println("ambos numero deben ser positivos");
        else
             resultado = 1;
            /*Si los números son positivos, inicializamos una variable llamada resultado en 1.
        Esto se hace porque cualquier número elevado a la potencia 0 es igual a 1.
            */
for (int i = 0; i < exponente; i++) {
                resultado = resultado * base;
       /*Usamos un bucle for para realizar la multiplicación repetida de la base por resultado un total de exponente veces.
                si el exponente es 3 la base se multiplica 3 veces
       */ 
    }
    System.out.println(base + " elevado a la " + exponente + " es igual a " + resultado);
        }
}


