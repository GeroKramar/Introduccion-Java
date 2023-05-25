

package EjerciciosAprendizaje;
import java.util.Scanner; 

public class Ejercicio_16 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int cantVector = leer.nextInt();
        int[] vector = new int[cantVector];
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            
            vector[i]= (int) (Math.random() * 10);
            System.out.println(vector[i]);
        }
       
        System.out.println("Ingrese un numero para buscar");
        int busquedaNum = leer.nextInt();
        
        for (int i = 0; i < vector.length; i++) {
             if (busquedaNum == vector[i]) {
            contador++ ;
                 System.out.println("se encontro en la posicion " + i);
        }
        }
        
        System.out.println("se encontro el numero " + contador + " veces en la posicion ");
       
       
       
    
    
    }
    
    
    }


