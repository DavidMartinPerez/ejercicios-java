/**
* Ejercicios Capitulo 7 Array Bidimensionales
* Ejercicio 5 
* 
* @uthor David Martín Pérez 
 */
public class Ejercicio05 {
  public static void main(String[] args) throws InterruptedException {
    int[][] num = new int[6][10];
    int fila;
    int columna;
    
    for(fila = 0; fila < 6;fila++){
      for(columna=0; columna <10; columna++){
        num[fila][columna] = (int)(Math.random()*100);
      }
    }
    System.out.print("\n      ");
    for(columna = 1; columna < 11; columna++) {
      System.out.print("      " + columna + "  ");
    }
    
    for(fila=0;fila <6; fila++){
      System.out.print("\nFila " + fila);
      for(columna=0;columna <10;columna++){
        System.out.printf("%9d   ", num[fila][columna]);
      }
    }
    
    
  }
}

