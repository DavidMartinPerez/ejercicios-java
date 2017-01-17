/**
 * 8. Funciones
 *
 * Ejercicios 1 a 14
 *
 * @author Luis José Sánchez
 */

import mates.cuentas;

public class Ejercicio1a14 {

  public static void main(String[] args) {

    //esCapicua 

    if (mates.cuentas.esCapicua(300)) {
      System.out.println("El 300 es capicúa");
    }

    if (mates.cuentas.esCapicua(8228)) {
      System.out.println("El 8228 es capicúa");
    }
    
    //esPrimo Verdadero o Falso
    if (mates.cuentas.esPrimo(22)) {
      System.out.println("El 1 es primo");
    }

    if (mates.cuentas.esPrimo(73)) {
      System.out.println("El 73 es primo");
    }
    
    
    //siguientePrimo: Devuelve el menor primo que es mayor al número que
    //se pasa como parámetro.
    System.out.println("El proximo de 9 es " + mates.cuentas.siguientePrimo(9));
 
    System.out.println("El proximo de 73 es " + mates.cuentas.siguientePrimo(73));
  
    //potencia: Dada una base y un exponente devuelve la potencia.
    
    System.out.println("2^10 = " + mates.cuentas.potencia(2, 10));
    System.out.println("10^6 = " + mates.cuentas.potencia(10, 6));
    //digitos
    
    //voltea
    
    //digitoN
    
    
}
}
