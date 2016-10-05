/**
* by David Martin
 */

public class Ejercicio1 {
  public static void main(String[] args) {
  //Variantes
  int x;
  int y;
  int z;
  
  String Linea;
  //Pedir datos
  System.out.print("Por favor, introduce el primer número: ");
  Linea = System.console().readLine();
  x = Integer.parseInt( Linea );
  
  System.out.print("Introduce el segundo número: ");
  Linea = System.console().readLine();
  y = Integer.parseInt( Linea );
  
  z = x*y;
  //Monstarlos por pantalla
  System.out.println("El resultado es : " + z );
 }
}
