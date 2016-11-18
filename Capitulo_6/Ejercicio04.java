/**
 * Ejercicio 4 del Capitulo 6
 * números aleatorios
 * Números aleatorios en fila
* @uthor David Martín Pérez
 */

public class Ejercicio04 {

  public static void main(String[] args) {
    
    int i = 1;
    while (i < 21) {
    System.out.print((int)(Math.random()*11) + " ");
    i++;
    }

  }
}
