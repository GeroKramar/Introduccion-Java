

package EjerciciosAprendizaje;
import java.util.Scanner; 

public class Ejercicio_09 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una palabra que comience con la A");
        String palabra = leer.nextLine();
        
        if (palabra.substring(0, 1).equals("A")||palabra.substring(0, 1).equals("a")) {
            System.out.println("La palabra es correcta");
            
        } else {
            System.out.println("La palabra es Incorrecta.");
        }
    }

}
