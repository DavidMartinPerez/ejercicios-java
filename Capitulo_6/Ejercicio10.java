/**
 * Ejercicio 10 del Capitulo 6
 * números aleatorios
* @uthor David Martín Pérez
 */

public class Ejercicio10 {
  public static void main(String[] args) {
    int caracter = 0;
    String relleno = "";
    int largo = 0;
    int i = 0;
    
    while (i++ < 10) {
      largo = (int)(Math.random() * 40) + 1;
      caracter = (int)((Math.random() * 5) + 1);
      switch(caracter) {
        case 1: 
          relleno = "*";
          break;
        case 2:
          relleno = "-";
          break;
        case 3:
          relleno = "=";
          break;
        case 4:
          relleno = ".";
          break;
        case 5:
          relleno = "|";
          break;
        case 6:
          relleno = "@";
        break;
      }
    
      for ( int j=1; j <= largo; j++){
        System.out.print(relleno);
      }
      System.out.println();
    }
  }
}
