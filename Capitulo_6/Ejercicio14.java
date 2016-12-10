/**
 * Ejercicio 14 del Capitulo 6
 * números aleatorios
 * Números aleatorios entre 100 y 199
* @uthor David Martín Pérez
 */

public class Ejercicio06 {

  public static void main(String[] args) {
    boolean fallo = false;
    int aleatorio = (int)(Math.random() * 101);
    System.out.println("Estoy pensando un numero magico del 1 al 100 :D... ADIVINA");
    System.out.println();
    for (int oportunidades = 4; oportunidades > -1; oportunidades--){
      System.out.print("Introduzca un numero: ");
      int pedir = Integer.parseInt(System.console().readLine());
      
      if (pedir < 0 | pedir > 101){
        System.out.println("Introduce un numero de 1 a 100...");
        oportunidades++;
        System.out.println();
      } else if (aleatorio == pedir){
        System.out.println("¡Acertaste!");
        oportunidades = 0;
        fallo = true;
      }else if (aleatorio > pedir){
        System.out.println("El numero magico es mayor que " + pedir);
        System.out.println("Tienes " + oportunidades + " oportunidades");
        System.out.println();
      }else if(aleatorio < pedir){
        System.out.println("El numeroque pienso es menor que " + pedir);
        System.out.println("Tienes " + oportunidades + " oportunidades");
        System.out.println();
      }
    }
    if(!fallo){
      System.out.println("Lo siento pero no te quedan intentos...");
      System.out.println("El número era " + aleatorio);
    }
  }
}
