/*
 * Calcular cuanto dinero tendría en una cuenta de ahorro 
 * al final de 20 años si al inicio de cada año añado $10,000, 
 * el rendimiento anual es 5% y reinvierto las ganancias obtenidas 
 * cada año.
 */
public class programa13 {
  public static void main(String[] args){
    double montoPrincipal = 10000.0; 
    double tasaInteresAnual = 0.05; 
    int numeroAnios = 20; 

    double montoTotal = montoPrincipal * Math.pow(1 + tasaInteresAnual, numeroAnios);

    montoTotal = Math.round(montoTotal * 100.0) / 100.0;

    System.out.println("Al final de 20 años, tendrías $ " + montoTotal + " en tu cuenta de ahorro.");
  }
} 

