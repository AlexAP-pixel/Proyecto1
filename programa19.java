/*
  Leer en un arreglo una serie de 10 números 
  e indicar si todos los elementos están ordenados de forma descendente,
  es decir, si cumplen la regla de que cada elemento del arreglo 
  es menor o igual que el elemento anterior.
 */
import java.util.Scanner;

public class programa19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int bandera = 0;
        for (int i = 1; i < 10; i++) {
            if (numeros[i] > numeros[i - 1]) {
                bandera = 1;
                break; 
            }
        }

        if (bandera == 0) {
            System.out.println("Los números están ordenados de forma descendente.");
        } else {
            System.out.println("Los números NO están ordenados de forma descendente.");
        }

        scanner.close();
    }
}
