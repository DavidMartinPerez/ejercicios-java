/**
 * Ejercicio 7 del Capitulo 6
 * números aleatorios
 * Números aleatorios entre 100 y 199
* @uthor David Martín Pérez
 */

public class Ejercicio07 {

  public static void main(String[] args) {
    int correspondienteApuesta;
    int fila = 1;
    while(fila <= 15){
       int apuesta = 1;
       int columna = 3;
      System.out.printf("%4d. |", fila);
      fila++;
      if (fila == 15) {
      columna = 1;
    }
        while(apuesta++ <= columna) {
          correspondienteApuesta = (int)(Math.random() * 3) + 1;
          switch(correspondienteApuesta) {
            case 1:
              System.out.print("1  |");
              break;
            case 2:
              System.out.print("  2|");
              break;
            case 3:
              System.out.print(" X |");
              break;
        }
      }
     System.out.println();
  }
 }
}
