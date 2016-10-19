/*
 * Ejercicio 17 Tema 4 
 * @uthor David Martin Peréz
 */


public class Ejercicio17 {
  
  public static void main (String args[]) {
    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println("La ultima cifra de tu número es " + (numero % 10));
  }
}

