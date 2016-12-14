/**
 * Ejercicio 11 del Capitulo 7 Arrays
 * Basico Arrays
* @uthor David Martín Pérez 
 */

public class Ejercicio11 {

  public static void main(String[] args) {
    int[] num = new int[10];
    int n=0;
    System.out.print("Introduzce 10 numeros(Press Enter): ");
    for(int i=0; i < 10; i++){
      num[i]= Integer.parseInt(System.console().readLine());
    }
    System.out.println("Array Original");
    System.out.println("\n       ╔═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╗");
    System.out.print("Indice ");
    for (int i = 1;i < 11;i++) {
      int m = i;
      System.out.printf("║%3d  ", m);
    }
    System.out.println("║\n       ╚═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╝");
    System.out.println("       ╔═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╗");
    System.out.print("Valor  ");
    for (int i=0;i < 10;i++) {
      n=num[i];
      System.out.printf("║%3d  ", n);
    }
    System.out.println("║\n       ╚═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╝");
  }
}


  
