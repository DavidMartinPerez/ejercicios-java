/*
 * Ejercicio 7 java por David Martin Perez
 * 
 */


public class Ejercicio7 {
  
  public static void main (String args[]) {
    
    //Pedir datos
    System.out.print("Por favor, introduce la base imponible (precio sin IVA): ");
    double baseImpo = Double.parseDouble(System.console().readLine());
    
    double iva = baseImpo * 0.21;
    
    //Monstarlos por pantalla
    System.out.printf("Base sin IVA   %8.2f\n", (baseImpo));
    System.out.printf("valor IVA      %8.2f\n", (iva));
    System.out.printf("------------------\n");
    System.out.printf("Total          %8.2f\n", (baseImpo + iva));
  }
}

