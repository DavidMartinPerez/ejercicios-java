/**
* Ejercicios Capitulo 7 Array Bidimensionales
* Ejercicio 4 
* 
* @uthor David Martín Pérez 
 */
public class Ejercicio04 {
  public static void main(String[] args) throws InterruptedException {
    // Creando array de 4 filas por 5 columnas
    int[][] num = new int[4][5]; 

    int fila;
    int columna;
    int sumandoFila;
    int sumandoColumna;
    int sumandoTotal = 0;
    //Creamos los numeros aleatorios
    for(fila = 0;fila < 4;fila++){
      for(columna=0;columna < 5;columna++){
        num[fila][columna] = (int)(Math.random() * 1001);
      }
    }
    
    for(fila = 0; fila < 4; fila++) {
      sumandoFila = 0;  
      for(columna = 0; columna < 5; columna++) {
        System.out.printf("%5d   ", num[fila][columna]);
        sumandoFila += num[fila][columna];
        Thread.sleep(100);
      }  
      System.out.printf("|%5d\n", sumandoFila);
      Thread.sleep(500);
    }
        for(columna = 0; columna < 5; columna++) {
      System.out.print("----------");
    }
    System.out.println("-----------");

    for(columna = 0; columna < 5; columna++) {
      sumandoColumna = 0;
      for(fila = 0; fila < 4; fila++) {
        sumandoColumna += num[fila][columna];
      }

      sumandoTotal += sumandoColumna;
      System.out.printf("%5d   ", sumandoColumna);
      Thread.sleep(500);
    }
    System.out.printf("|%5d   ", sumandoTotal);
    
    
  }
}
