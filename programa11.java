/*
 * Encontrar los números entre el 1 y el 5000 que cumplen la regla 
 * de que la suma del cubo de sus dígitos es igual al número mismo. 
 * Ejemplo: 153 = 13 + 53 + 33
 */
import java.lang.Math;

public class programa11 {
  public static void main(String[] args) {
    int numero;

    for (int i = 1; i <= 5000; i++){
      int suma = 0;
      numero = i;
      while (i>0) {
        int digito = i % 10;
        suma += Math.pow(digito, 3);
        i /= 10;
      }

      if(suma == numero){
        System.out.println(numero);
      }
    }
  }
}

