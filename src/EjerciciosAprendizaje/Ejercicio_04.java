

package EjerciciosAprendizaje;
import java.util.Scanner; 

public class Ejercicio_04 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Grados Centigrados a transformar");
        double grados = leer.nextDouble();
        double farenheit = ((grados * 9)/5)+32;
        System.out.println("La cantidad de grados Farenheit es " + farenheit + "F");
    }

}
