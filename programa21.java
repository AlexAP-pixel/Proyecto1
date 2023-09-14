/*
 * Escribe un programa que lea un arreglo bidimensional de 5x5 
 * y muestre la suma del total del arreglo.
 */

import java.util.Scanner;

public class programa21 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int[][] arreglo = new int[5][5];
    int suma = 0;

    System.out.println("Ingrese los elementos del arreglo: ");

    for(int fila = 0; fila < 5; fila++) {
      for(int columna = 0; columna < 5; columna++) {
          System.out.print("Elemento en la fila " + (fila + 1) + ", columna " + (columna + 1) + ": ");
          arreglo[fila][columna] = scanner.nextInt();
      }
    }

    for(int fila = 0; fila < 5; fila++) {
      for(int columna = 0; columna < 5; columna++) {
        suma += arreglo[fila][columna];
      }
    }

    System.out.print("Suma total del arreglo: " + suma + "\n");

    scanner.close();
  }
}
