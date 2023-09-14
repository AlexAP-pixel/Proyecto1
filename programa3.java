//Escribe un programa que calcule el radio de 
//la circunferencia inscrita en un triángulo.

import java.util.Scanner;

public class programa3 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    double lado1 = 28.0, lado2 = 29.0, lado3 = 30.0;

    // Semiperimetro
    double semiperimetro = (lado1 + lado2 + lado3) / 2.0;

    // Area triangulo
    double areaTriangulo = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));

    // Radio de la circunferencia inscrita
    double radioCircunferencia = areaTriangulo / semiperimetro;

    System.out.println("El radio de la circunferencia inscrita en el triángulo es: " + radioCircunferencia);

    scanner.close();
  
  }
}
