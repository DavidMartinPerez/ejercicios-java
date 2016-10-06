/*
 * Ejercicio 1 Tema 4 
 * @uthor David Martin Peréz
 */


public class Ejercicio1 {
  
   public static void main (String args[]) {
    System.out.print("Introduce un día de la semana: ");
    String dia = (System.console().readLine().toLowerCase());
    
    if (dia.equals("lunes")){
      System.out.println("Tienes Sistemas Informaticos");
    } else if (dia.equals("martes")){
      System.out.println("Tienes Programación");
    } else if (dia.equals("miercoles")){
      System.out.println("Tienes Programación");
    } else if (dia.equals("jueves")){
      System.out.println("Tienes Base de Datos");
    } else if (dia.equals("viernes")){
      System.out.println("Tienes Lenguaje de Marcas");
    } else System.out.println("Vuelva a introducirlo, por favor");
    }
    
}

