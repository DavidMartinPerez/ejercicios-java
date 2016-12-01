/**
 * Ejercicio 2 del Capitulo 7 Arrays
 * Basico Arrays
* @uthor David Martín Pérez
 */

public class Ejercicio2 {
  public static void main(String[] args) {
    String[] simbolo = new String[10];
      simbolo[0] = "x";
      simbolo[4] = "@";
      simbolo[6] = " ";
      simbolo[7] = "+";
      simbolo[8] = "Q";

        
      for (int i=0;i < 10;i++){
      System.out.println("simbolo[" + i +"]: " + simbolo[i]);
    }
    System.out.println();
    System.out.println("Se inicializan en 'null' por defecto");
  }
}
