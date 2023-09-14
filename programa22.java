/*
 * Escribe un programa que solicite al usuario los tamaños 
 * de las dos matrices a multiplicar y luego solicite los valores, 
 * realice la multiplicación y muestre el resultado.
 */

import java.util.Scanner;

public class programa22 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Arreglo:");

    System.out.print("\nIngresa cuantas filas tendra: ");
    int filas = scanner.nextInt();

    System.out.print("\nIngresa cuantas columnas tendra: ");
    int columnas = scanner.nextInt();

    int[][] arreglo1 = new int[filas][columnas];
    int[][] arreglo2 = new int[filas][columnas];
    int[][] mult = new int[filas][columnas];


    System.out.println("Ingrese los elementos del primer arreglo: ");

    for(int fila = 0; fila < filas; fila++) {
      for(int columna = 0; columna < columnas; columna++) {
          System.out.print("Elemento en la fila " + (fila + 1) + ", columna " + (columna + 1) + ": ");
          arreglo1[fila][columna] = scanner.nextInt();
      }
    }

    System.out.println("Ingrese los elementos del segundo arreglo: ");

    for(int i = 0; i < filas; i++) {
      for(int j = 0; j < columnas; j++) {
          System.out.print("Elemento en la fila " + (i + 1) + ", columna " + (j + 1) + ": ");
          arreglo2[i][j] = scanner.nextInt();
      }
    }

    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
          mult[i][j] = arreglo1[i][j] * arreglo2[i][j];
      }
    }

    System.out.println("\nResultado de la multiplicación de las dos matrices");

    for (int x = 0; x < filas; x++) {
      for (int y = 0; y < columnas; y++) {
          System.out.print(mult[x][y] + " ");
      }
      System.out.println();
    }

    scanner.close();
  }
}
