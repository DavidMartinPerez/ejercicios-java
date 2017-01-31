/**
 * Ejercicio 12 del Capitulo 6
 * números aleatorios
* @uthor David Martín Pérez
 */

public class Ejercicio12 {

  public static void main(String[] args)throws Exception {
    for (int i=0; i < 8000; i++){
      for (int j=0; j < 60; j++){
       System.out.print((char)(Math.random() * (126 - 32 + 1) + 32));
     }
     System.out.println();
     Thread.sleep(80);
    }
  }
}
