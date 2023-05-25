//Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
//una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
//de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
//denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

package EjerciciosAprendizaje;
import java.util.Scanner; 

public class Ejercicio_19 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int[][] matriz = new int[3][3];
       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz [i][j]= (int) (Math.random() * 10 -10);
                System.out.print(matriz[i][j]);
                
            }
            System.out.println(" ");
        }
        System.out.println("---------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz [i][j] =  matriz [i][j] * -1;
                
                System.out.print(matriz[i][j]);
               
               
            }
            System.out.println(" ");
        }

    }

}
