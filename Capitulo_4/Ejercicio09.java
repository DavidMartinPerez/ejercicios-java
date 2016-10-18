/*
 * Ejercicio 9 Tema 4 
 * @uthor David Martin Peréz
 */

public class Ejercicio09 {
  
  public static void main (String args[]) {
    double x1;
    double x2;

    System.out.println("Resolvedor de ecuaciones de segundo grado.");
    //ax^2 + bx + c = 0
    
    System.out.println("Introduzca los valores.");
    
    System.out.print("a = ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("b = ");
    double b = Double.parseDouble(System.console().readLine());
    
    System.out.print("c = ");
    double c = Double.parseDouble(System.console().readLine());
    
    if ((a == 0) && (b == 0) && (c == 0)) {
      System.out.println("Tiene infinitas soluciones.");
    }
    
    
    if ((a == 0) && (b == 0) && (c != 0)) {
      System.out.println("No tiene solución.");
    }
          
    if ((a != 0) && (b != 0) && (c == 0)) {
      System.out.println("x1 = 0");
      System.out.println("x2 = " + (-b / a));
    }
    
    if ((a == 0) && (b != 0) && (c != 0)) {
      System.out.println("x1 = x2 = " + (-c / b));
    }
    
    if ((a != 0) && (b != 0) && (c != 0)) {  
        
      double discriminante = b*b - (4 * a * c);
      
      if (discriminante < 0) {
          System.out.println("No tiene soluciones reales");
      }  else {
        System.out.println("x1 = " + (-b + Math.sqrt(discriminante))/(4 * a * c));
        System.out.println("x2 = " + (-b - Math.sqrt(discriminante))/(4 * a * c));
      }
    }
          
  }
}


