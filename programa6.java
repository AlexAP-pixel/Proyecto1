/*
 * Calcular el cobro que una caseta de cuota debe realizar a un vehículo 
 * de acuerdo con las siguientes reglas: 
 * Motocicleta = $20, 
 * 2 ejes(automóviles) = $40, 
 * 3 ejes (camionetas) = $60, 
 * 4, 5 y 6 ejes (camiones de carga) = $250, 
 * eje adicional $50. 
 * Por ejemplo si llega un trailer de 8 ejes se deben cobrar $350.
 */
import java.util.Scanner;

public class programa6 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int cobro = 0, cobro_extra = 0;
    int ejes_extra = 0;

    System.out.print("Ingrese los ejes que tiene su vehiculo: ");
    int ejes = scanner.nextInt();

    if(ejes == 1){
      cobro = 20;
    }

    if(ejes == 2){
      cobro = 40;
    }

    if(ejes == 3){
      cobro = 60;
    }

    if(ejes == 4 || ejes == 5 || ejes == 6){
      cobro = 250;
    }

    if(ejes > 6){
      cobro = 250;
      ejes_extra = ejes - 6;
      cobro_extra = ejes_extra * 50;
      cobro = cobro + cobro_extra;
    }

    System.out.println("Se le cobrara $" + cobro);

    scanner.close();
  }
}
