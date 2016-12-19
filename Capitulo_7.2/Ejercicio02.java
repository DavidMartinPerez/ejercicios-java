/**
* Ejercicios Capitulo 7 Array Bidimensionales
* Ejercicio 2 
* 
* @uthor David Martín Pérez 
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    // Declarar array de 4 filas y 5 columnas
    int[][] num = new int[4][5]; 
    
    int fila;
    int columna;
    
    System.out.println("Introduce los números: ");
    for(fila = 0; fila < 4; fila++) {
      for(columna = 0; columna < 5; columna++) {
        System.out.print("Fila " + fila + ", columna " + columna + ": ");
        num[fila][columna] = Integer.parseInt(System.console().readLine());
      }
    }

    int sumaFila;
    for(fila = 0; fila < 4; fila++) {
      sumaFila = 0;  
      for(columna = 0; columna < 5; columna++) {
        System.out.printf("%7d   ", num[fila][columna]);
        sumaFila += num[fila][columna];
      }  
      System.out.printf("|%7d\n", sumaFila);
    }
    
    for(columna = 0; columna < 5; columna++) {
      System.out.print("----------");
    }
    System.out.println("-----------");

    int sumaColumna;
    int sumaTotal = 0;    
    for(columna = 0; columna < 5; columna++) {
      sumaColumna = 0;
      for(fila = 0; fila < 4; fila++) {
        sumaColumna += num[fila][columna];
      }

      sumaTotal += sumaColumna;
      System.out.printf("%7d   ", sumaColumna);
    }
    System.out.printf("|%7d   ", sumaTotal);
  }
}
