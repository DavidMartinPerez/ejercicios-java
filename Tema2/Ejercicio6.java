/**
* Autor David Martin
 */

public class Ejercicio6 {
  public static void main(String[] args) {
    double base = 120;
    double iva = 0.21;

    System.out.println("El base del producto es %8.2f €/n" + base + " euros");    
    System.out.println("El precio total es de   %8.2f €/n " + (base * iva + base) + " euros");
    System.out.println("          Gracias por su compra. ^^");
 }
}
