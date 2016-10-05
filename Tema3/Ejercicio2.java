/*
 * Ejercicio2 by David
 * 
 */


public class Ejercicio2 {
  
  public static void main (String args[]) {
  
//Variables
    double pesetas = 166.386;
//Pedir por pantalla datos
    System.out.println("¿Qué cantidad de euros quiere transformar? ");
    double euros = Double.parseDouble(System.console().readLine());
//Monstarlos por pantalla
    System.out.println("---------------------------------------------");
    System.out.println("Son en total " + euros * pesetas + "pesetas");
  }
}

