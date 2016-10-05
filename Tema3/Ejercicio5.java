/*
 *Ejercicio 5 de David Martín Pérez
 * 
 */


public class Ejercicio5 {
  
  public static void main (String args[]) {
    //Variantes
    int b;
    int h;
  
  String Linea;
  
  //Pedir datos
    System.out.print("Por favor, introduce la base del rectángulo: ");
    Linea = System.console().readLine();
    b = Integer.parseInt( Linea );

    System.out.print("Por favor, introduce la altura del rectángulo : ");
    Linea = System.console().readLine();
    h = Integer.parseInt( Linea );
  
  //Monstarlos por pantalla
    System.out.println(" ");
    System.out.println("Se multiplica la base (" + b + " cm2) por la altura(" + h + " cm2)");
    System.out.println("--------------------------------------------------------------------------");
    System.out.println("El área del rectángulo definido es de: " + (b * h));
  
  }
}

