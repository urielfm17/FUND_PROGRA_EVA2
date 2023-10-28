/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_p15_promedio_califas;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class EVA2_P15_PROMEDIO_CALIFAS {

    public static void main(String[] args) {
        
        int CantCalifa;
        Scanner input = new Scanner (System.in);
        
        System.out.println("Ingrese el numero de calificaciones a capturar:");
        CantCalifa = input.nextInt();
        int SumaCalifa = 0;
        
        //Acumulador
        
        for (int i = 1; i <= CantCalifa; i++) {
            System.out.println("Intruce la calificacion:");
            int Califa = input.nextInt();
            //ACUMULADOR
            SumaCalifa = SumaCalifa + Califa;
            //SumaCalifa += Califa; Eslo mimso
        }
        System.out.println("La sumatoria es:" + SumaCalifa);
        //Si el divisor es entero, el resultado va a ser numero entero
        double Promedio = SumaCalifa/(CantCalifa * 1.0);
        System.out.println("El promedio de la calificacion es:" + Promedio );
    }
}
