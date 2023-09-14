/*
 * Escribe un programa que lea un número X y un número Y.
 *  Mostrar los números de Y en Y, comenzando en X hasta llegar a 200. 
 * Ejemplo: X = 8, Y = 2, el resultado comenzaría de la siguiente manera: 8, 10, 12, 14, 16, 18 ...
 */
import java.util.Scanner;
public class programa14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int secuencia;

    System.out.print("Ingrese el numero X: ");
    int x = scanner.nextInt();

    System.out.print("Ingrese el numero Y: ");
    int y = scanner.nextInt();

    secuencia = x;

    System.out.println("Resultado: ");
    secuencia = x;

    while(secuencia < 200) {
      System.out.print(secuencia + ", ");
      secuencia += y;
    }
    
    scanner.close();
  }
}
