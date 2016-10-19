/*
 * Ejercicio 20 Tema 4 
 * @uthor David Martin Peréz
 */

public class Ejercicio20 {
  
  public static void main (String args[]) {
    
    int numero;
    boolean capicua = false;
    
    System.out.print("Introduzca un número entero (de 5 cifras como máximo): ");
    numero = Integer.parseInt(System.console().readLine());
    
    
    if (numero < 10) {
      capicua = true;
    }
    
    if ((numero >= 10) && (numero < 100)) {
      if ((numero / 10) == (numero % 10)) {
        capicua = true;
      }
    }

    if ((numero >= 100) && (numero < 1000)) {
      if ((numero / 100) == (numero % 10)) {
        capicua = true;
      }
    }

    if ((numero >= 1000) && (numero < 10000)) {
      if (((numero / 1000) == (numero % 10)) && ((( numero / 100 ) % 10)== (( numero / 10) % 10))) {
        capicua = true;
      }
    }
    
    if (numero >= 10000) {
      if (((numero / 10000) == (numero % 10) ) && ((((numero / 1000) % 10)) == ((numero / 10) % 10))) {
        capicua = true;
      }
    }
    
    if (capicua) {
      System.out.println("El número es capicúa.");
    } else {
      System.out.println("El número no es capicúa.");
}    
  }
}

