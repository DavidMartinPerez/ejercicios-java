/**
 * Ejercicio 2 del Capitulo 6
 * números aleatorios
 * Una carta de la baraja española aleatoriamente
* @uthor David Martín Pérez
 */

public class Ejercicio03 {

  public static void main(String[] args) {
    String palo ="";
    String carta ="";
    for (int i = 0; i < 10; i++){
    int tipoPalo = (int)(Math.random()*4);
    
    switch (tipoPalo) {
    case 0:
      palo = "Oro";
        break;
      case 1:
        palo = "Basto";
        break;
      case 2:
        palo = "Copa";
        break;
      case 3:
        palo = "Espada";
        break;
    }
    
    int numeroCarchoiceta = (int)(Math.random()*13 + 1);
    
    switch (numeroCarta) {
      case 1:
        carta = "As";
        break;
      case 11:
        carta = "Sota";
        break;
      case 12:
        carta = "Caballo";
        break;
      case 13:
        carta = "Rey";
        break;      
      default:
        carta = String.valueOf(numeroCarta);
    }
    System.out.println("La carta que salio es el " + carta + " de " + palo);
  }
  }
}
