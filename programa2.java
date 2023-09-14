/* 
Multiplicación de fracciones:
  Escriba un programa que solicite los valores de a, b, c y d 
  (como números enteros) y calcule el valor de la multiplicación 
  y lo muestre en pantalla en forma de número con decimales 
  y en forma de fracción (ejemplo 17/33).
*/ 

import java.util.Scanner;

public class programa2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Tenemos la siguiente operacion a/b * c/d = ac/bd \n");
    
    System.out.print("Ingrese el valor de a: ");
    int a = scanner.nextInt();

    System.out.print("Ingrese el valor de b: ");
    int b = scanner.nextInt();

    System.out.print("Ingrese el valor de c: ");
    int c = scanner.nextInt();

    System.out.print("Ingrese el valor de d: ");
    int d = scanner.nextInt();

    int numerador = a * c;
    int denominador = b * d;

    double decimal = (double) numerador / denominador;

    System.out.println("Su resultado en decimal es de: " + decimal);
    System.out.println("Su resultado en fracción es de: " + numerador + "/" + denominador);

    scanner.close();
  }
}
