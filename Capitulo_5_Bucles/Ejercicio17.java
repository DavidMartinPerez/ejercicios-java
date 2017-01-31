/*
 * Ejercicio 17 Capitulo 5 
 * @uthor David Martin Peréz
 */

public class Ejercicio17 {
  
  public static void main (String args[]) {
    int numero;
    
    System.out.print("Introduzca un número: ");
    numero = Integer.parseInt(System.console().readLine());
    int condicion = (numero + 102);
    if (numero < 0){
      System.out.println("Introduzca un número positivo");
    } else {
        for (int i = numero+1; i < condicion; i++){
        System.out.println(" El numero siguiente es: " + i);
      }
    }

  }
}
