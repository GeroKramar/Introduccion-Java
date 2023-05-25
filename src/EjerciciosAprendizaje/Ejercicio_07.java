

package EjerciciosAprendizaje;
import java.util.Scanner; 

public class Ejercicio_07 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la palabra eureka");
        String frase = leer.nextLine();
        if (frase.equals("eureka")) {
            System.out.println("La palabra es EUREKA!");
            
        } else {System.out.println("La palabra es incorrecta");
        }
    }

}
