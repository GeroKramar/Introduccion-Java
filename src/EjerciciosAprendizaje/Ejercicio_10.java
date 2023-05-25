//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//solicite números al usuario hasta que la suma de los números introducidos supere el
//límite inicial.

package EjerciciosAprendizaje;
import java.util.Scanner; 

public class Ejercicio_10 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor limite positivo");
        
        int limite = leer.nextInt();
        int resultado = 0;
        do {System.out.println("Ingrese numeros hasta alcanzar el limite");
        int suma = leer.nextInt();
        
       
        resultado = (suma + resultado);
        System.out.println("La suma de los numeros hasta ahora es " + resultado);
            
        } while (resultado <= limite);
        System.out.println("Has superado el limite.");
    }

}
