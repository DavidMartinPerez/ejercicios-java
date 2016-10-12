/*
 * Ejercicio 4 Por David Martín Pérez 
 */


public class Ejercicio4 {
  
  public static void main (String args[]) {
    //Variantes
    int x;
    int y;
    
    
    String Linea;
    //Pedir datos
    System.out.print("Por favor, introduce el primer número: ");
    Linea = System.console().readLine();
    x = Integer.parseInt( Linea );
    
    System.out.print("Introduce el segundo número: ");
    Linea = System.console().readLine();
    y = Integer.parseInt( Linea );
    
    //Monstarlos por pantalla
    System.out.println("La suma de los dos números es: " + (x + y));
    System.out.println("La resta de los dos números es: " + (x - y));
    System.out.println("La multiplicación de los dos números es: " + (x * y));
    System.out.println("La división de los dos números es: " + (x / y));
  }
}

