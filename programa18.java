/*
 * Leer un arreglo de 10 nombres de ciudades e indicar 
 * cuál es la que tiene el nombre más largo.
 */
public class programa18 {
  public static void main(String[] args) {
    String[] ciudades = {
      "Nueva York",
      "Tokio",
      "Madrid",
      "Los Angeles",
      "Berlin",
      "Buenos Aires",
      "Moscu",
      "Londres",
      "Paris",
      "Amsterdam"
    };

    String nombrelargo = "";

    for(int i=0; i<=9; i++){
      if(ciudades[i].length() > nombrelargo.length()){
        nombrelargo = ciudades[i];
      }
    }
    System.out.print("La ciudad con el nombre más largo: " + nombrelargo +"\n");
  }
}
