/**
 * Ejercicio 5 del Capitulo 6
 * números aleatorios
 * Números aleatorios entre 100 y 199
* @uthor David Martín Pérez
 */

public class Ejercicio05 {

  public static void main(String[] args) {
    
    int maximo = 100;
    int minimo = 199;
    int suma = 0;
    int n;
    int i = 0;
    
    while (i < 51) {
      n = (int)(Math.random()*100) + 100;
      System.out.print(n + " ");
      suma += n;
      i++;
      
      if (n < minimo) {
        minimo = n;
      }
      
      if (n > maximo) {
        maximo = n;
      }
    }
    
    System.out.println("\nMínimo: " + minimo + "\nMáximo: " + maximo + "\nMedia: " + suma / 50);
  }
}
