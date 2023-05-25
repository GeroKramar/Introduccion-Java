//Crea una aplicación que a través de una función nos convierta una cantidad de euros
//introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
//función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
//una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
//(void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €

package EjerciciosAprendizaje;
import java.util.Scanner; 

public class Ejercicio_14 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros a convertir");
        double euros = leer.nextInt();
        String Moneda = null;
        CambioMoneda(euros, Moneda, leer);
        
        
    }
    public static void CambioMoneda(double euros, String Moneda, Scanner leer) {
        System.out.println("Ingrese el tipo de moneda que desea cambiar");
        Moneda = leer.nextLine();
        Moneda = leer.nextLine();
        double resultado = 0;
        switch(Moneda){
        case "dolar":
        {           
                    resultado = euros * 0.86;
                    System.out.println("El cambio de euros a "+ Moneda + " es: " + resultado);
        }
            break;
        case "libra":
        {           
                    resultado = euros * 1.28611;
                    System.out.println("El cambio de euros a "+ Moneda + " es: " + resultado);
        }
            break;
        case "yenes":
        {           
                    resultado = euros * 129.852;
                    System.out.println("El cambio de euros a "+ Moneda + " es: " + resultado);
        }
            break;    
        }
        
    }
}
