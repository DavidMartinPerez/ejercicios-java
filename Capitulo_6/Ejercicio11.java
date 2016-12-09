/**
 * Ejercicio 11 del Capitulo 6
 * números aleatorios
* @uthor David Martín Pérez
 */

public class Ejercicio11 {
  public static void main(String[] args) {
    
    for (int i=0; i < 10; i++){
      
      int tamano = (int)((Math.random() * 40) + 1);
      
      for(int j=0; j < tamano; j++){
        int caracter = (int)((Math.random() * 5));
        switch(caracter){
          case 0:
            System.out.print("*");
            break;
          case 1:
            System.out.print("-");
            break;
          case 2:
            System.out.print("=");
            break;
          case 3:
            System.out.print(".");
            break;
          case 4:
            System.out.print("|");
            break;
          case 5:
            System.out.print("@");
            break;
          }
        }
      System.out.println();
    }
    
  }
}
