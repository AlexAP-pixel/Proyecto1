/*
 * Escribe un programa que lea un archivo de texto 
 * y que escriba en otro archivo solo las líneas impares 
 * del archivo original.
 */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class programa23 {
  public static void main(String[] args){
    String archivo = "archivo.txt";
    String archivo_escribe = "impares.txt";

    try{
      FileReader lectorArchivo = new FileReader(archivo);
      BufferedReader lector = new BufferedReader(lectorArchivo);

      FileWriter escritorArchivo = new FileWriter(archivo_escribe);
      BufferedWriter escritor = new BufferedWriter(escritorArchivo);

      String linea;
      int numeroLinea = 0;

      while ((linea = lector.readLine()) != null) {
          numeroLinea++;
          if (numeroLinea % 2 != 0) { 
              escritor.write(linea);
              escritor.newLine(); 
          }
      }

      lector.close();
      escritor.close();

      System.out.println("Se han guardado las líneas impares en " + archivo_escribe);
    } catch (IOException e){
      System.err.println("Error al leer el archivo");
    }
  }
}
