/**
 * Ejercicio 2 del Capitulo 6
 * números aleatorios
* @uthor David Martín Pérez
 */

public class Ejercicio02 {

  public static void main(String[] args) {
    String palo ="";
    String carta ="";
    
    int tipoPalo = (int)(Math.random()*4);
    
    switch (tipoPalo) {
    case 0:
      palo = "picas";
        break;
      case 1:
        palo = "corazones";
        break;
      case 2:
        palo = "diamantes";
        break;
      case 3:
        palo = "tréboles";
        break;
    }
    
    int numeroCarta = (int)(Math.random()*14);
    
    switch (numeroCarta) {
      case 0:
        carta = "As";
        break;
      case 11:
        carta = "J";
        break;
      case 12:
        carta = "Q";
        break;
      case 13:
        carta = "K";
        break;      
      default:
        carta = String.valueOf(numeroCarta);
    }
    
    
    System.out.println("La carta que salio es el " +  carta + " de " + palo);
  }
}
