/*
 * Echo por David Martin Perez
 * Ejercicio6
 */


public class Ejercicio6 {
  
  public static void main (String args[]) {
    //Datos    
    int b;
    int h;
  
    String Linea;
    //Recogida de datos
    System.out.print("Por favor, introduce la base del triángulo en cm2: ");
    Linea = System.console().readLine();
    b = Integer.parseInt( Linea );

    System.out.print("Por favor, introduce la altura del triángulo en cm2: ");
    Linea = System.console().readLine();
    h = Integer.parseInt( Linea );
    
    //Monstarlos por pantalla
    System.out.println(" ");
    System.out.println("Se multiplican la base y la altura y se divide entre 2");
    System.out.println("La base es " + b + " cm2 y la altura de la base es " + h + " cm2");
    System.out.println("------------------------------------------------------------------------");
    System.out.println("El área del rectángulo definido es de: " + (b * h)/2 + " cm2");
    
    
  }
}

