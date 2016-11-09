/*
 * Ejercicio 14 Capitulo 5 
 * @uthor David Martin Peréz
 */

public class Ejercicio14 {
  
  public static void main (String args[]) {
    System.out.println("Este programa calcula potencias");
    System.out.println("--------------------------------------");
    System.out.print("Introduce un número(entero y positivo): ");
    int numeroBase = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce la potencia(entero y positivo): ");
    int numeroPotencia = Integer.parseInt(System.console().readLine());
    int resultado = 1;
    for (int i = 0; i != numeroPotencia; i++) {
      resultado = resultado * numeroBase;
    }
    System.out.println("El resultado de " + numeroBase + "^" + numeroPotencia + "=" + resultado);
  }
}
