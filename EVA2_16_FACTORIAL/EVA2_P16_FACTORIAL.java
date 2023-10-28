/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_p16_factorial;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class EVA2_P16_FACTORIAL {

    public static void main(String[] args) {
        int num;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Introduce el numero:");
        num = input.nextInt();
        int Factorial = 1;
     
        for (int i = num; i >= 1; i--) {
            System.out.print(i + "-");
            Factorial = Factorial * i;
       
        }
        System.out.println("");
        System.out.println("El factorial de" + " " + num + " " + "es:" + Factorial);
        
        for (int i = 1; i <= num; i++) {
            System.out.print(i + "-");
            Factorial = Factorial * i;
        }
        System.out.println("");
        System.out.println("El factorial de" + " " + num + " " + "es:" + Factorial);
        
    }
}
