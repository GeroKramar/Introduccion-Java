//Realizar un programa que pida dos números enteros positivos por teclado y muestre por
//pantalla el siguiente menú:


package EjerciciosAprendizaje;
import java.util.Scanner; 

public class Ejercicio_11 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int opcion;
       String respuesta = "";
        
        
          do { 
              
              
               System.out.println(" -------------");
               System.out.println("|1.SUMAR      |");
               System.out.println("|2.RESTAR     |");
               System.out.println("|3.MULTIPLICAR|");
               System.out.println("|4.DIVIDIR    |");
               System.out.println("|5.SALIR      |");
               System.out.println("--------------");
               System.out.println("ELIJA UNA OPCION");
               opcion = leer.nextInt();
        
              
              switch (opcion){
            case 1:
                FuncionSuma();
                break;
            case 2:
                FuncionResta();
                break;
            case 3:
                FuncionMultiplicacion();
                break;
            case 4:
                FuncionDivision();
                break;
            case 5:
                 System.out.println("Seguro que deseas salir? (S/N)");
                 respuesta = leer.nextLine();
                 respuesta = leer.nextLine();
                if (respuesta.equalsIgnoreCase("S")) {
                      System.out.println("Saliste del programa");
            
                  } else {System.out.println("Volviendo al menu");
                      }
                break;
            default:System.out.println("Ingresa una Opcion valida");
             break;
                 
            
        } } while (!respuesta.equalsIgnoreCase("S"));
    }
    public static void FuncionSuma() {
        Scanner leer = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int suma = 0;
        System.out.println("Ingrese los 2 numeros a sumar");
        num1= leer.nextInt();
        num2= leer.nextInt();
        System.out.println("la suma es" + (suma = num1 + num2));
          } 
    
    public static void FuncionResta() {
        Scanner leer = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int resta = 0;
        System.out.println("Ingrese los 2 numeros a restar");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println(resta = num1 - num2);
        }
    public static void FuncionMultiplicacion() {
        Scanner leer = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int multiplicacion = 0;
        System.out.println("Ingrese los 2 numeros a multiplicar");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println(multiplicacion = num1 * num2);
        
        }
    
    public static void FuncionDivision() {
        Scanner leer = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        double dividir = 0;
        if (num2==0) {
            System.out.println("No se puede dividir por 0");
        } else {System.out.println("Ingrese los 2 numeros a dividir");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
            System.out.println(dividir = num1 / num2);
        }
    }
    
 }
