/*
 Una universidad comenzará a asignar a sus estudiantes a diferentes dormitorios 
 según su sexo y edad. 
 Escribe un programa que solicite el sexo (H/M) 
 y edad e indique de acuerdo con la siguiente tabla en qué edificio deben ser asignados. 
 Validar que el sexo y edad sean valores correctos.

Hombre, 18 años = Edificio A
Mujer, 18 años = Edificio B
Hombre, 19 a 22 años = Edificio C 
Mujer, 19 a 22 años = Edificio D 
Hombre, Mayor de 22 años = Edificio E1 
Mujer, Mayor de 22 años = Edificio E2
 */
import java.util.Scanner;

public class programa4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bienvenido");
    System.out.print("Ingrese su genero (H/M): ");
    String sexo = scanner.nextLine();

    System.out.print("Ingrese su edad: ");
    int edad = scanner.nextInt();

    if(sexo.equals("H")){
      if(edad == 18) {
        System.out.println("Usted sera asignado al Edificio A");
      } else {
        if (edad >= 19 || edad <= 22) {
          System.out.println("Usted sera asignado al Edificio C");
        } else {
          if (edad > 22) {
            System.out.println("Usted sera asignado al Edificio E1");
          } else {
            System.out.println("La edad ingresada no es valida"); 
          }
        }
      }
    } else {
      if(sexo.equalsIgnoreCase("M")) {
        if (edad == 18){
          System.out.println("Usted sera asignada al Edificio B");
        } else {
          if (edad >= 19 || edad <= 22) {
            System.out.println("Usted sera asignada al Edificio D");
          } else {
            if (edad > 22) {
              System.out.println("Usted sera asignada al Edificio E2");
            } else {
              System.out.println("La edad ingresada no es valida");
            }
          }
        }
      } else {
        System.out.println("El sexo ingresado no es valido");
      }

    }
    scanner.close();
  }
}
