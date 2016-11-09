/*
 * Ejercicio 11 Tema 4 
 * @uthor David Martin Peréz
 */


public class Ejercicio11 {
    
   public static void main (String args[]) {
    System.out.println("Este programa le dara el cuadrado"); 
    System.out.println("y el cubo de los siguientes 5 numeros que introduzca");
    System.out.print("Introduzca un número: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
      System.out.printf("%3d %5d %7d\n--------------------\n", i, i * i, i * i * i);
    }
  }
}
     
