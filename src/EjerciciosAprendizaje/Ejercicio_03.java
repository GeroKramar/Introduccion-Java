

package EjerciciosAprendizaje;
import java.util.Scanner; 

public class Ejercicio_03 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String Frase = leer.nextLine();
        System.out.println("La frase en min es: ");
        System.out.println(Frase.toLowerCase());
        System.out.println("La frase en mayusculas es: ");
        System.out.println(Frase.toUpperCase());
    }

}
