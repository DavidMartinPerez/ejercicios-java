/*
 * Ejercicio10 tema 3 por David Martin Perez
 * 
 */


public class Ejercicio10 {
  
  public static void main (String args[]) {
    //pedir datos
    System.out.print("¿Qué cantidad de Mb quiere tranformar? : ");
    double Mb = Double.parseDouble(System.console().readLine());
    
    //Monstarlos por pantalla
    System.out.println(" ");
    System.out.println( Mb + " Mb son " + (Mb * 1024) + " Kb");
  }
}

