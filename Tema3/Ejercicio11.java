/*
 * Ejercicio11 tema 3 por David Martin Perez
 * 
 */


public class Ejercicio11 {
  
  public static void main (String args[]) {
    
    //Pedir datos
    System.out.print("¿Qué cantidad de Kb quiere tranformar? : ");
    double Kb = Double.parseDouble(System.console().readLine());
    
    //Monstarlos por pantalla
    System.out.println(" ");
    System.out.println( Kb + " Kb son " + (Kb / 1024) + " Mb");
  }
}

