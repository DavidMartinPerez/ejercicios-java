/**
 * Ejercicio 7 del Capitulo 7 Arrays
 * Basico Arrays
* @uthor David Martín Pérez
 */

public class Ejercicio07 {

  public static void main(String[] args) {
    int[] num = new int[100];

    
    for(int i=0; i < 100; i++){
      num[i] = (int)(Math.random() * 21);
      System.out.print(num[i] + "  ");
    }
    System.out.println();
    System.out.print("Introduce un valor de la lista: ");
    int antiguo = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el valor por el cual lo quieres intercambiar: ");
    int nuevo = Integer.parseInt(System.console().readLine());
    
    for(int i=0; i < 100;i++){
      if (num[i]==antiguo){
        num[i]=nuevo;
        System.out.print("\""  + num[i] + "\"  ");
      } else { 
        System.out.print(num[i] + "  ");
      }
    }
  }
}
