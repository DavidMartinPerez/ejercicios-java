/**
 * Ejercicio 3 del Capitulo 7 Arrays
 * Basico Arrays
* @uthor David Martín Pérez
 */

public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Introduzca un 10 números.");
    System.out.println("--------------------------------");
    int[] num = new int[10];

      for(int i=0; i < 10;i++){
        System.out.print("Introduzca el " + (i + 1) + "º numero: ");
        num[i] = Integer.parseInt(System.console().readLine());
      }
      for (int i=9;i > -1;i--){
      System.out.println("num[" + i +"]: " + num[i]);
    }
  }
}
