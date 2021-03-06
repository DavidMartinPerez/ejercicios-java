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
    System.out.println("El número 0 tiene " + mates.cuentas.digitos(0) + " dígito/s.");
    System.out.println("El número 789 tiene " + mates.cuentas.digitos(789) + " dígito/s.");
    //voltea
    System.out.println("Número 892347 al reves es " + mates.cuentas.voltea(892347));
    //digitoN
    System.out.println("En la posición 0 del 3452 está el " + mates.cuentas.digitoN(3452, 0));
    System.out.println("En la posición 6 del 857964034 está el " + mates.cuentas.digitoN(857964034, 6));
    //posicionDeDigito:
    System.out.println("En el 3452, el dígito 4 está en la posición " + mates.cuentas.posicionDeDigito(3452, 4));
    System.out.println("En el 78604321, el dígito 1 está en la posición " + mates.cuentas.posicionDeDigito(78604321, 1));
    //quitaPorDetras
    System.out.println("Si al 78604321 se le quitan por detrás 4 dígitos, se queda como " + mates.cuentas.quitaPorDetras(78604321, 4));
    System.out.println("Si al 1000 se le quita por detrás 1 dígito, se queda como " + mates.cuentas.quitaPorDetras(1000, 1));
    //quitaPorDelante

    System.out.println("Si al 78604321 se le quitan por delante 4 dígitos, se queda como " + mates.cuentas.quitaPorDelante(78604321, 4));
    System.out.println("Si al 78604000 se le quitan por delante 2 dígitos, se queda como " + mates.cuentas.quitaPorDelante(78604000, 2));
    
    
}
}
