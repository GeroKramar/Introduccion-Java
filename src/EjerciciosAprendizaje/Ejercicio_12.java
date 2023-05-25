

package EjerciciosAprendizaje;
import java.util.Scanner; 

public class Ejercicio_12 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una palabra de maximo 5 caracteres: ");
        String frase = leer.nextLine();
        int contadorCorrectas = 0;
        int contadorIncorrectas = 0;
        int ultimaLetra = frase.length();
        do {      
            
            if (ultimaLetra <=5 && frase.substring(0, 1).equalsIgnoreCase("x") && frase.substring(ultimaLetra -1, ultimaLetra).equalsIgnoreCase("o")) {
               System.out.println("La palabra es correcta");
               contadorCorrectas = contadorCorrectas + 1;
                System.out.println("Ingrese una nueva palabra");
                frase = leer.nextLine();
               
        } else {
            System.out.println("La palabra es incorrecta");
            contadorIncorrectas = contadorIncorrectas + 1;
            System.out.println("Ingrese una nueva palabra");
            frase = leer.nextLine();
        }          
            
        } while (!frase.equalsIgnoreCase("&&&&&"));
        
        System.out.println("Usted ingreso " + contadorCorrectas + " palabras correctas");
        System.out.println("Usted ingreso " + contadorIncorrectas + " palabras incorrectas");
    }

}
