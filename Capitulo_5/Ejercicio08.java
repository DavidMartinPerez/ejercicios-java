/*
 * Ejercicio 8 Capitulo 5 
 * @uthor David Martin Peréz
 */

public class Ejercicio08 {
  
  public static void main (String args[]) { 
    System.out.println("__La Multiplicadora__");
    System.out.println("-----------------------");
    System.out.print("Introduce un número: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    int i = 0;
    
    while (i < 11) {
    System.out.println(numero + " * " + i + " = " + numero * i);
    i++;
  } 
 }
}

