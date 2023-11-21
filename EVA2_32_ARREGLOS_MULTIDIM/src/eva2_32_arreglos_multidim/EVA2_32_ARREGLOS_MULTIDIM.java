/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_32_arreglos_multidim;

/**
 *
 * @author frias
 */
public class EVA2_32_ARREGLOS_MULTIDIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logi here
        int[][] matriz = new int [3][4];
        // poner datos manualmente
        
        matriz [1][3] = 100;
        System.out.println("matriz [1][3] = "+ matriz [1][3]);
        //--------------------------------
        System.out.println(matriz.length);
        // llenar con valores aleatorios la matriz:
        //filas --> primer dimension
        for (int i = 0; i < matriz.length; i++) {
            //por cada fila debo recorre cada columna
            //columnas
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" +  matriz[i][j]+ "]"); 
                
                
            }
            System.out.println("");
        }
        
        
        
    }
    
}
