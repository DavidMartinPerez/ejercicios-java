/*
 * Ejercicio 10 Capitulo 5 
 * @uthor David Martin Peréz
 */

public class Ejercicio10 {
  
  public static void main (String args[]) { 
    
    double numeros = 0;
    double numeroIntroducido = 0;
    double suma = 0;

    System.out.println("Calculadora de números positivos (SUMA)");
    System.out.println("Introduce números (puede parar introduciendo un número negativo):");

    while (numeroIntroducido >= 0) {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      numeros++;
      suma += numeroIntroducido;
    }
    
    System.out.println("La media de los números positivos introducidos es " + (suma - numeroIntroducido)/ (numeros - 1));

  } 
 }
