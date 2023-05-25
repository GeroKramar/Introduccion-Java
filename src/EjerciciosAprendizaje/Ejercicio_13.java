

package EjerciciosAprendizaje;
import java.util.Scanner; 

public class Ejercicio_13 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos por lado");
        int lados = leer.nextInt();
        
        for (int i = 0; i < lados; i++ ) {
                     
            for (int j = 0; j < lados; j++) {
                
                if (j ==0 || j==lados-1 || i==0 || i==lados-1) {
                     System.out.print("* ");
                     
                } else {System.out.print("  ");
                }
             
                
            }
           System.out.println();  
        }
    }

}
