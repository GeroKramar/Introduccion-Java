//Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
//traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
//obtiene cambiando sus filas por columnas (o viceversa).

package EjerciciosAprendizaje;
import java.util.Scanner; 

public class Ejercicio_18 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);

       int [][] vector = new int[4][4];
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                vector[i][j]= (int) (Math.random() * 10);
               
               System.out.print(vector[i][j]);
                
             
                
            }
            System.out.println(" ");
            
        }
        System.out.println("-------------------");
       for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
             System.out.print(vector[j][i]);
             
                
            }
            System.out.println(" ");
            
        }
            
            
    }
        
}


