/*
 * Ejercicio 9 tema 3 por David Martin Perez
 * 
 */


public class Ejercicio9 {
  
  public static void main (String args[]) {
    //Pedir datos
    System.out.print("¿Radio del cono?(cm2) : ");
    double radioCono = Double.parseDouble(System.console().readLine());
    
    System.out.print("¿Altura del cono?(cm2): ");
    double alturaCono = Double.parseDouble(System.console().readLine());
    //operaciones
    double conoArea = ( 3.14 * ((radioCono * 2) * (alturaCono)) * 1/3);
    //Monstar datos por pantalla
    System.out.println(" ");
    System.out.println("El área del cono es " + conoArea + "cm2");
  }
}

