/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_operaciones;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class EVA2_5_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // TODO code application logic here
        
         Scanner captu = new Scanner (System.in);
         // operador --> simbolo que jecuta alguina accion
         //suma --> +
         
         int suma, val1, val2;
         val1 = 100;
         val2 = 200;
         
         suma = val1 + val2;// suma aritmetica
         System.out.println("SUMA");
         System.out.println("La suma es = " + suma );//concatenacion
         
         //RESTA --> -
         
         int resta;
         resta = val1 - val2;
         
         System.out.println("RESTA");
         System.out.println("la resta es = "+ resta);
         
         // multiplicacion --> *
         int multi;
         multi = val1 * val2 ;
         
         System.out.println("MULTIPLICACION");
         System.out.println("la multiplicacion es = "+ multi);
         
         // division --> /
         int divi;
         divi = val2 / val1;
         System.out.println("DIVISION");
         System.out.println("la divison es = "+ divi);
         val1 = 11;
         val2 = 2;
         
         divi = val1 / val2;
         System.out.println("la divison 11/2 = "+ divi);
         int residuo = val1 % val2;
         System.out.println("el residuo de 11/2 es = "+ residuo );
                  
         double resu = val1 / val2;
         System.out.println("la division de 11/2 = "+ resu);
         double val2double = 2;
         resu = val1 / val2double;
         System.out.println("la division 11/2.0= "+ resu);
         resu = 11/2.0;
         System.out.println("la divison 11/2.0 = "+ resu);
         
         // potencias --> no hay operador
         
         double potencia = Math.pow(3, 3);
         System.out.println("POTENCAIA");
         System.out.println("3 elevado a la 3 = "+ potencia);
         //raiz
         double raiz = Math.pow(100, 0.5);
         System.out.println("RAIZ");
         System.out.println("la raiz cudrada de 100 = "+ raiz);
         //precedencia de operaciones
         int resuOp, x = 3, y = 2, z = 5;
         resuOp = (x * z ) + (x* y) / 2 - (y- x);
         System.out.println("el resultado es ="+ resuOp);
         
         // formula general
         
         double resuFG, a = 3, b=9, c = 3;
         resuFG = ((-b)-Math.pow(((b * b) - (4*a*c)), 0.5)) / (2* a);
         
         System.out.println("el resultado es" + resuFG);
         
         
              
         
         
         
         
        
                         
    }
    
}
