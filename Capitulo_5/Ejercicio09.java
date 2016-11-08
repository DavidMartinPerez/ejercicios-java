/*
 * Ejercicio 9 Capitulo 5 
 * @uthor David Martin Peréz
 */

public class Ejercicio09 {
  
  public static void main (String args[]) { 
    System.out.println("Este programa le dira cuantos digitos tiene un número");
    System.out.print("Introduce un número: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    int Digitos = 1;
    
    int calculoDigitos = numeroIntroducido;
      
      while (calculoDigitos > 11) {
      calculoDigitos /= 10;
      Digitos++;
      } 
    
    System.out.println(numeroIntroducido + " tiene " + Digitos + " dígito/s.");
    
    
  } 
 }


