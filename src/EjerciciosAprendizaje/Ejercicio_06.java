

package EjerciciosAprendizaje;
import java.util.Scanner; 

public class Ejercicio_06 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para determinar si es par o impar");
        int num1 = leer.nextInt();
        int verificacion = num1 % 2;
        if (verificacion == 0) {
            System.out.println("Tu muero es par");
            
        }else {
            System.out.println("Tu numero es impar");}
    }

}
