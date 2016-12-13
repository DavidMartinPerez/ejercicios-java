/**
 * Ejercicio 1 del Capitulo 7 Arrays
 * Basico Arrays
* @uthor David Martín Pérez
 */

public class Ejercicio05 {
  public static void main(String[] args) {
    System.out.println("Escribe 10 números ");
    int[] num = new int[10];
    int Max = 0;
    int Min = 1;
    for(int i=0;i < 10;i++){
      System.out.print("Introduce un numero: ");
      num[i] = Integer.parseInt(System.console().readLine());
      if(num[i] > Max){
        Max = num[i];
      }
      if(num[i] < Min){
        Min = num[i];
      }
    }
    for (int k=0;k < 10; k++){
      System.out.println("num[" + k + "]= " + num[k]);
    }
    System.out.println("El número mas grande es " + Max);
    System.out.println("El número menor es " + Min);
  }
}
