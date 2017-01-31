/**
 * Ejercicio 11 del Capitulo 6
 * números aleatorios
* @uthor David Martín Pérez
 */

public class Ejercicio11 {
  public static void main(String[] args) {
    int suspensos = 0;
    int suficientes = 0;
    int bien = 0;
    int notables = 0;
    int sobres = 0;
    
    
    for(int i=0; i < 20; i++){
      int nota = (int)((Math.random() * 5));
      switch(nota){
        case 0:
          System.out.println("Suspenso");
          suspensos++;
          break;
        case 1:
          System.out.println("Suficiente");
          suficientes++;
          break;
        case 2:
          System.out.println("Bienes");
          bien++;
          break;
        case 3:
          System.out.println("Notable");
          notables++;
          break;
        case 4:
          System.out.println("Sobresaliente");
          sobres++;
          break;
      }
    }
    System.out.println("-------------");
    System.out.println("Hay " + suspensos + " suspensos");
    System.out.println("Hay " + suficientes + " suficientes");
    System.out.println("Hay " + bien + " bien");
    System.out.println("Hay " + notables + " notables");
    System.out.println("Hay " + sobres + " sobresalientes");
  }
}
