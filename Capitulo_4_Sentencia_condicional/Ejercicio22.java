/*
 * Ejercicio 22 Tema 4 
 * @uthor David Martin Peréz
 */

public class Ejercicio22 {
  
   public static void main (String args[]) {
	       System.out.print("Por favor, introduzca un día de la semana (de lunes a viernes): ");
    String dia = System.console().readLine();

    int diaNum = 0;

    switch(dia) {
      case "lunes":
        diaNum = 0;
        break;
      case "martes":
        diaNum = 1;
        break;
      case "miércoles":
      case "miercoles":
        diaNum = 2;
        break;
      case "jueves":
        diaNum = 3;
        break;
      case "viernes":
        diaNum = 4;
        break;
      default:
        System.out.print("El día introducido no es correcto.");
    }
    
    System.out.println("Introduce la hora(hora y minutos)");
    
    System.out.print("Hora: ");
    int horas = Integer.parseInt(System.console().readLine());
    
    System.out.print("Minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int minutosTotal = (4 * 24 * 60) + (15 * 60);
    int minutosActual = (diaNum * 24 * 60) + (horas * 60) + minutos;
    
System.out.print("Faltan " + (minutosTotal - minutosActual) + " minutos para el fin de semana.");
	   
	   
	   
	   
	}
}
