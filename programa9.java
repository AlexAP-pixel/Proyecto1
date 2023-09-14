/*
 * Lee la definición de números capicúa 
 * y escribe un programa que reciba un número entre 0 y 9999 
 * e indique si es un número capicúa. 
 * Nota, no es necesario utilizar ciclos,
 *  es posible realizarlo utilizando divisiones enteras.
 */

 // 

import java.util.Scanner;

public class programa9 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese un numero entre 0 y 9999: ");
    int numero = scanner.nextInt();

    String numero_cadena = String.valueOf(numero);
    int longitud = numero_cadena.length();

    if(longitud == 1) {
      System.out.println("El numero ingresado es un numero capicua");
    }

    if(longitud == 2) {
      if(numero_cadena.charAt(0) == numero_cadena.charAt(1)) {
        System.out.println("El numero ingresado es un numero capicua");
      } else {
        System.out.println("El numero ingresado NO es un numero capicua");
      }
    }

    if(longitud == 3) {
      if(numero_cadena.charAt(0) == numero_cadena.charAt(2)) {
        System.out.println("El numero ingresado es un numero capicua");
      } else {
        System.out.println("El numero ingresado NO es un numero capicua");
      }
    }

    if(longitud == 4) {
      if(numero_cadena.charAt(0) == numero_cadena.charAt(3)) {
        if(numero_cadena.charAt(1) == numero_cadena.charAt(2)) {
          System.out.println("El numero ingresado es un numero capicua");
        } else {
          System.out.println("El numero ingresado NO es un numero capicua");
        }
      } else {
        System.out.println("El numero ingresado NO es un numero capicua");
      }
    }

    if(longitud > 4) {
      System.out.println("El numero ingresado no esta entre 0 y 9999");
    }
    scanner.close();
  }
}
