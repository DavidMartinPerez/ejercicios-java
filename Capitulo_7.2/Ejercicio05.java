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
    int minimo = Integer.MAX_VALUE;
    int filaMinimo = 0;
    int columnaMinimo = 0;
    int maximo = Integer.MIN_VALUE;
    int filaMaximo = 0;
    int columnaMaximo = 0;
    
    System.out.print("\n      ");
    for(columna = 1; columna < 11; columna++) {
      System.out.print("      " + columna + "  ");
    }
    
    for(fila = 0; fila < 6; fila++) {
      System.out.print("  " + fila + " │");
      for(columna = 0; columna < 10; columna++) {
        num[fila][columna] = (int)(Math.random() * 1001);
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
    System.out.println("┘\n\nEl máximo es " + maximo + " y está en la fila " + filaMaximo + ", columna " + columnaMaximo);
    System.out.println("El mínimo es " + minimo + " y está en la fila " + filaMinimo + ", columna " + columnaMinimo);
  

  }
}

