/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_ciclo_for;



/**
 *
 * @author frias
 */
public class EVA2_14_CICLO_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // se ejecuta desde un punto hasta otro
        //for (punto de inicio; condicnion para el termino;manera de avanzado  (o retroceder)
        //++ operador de incremento en 1, le suma 1 a la variable
        //-- operador de incremento en 1, le resta 1 a la variable
        //+= operador de incremento en N,  le aumenta N a la variable
        //-= operador de incremento en N, le resta N a la variable
        
      
        
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            
            
        }
        System.out.println("----------------------------------------------");
        for(int i = 9; i >= 0; i--){
            System.out.println(i);
            
        }
        //-------------------
        for (int i = 0; i <= 100; i += 2)
            System.out.print(i + "-");
            }
    
}
