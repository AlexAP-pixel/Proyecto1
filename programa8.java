/*
 * Escribe un programa que pida tres números 
 * y que los muestre ordenados de mayor a menor. 
 * Nota: Este ejercicio no requiere ciclos ni ordenamientos especiales, 
 * puede realizarse utilizando “IF”.
 */
import java.util.Scanner;

 public class programa8 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa el primer numero: ");
    int n1 = scanner.nextInt();

    System.out.print("Ingresa el segundo numero: ");
    int n2 = scanner.nextInt();

    System.out.print("Ingresa el tercer numero numero: ");
    int n3 = scanner.nextInt();

    System.out.println("A continuación los numeros ordenados de mayor a menor:");

    if(n1 > n2 && n1 > n3){
      System.out.println(n1);

      if(n2 > n3){
        System.out.println(n2);
        System.out.println(n3);
      } else {
        System.out.println(n3);
        System.out.println(n2);
      }
    } else {
      if (n2 > n1 && n2 > n3) {
        System.out.println(n2);

        if(n1 > n3) {
          System.out.println(n1);
          System.out.println(n3);
        } else {
          System.out.println(n3);
          System.out.println(n1);
        }
      } else {
        if(n3 > n1 && n3 > n2) {
          System.out.println(n3);

          if(n1 > n2) {
            System.out.println(n1);
            System.out.println(n2);
          } else {
            System.out.println(n2);
            System.out.println(n1);
          }
        }
      }
    }
    scanner.close();
  }
}
