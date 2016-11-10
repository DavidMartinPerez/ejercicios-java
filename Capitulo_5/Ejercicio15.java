/*
 * Ejercicio 15 Capitulo 5 
 * @uthor David Martin Peréz
 */

public class Ejercicio15 {
  
  public static void main (String args[]) {
    System.out.print("Introduce el número base: ");
    double numeroBase = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce el exponente(entero): ");
    int numeroPotencia = Integer.parseInt(System.console().readLine());

    double potencia;
    int exponente;
        
    for (int i = 1; i <= numeroPotencia; i++) {
        
      potencia = 1;
      exponente = i;
      
      for (int j = 0; j < exponente; j++) {
        potencia *= numeroBase;
      }
      
      System.out.println(numeroBase + "^" + i + " = " + potencia);
    }
  }
}


