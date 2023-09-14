/*
 * El programa debe leer números mientras sean diferentes de 0. 
 * Posteriormente calcular el promedio de los números leídos.
 */

import java.util.Scanner;

public class programa16 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int bandera = 0, contador = 0, suma = 0;
    float numero;
    double promedio;

    while (bandera == 0) {
      System.out.print("\nIngrese un numero: ");
      numero = scanner.nextFloat();

      if(numero == 0){
        System.out.println("A continuación se mostrara el promedio de los números leidos\n");
        bandera = 1;
      } else {
        contador ++;
        suma += numero;
      }
    }
    promedio = suma/contador;
    System.out.println("El promdeio es de: " + promedio);
    
    scanner.close();
  }
}
