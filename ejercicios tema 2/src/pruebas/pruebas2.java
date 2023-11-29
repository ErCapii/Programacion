package pruebas;

import java.util.Scanner;

public class pruebas2 {
public static void main(String[] args) {
	  int n = 10; // Número de términos a generar

      int i = 0; // Índice del término actual
      int a = 0; // Primer término de la serie
      int b = 1; // Segundo término de la serie

      while (i < n) {
          // Calcula el término actual de la serie
          int fibonacci = a + b;

          // Imprime el término actual
          System.out.println(fibonacci);

          // Actualiza los valores de los términos anteriores
          a = b;
          b = fibonacci;

          i++;
      }
  }
}
