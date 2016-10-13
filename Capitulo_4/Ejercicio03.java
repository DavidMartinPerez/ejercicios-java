/*
 * Ejercicio 3 Por David Martín Pérez 
 */


public class Ejercicio03 {
  
  public static void main (String args[]) {
    System.out.print("Día de la semana: ");
    int dia = Integer.parseInt(System.console().readLine().toLowerCase());
    
    switch (dia) {
      case 1:
        System.out.println("Lunes");
      break;
      
      case 2:
        System.out.println("Martes");
      break;
      
      case 3:
        System.out.println("Miércoles");
      break;
      
      case 4:
        System.out.println("Jueves");
      break;
      
      case 5:
        System.out.println("Viernes");
      break;
      
      case 6:
        System.out.println("Sabado");
      break;
      
      case 7:
        System.out.println("Domingo");
      break;
      
      default:
        System.out.println("Error 404");
        System.out.println("No se encuentra el día de la semana");
    }
  }
}

