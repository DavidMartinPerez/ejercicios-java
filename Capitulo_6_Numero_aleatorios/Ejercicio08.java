/**
 * Ejercicio 8 del Capitulo 6
 * números aleatorios
* @uthor David Martín Pérez
 */

public class Ejercicio08 {

  public static void main(String[] args) {
    int correspondienteApuesta;
    int fila = 1;
    while(fila < 16){
       int apuesta = 1;
       int columna = 3;
      System.out.printf("%4d. |", fila);
      fila++;
      if (fila == 16) {
      columna = 1;
    }
        while(apuesta++ <= columna) {
          correspondienteApuesta = (int)(Math.random() * 6) + 1;
          if (correspondienteApuesta <= 3) {
              System.out.print("1  |");
          } else if (correspondienteApuesta <= 5) {
              System.out.print("  2|");
          } else {
              System.out.print(" X |");
          }
      }
     System.out.println();
  }
 }
}
