/*
 * Ejercicio 18 Tema 4 
 * @uthor David Martin Peréz
 */



public class Ejercicio18 {
  
  public static void main (String args[]) {
    int numero; 
    int primera = 0;
    
    System.out.print("Introduce un número entero (de 5 cifras como máximo): ");
    numero = Integer.parseInt(System.console().readLine());
    
    if ( numero < 10 ) {
      primera = numero;
    }
    
    if (( numero >= 10 ) && ( numero < 100 )) {
      primera = numero / 10;
    }
    
    if (( numero >= 100 ) && ( numero < 1000 )) {
      primera = numero / 100;
    }
    
    if (( numero >= 1000 ) && ( numero < 10000 )) {
      primera = numero / 1000;
    }
    
    if ( numero >= 10000 ) {
      primera = numero / 10000;
    }
    
    System.out.println("La primera cifra del número introducido es el " + primera);
  }
}

