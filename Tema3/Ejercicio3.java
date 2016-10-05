/*
 * Ejercico 3 By David Martín
 */


public class Ejercicio3 {
  
  public static void main (String args[]) {
//Variables
    double euros = 166.386;
//Pedir por pantalla datos
    System.out.print("¿Qué cantidad de pesetas quiere transformar?: ");
    double pesetas = Double.parseDouble(System.console().readLine());
//Monstarlos por pantalla
    System.out.println("---------------------------------------------");
    System.out.println("Son en total " + pesetas / euros + "euros");
    
  }
}

