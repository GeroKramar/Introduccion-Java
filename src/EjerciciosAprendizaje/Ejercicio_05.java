

package EjerciciosAprendizaje;
import java.util.Scanner; 

public class Ejercicio_05 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
     
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        
        System.out.println("El doble del numero es: " + (num1*2));
        System.out.println("El triple del numero es: " + (num1*3));
        System.out.println("La raiz del numero es: " + Math.sqrt(num1));
     
     
     
    }

}
