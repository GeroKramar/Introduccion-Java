

package EjerciciosAprendizaje;
import java.util.Scanner; 

public class Ejercicio_01 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        int num3 = num1 + num2;
        System.out.println("El numero sumado es " + num3);
    }

}
