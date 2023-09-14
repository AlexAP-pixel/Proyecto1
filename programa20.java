/*
 * Leer una serie de 10 números, moverlos una posición hacia adelante 
 * en el arreglo y mostrar el arreglo resultante. 
 * 
 * Ejemplo, tenemos el siguiente arreglo 1, 2, 3, 4, 5, 
 * si desplazamos los elementos una posición hacia adelante 
 * debemos obtener 5, 1, 2, 3, 4. 
 
 * Es decir, el primer elemento se mueve hacia el segundo lugar, el segundo al tercero, etc., y el último al primero.
 */
import java.util.Scanner;
public class programa20 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int[] numeros = new int[10];

    for(int i = 0; i < 10; i++){
      System.out.print("Ingrese el " + (i + 1) + " numero: ");
      numeros[i] = scanner.nextInt();
    }

    System.out.print("Arreglo: ");

    for(int i=0; i < 10; i++){
      System.out.print(numeros[i] + " ");
    }

    System.out.print("\n");

    int ultimo_elemento = numeros[9];

    for(int i = 9; i > 0; i--){
      numeros[i] = numeros[i - 1];
    }

    numeros[0] = ultimo_elemento;

    System.out.print("Arreglo modificado: ");

    for(int i=0; i < 10; i++){
      System.out.print(numeros[i] + " ");
    }

    System.out.print("\n");

    scanner.close();
  }
}
