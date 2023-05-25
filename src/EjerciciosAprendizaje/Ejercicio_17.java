//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
//de 2 dígitos, etcétera (hasta 5 dígitos).

package EjerciciosAprendizaje;
import java.util.Scanner; 

public class Ejercicio_17 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese la cantidad de numeros al vector");
       int numVector = leer.nextInt();
       int[] vector = new int[numVector];
       int contUno = 0;
       int contDos = 0;
       int contTres = 0;
       int contCueatro = 0;
       int contCinco = 0;
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el numero "+ i);
            vector[i] = leer.nextInt();
            
            if (vector[i]>=0 && vector[i]<10 ) {
                contUno ++;
            } else {
             if (vector[i]>=10 && vector[i]<100 ) {
                contDos++;
            } else {
                if (vector[i]>=100 && vector[i]<1000 ) {
                    contTres++;
                } else {
                    if (vector[i]>=1000 && vector[i]<10000 ) {
                        contCueatro++;
                    } else {
                        if (vector[i]>=10000 && vector[i]<100000 ) {
                            contCinco++;
                        } else {
                        }
                    }
                }
            }}
        }
        System.out.println("Unted ingreso " + contUno + " Numeros de 1 digito ");
        System.out.println("Unted ingreso " + contDos + " Numeros de 2 digito ");
        System.out.println("Unted ingreso " + contTres + " Numeros de 3 digito ");
        System.out.println("Unted ingreso " + contCueatro + " Numeros de 4 digito ");
        System.out.println("Unted ingreso " + contCinco + " Numeros de 5 digito ");
    }

}
