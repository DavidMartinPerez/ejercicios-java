/**
 * Ejercicio 6 del Capitulo 7 Arrays
 * números aleatorios
* @uthor David Martín Pérez | int pedir = Integer.parseInt(System.console().readLine());
 */

public class Ejercicio06 {

  public static void main(String[] args) {
    System.out.println("Escribe 15 números ");
    int[] num = new int[15];

    for(int i=0;i < 15;i++){
      System.out.print("Introduce un numero: ");
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    for(int k=0; k <15;k++){
      System.out.println("num[" + k + "]= " + num[k]);
    }
    System.out.println("------------Movimiento----------------------");
    
    System.out.println("Array original:");
      for (int i = 0; i < 15; i++) {
        System.out.printf("|%3d ", i);
      }
      System.out.println("|");
      for (int i = 0; i < 75; i++) {
        System.out.print("⎯");
      }
      System.out.println("⎯");
      for (int i = 0; i < 15; i++) {
        System.out.printf("|%3d ", num[i]);
      }
    System.out.println("|");
  }
}
