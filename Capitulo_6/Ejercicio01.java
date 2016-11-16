/**
 * Ejercicio 1 del Capitulo 6
 * números aleatorios
* @uthor David Martín Pérez
 */

public class Ejercicio01 {

  public static void main(String[] args) {
    System.out.println("Este programa tirara 3 dados y sumara sus resultados");
    int tirada;
    int total = 0;
    int i = 0;
    System.out.print("Tirada de tres dados: ");

    while(i < 3) {
      tirada = (int)(Math.random() * 6) + 1;
      System.out.print(tirada + " ");
      total += tirada;
      i++;
    }

    System.out.println("\nSuma: " + total);
    
    
  }
}
 
