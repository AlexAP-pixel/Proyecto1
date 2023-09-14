/*
 Escribir un programa que indique cuántos días de vacaciones 
 le corresponden a un empleado considerando los años que ha 
 trabajado en la empresa. 

 - Entre 1 y 5 años corresponden 5 días de vacaciones, 
 - entre 6 y 10 años deben ser 10 días de vacaciones, 
 - A partir de 10 es un día de vacaciones extra por cada año de trabajo
 - A partir de 20 años de trabajo se añaden 2 días de vacaciones por cada año
   hasta un máximo de 45 días
 */

import java.util.Scanner;

public class programa5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int vacaciones = 0;

    System.out.print("Ingrese cuantos años ha trabajado en la empresa: ");
    int años = scanner.nextInt();

    if(años >= 1 && años <= 5){
      vacaciones = 5;
    }

    if(años >= 6 && años <= 10) {
      vacaciones = 10;
    }

    if(años > 10) {
      int dias_extras = años - 10;
      vacaciones = 10 + dias_extras;
    }

    if(años > 20) {
      int años_extras = años - 20;
      int dias_extras = 2 * años_extras;
      vacaciones = vacaciones + dias_extras;

      if(vacaciones > 45) {
        vacaciones = 45;
      }
    }

    System.out.println("Haz trabajado " + años + " años por lo tanto tienes " + vacaciones + " de vacaciones");
    
    scanner.close();
  }
}
