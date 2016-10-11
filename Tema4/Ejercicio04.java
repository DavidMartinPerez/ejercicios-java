/*
 * Ejercicio 4 Tema 4 
 * @uthor David Martin Peréz
 */


public class Ejercicio04 {
  
   public static void main (String args[]) {


    int sueldo;

    System.out.print("Indroduce las horas trabajadas esta semana: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    if (horasTrabajadas < 40) {
      sueldo = 12 * horasTrabajadas;
    } else {
      sueldo = (40 * 12) + ((horasTrabajadas - 40) * 16);    
    }
    System.out.println("Ha ganado " + sueldo + " euros");
 }
}

