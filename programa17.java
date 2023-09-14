/*
 * Leer 10 números enteros, 
 * guardarlos en orden inverso al que fueron introducidos 
 * y mostrarlos en pantalla.
 */

import java.util.Scanner;

public class programa17 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int[] numero = new int[10];
    int direccion = 9;

    for(int i=0; i<=9; i++){
      System.out.print("Ingrese el " + (i + 1) + " numero: ");
      numero[direccion] = scanner.nextInt();
      direccion--;
    }

    System.out.println("Mostrando los numeros de manera inversa: ");
    for(int i=0; i<=9; i++){
      System.out.println(numero[i]);
    }

    scanner.close();
  } 
}
