/*
 * Ejercicio 2 Tema 4 
 * @uthor David Martin Peréz
 */


public class Ejercicio2 {
  
   public static void main (String args[]) {


    System.out.print("¿Qué hora es?(0-23): ");
    int hora = Integer.parseInt(System.console().readLine().toLowerCase());
    
    if ((hora >= 6) && (hora <= 12)) {
      System.out.println("Pues... ¡Buenos días!");
    } 
    
    if ((hora >= 13) && (hora <= 20)) {
      System.out.println("Pues... ¡Buenas tardes!");
    } 
    
    
    if (((hora >= 21) && (hora < 24)) || ((hora <= 5) && (hora >= 0))) {
      System.out.println("Pues... ¡Buenas noches y a dormir!");
    } 
    
    if ((hora >= 24) || (hora < 0)) {
    System.out.println("¡Diganos una hora valida!"); 
    }
  } 
}

