/* Escribe un programa que solicite al usuario un número entero 
y dé como resultado la suma de todos los números desde el 1 
hasta dicho numero.*/
import java.util.Scanner;

public class programa10 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese un numero entero: ");
    int numero = scanner.nextInt();
    int suma = 0;

    for (int i=1; i<=numero; i++){
      suma += i;
    }

    System.out.println("La suma de todos los numeros desde el 1 hasta el numero ingresado es de : " + suma);
    scanner.close();
  }
}
