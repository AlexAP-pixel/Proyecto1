/*
 * En este programa la computadora debe elegir un número al azar 
 * entre 1 y 100 
 * 
 * Solicitará al usuario que “adivine” el número.
 *  
 * A cada intento del usuario la computadora debe indicar 
 * si el número que el usuario introdujo es mayor o menor 
 * que el número prefijado. 
 * 
 * El programa debe terminar cuando el usuario “adivine” el número 
 * o introduzca el número “0” para salir.
 */

import java.util.Scanner;
import java.util.Random;

public class programa15 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    
    int bandera = 0;
    int numero = rand.nextInt(100) + 1;
    
    System.out.println("Bienvenido usted va a adivinar el numero \n");

    while (bandera == 0) {
      System.out.print("Ingrese cual cree que es el numero: ");
      int adivinado = scanner.nextInt();

      if(adivinado == 0){
        System.out.println("Bueno sera para la otra");
        bandera = 1;
      } else {
        if(adivinado > numero){
          System.out.println("El numero ingresado es mayor al número prefijado");
          System.out.println("Intentalo de nuevo \n");
        } else {
          if(adivinado < numero){
            System.out.println("El numero ingresado es menor al número prefijado");
            System.out.println("Intentalo de nuevo \n");
          } else {
            if(adivinado == numero){
              System.out.println("Felicidades el numero si era: " + numero);
              bandera = 1;
            }
          }
        } 
      }
    } 
    scanner.close();
  }
}
