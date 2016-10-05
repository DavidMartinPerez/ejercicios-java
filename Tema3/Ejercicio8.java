/*
 * Ejercicio8 por David Martin Perez
 * 
 */


public class Ejercicio8 {
  
  public static void main (String args[]) {
    
    //Pedir datos
    System.out.print("¿Cúantas horas ha trabajado esta semana? : ");
    double horasTrabajadas = Double.parseDouble(System.console().readLine());
    
    //Monstarlos por pantalla
    System.out.println(" ");
    System.out.printf("Usted ha ganado " + (horasTrabajadas * 12) + " euros esta semana.");
  }
}
