/*
 * Ejercicio 16 Capitulo 5 
 * @uthor David Martin Peréz
 */

public class Ejercicio16 {
  
  public static void main (String args[]) {
  int numero;
  System.out.println("Este programa le dira si su número es primo o no");
  System.out.print("Introduzca un número: ");
  numero = Integer.parseInt(System.console().readLine());
  
  int es = (numero / numero) & (numero / 1);
  
  if (es==1){
  System.out.println("El número " + numero + " es primo");
  }else {
  System.out.println("El número " + numero + " no es primo");
}
  }
}
