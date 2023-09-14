/*
 Escribe un programa que lea un archivo de texto plano, 
 lo analice y obtenga la cantidad de veces que se encuentra 
 cada letra en el archivo.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class programa24 {
  public static void main(String[] args) {
    String archivo = "archivo.txt"; 

    try {
      FileReader lectorArchivo = new FileReader(archivo);
      BufferedReader lector = new BufferedReader(lectorArchivo);

      String linea;
      Map<Character, Integer> contadorLetras = new HashMap<>();

      while ((linea = lector.readLine()) != null) {
          for (char caracter : linea.toCharArray()) {
              if (Character.isLetter(caracter)) {
                  caracter = Character.toLowerCase(caracter); 
                  contadorLetras.put(caracter, contadorLetras.getOrDefault(caracter, 0) + 1);
              }
          }
      }

      lector.close();

      // Mostrar el conteo de letras
      System.out.println("Conteo de letras:");

      for (Map.Entry<Character, Integer> entry : contadorLetras.entrySet()) {
          char letra = entry.getKey();
          int cantidad = entry.getValue();
          System.out.println(letra + ": " + cantidad);
      }
    
    } catch (IOException e) {
      System.err.println("Error al leer el archivo: " + e.getMessage());
    }

  }
}
