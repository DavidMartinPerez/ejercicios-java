/**
* Ejercicios Capitulo 7 Array Bidimensionales
* Ejercicio 6 
* 
* @uthor David Martín Pérez 
 */
public class Ejercicio06.java {

  public static void main(String[] args) 
    throws InterruptedException {
 
    int[][] num = new int[6][10];

    int fila = 0;
    int columna = 0;
    boolean repetirse = 0;
    int i=0;
    int j=0;
      
    for(fila = 0; fila < 6; fila++) {
      for(columna = 0; columna < 10; columna++) {
        do {
          num[fila][columna] = (int)(Math.random() * 1001);


          repetirse = false;
          for (i = 0; i < 10 * fila + columna; i++) {
            if (num[fila][columna] == num[i / 10][i % 10]) {
              repetirse = true;
            }
          }
        } while (repetirse);
      }
    }

    int minimo = Integer.MAX_VALUE;
    int filaMinimo = 0;
    int columnaMinimo = 0;
    int maximo = Integer.MIN_VALUE;
    int filaMaximo = 0;
    int columnaMaximo = 0;

    System.out.print("\n      ");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("   " + columna + "  ");
    }
    System.out.println();
    
    System.out.print("    ┌");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("──────");
    }
    System.out.println("┐");
    
    for(fila = 0; fila < 6; fila++) {
      System.out.print("  " + fila + " │");
      for(columna = 0; columna < 10; columna++) {
        System.out.printf("%5d ", num[fila][columna]);
        Thread.sleep(100);
        

        if (num[fila][columna] < minimo) {
          minimo = num[fila][columna];
          filaMinimo = fila;
          columnaMinimo = columna;
        }
        

        if (num[fila][columna] > maximo) {
          maximo = num[fila][columna];
          filaMaximo = fila;
          columnaMaximo = columna;
        }
      }
      System.out.println("│");
    }
    System.out.print("    └");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("──────");
    }

    System.out.println("┘\n\nEl maximo es " + maximo + " en fila " + filaMaximo + ", y columna " + columnaMaximo);
    System.out.println("El minimo es " + minimo + " en la fila " + filaMinimo + ", y columna " + columnaMinimo);
  }
}
