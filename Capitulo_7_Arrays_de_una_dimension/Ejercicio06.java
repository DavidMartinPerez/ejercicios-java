/**
 * Ejercicio 6 del Capitulo 7 Arrays
 *Basico Arrays
* @uthor David Martín Pérez | int pedir = Integer.parseInt(System.console().readLine());
 */

public class Ejercicio06 {

  public static void main(String[] args) {
    System.out.println("Escribe 15 números ");
    int[] num = new int[15];

    for(int i=0;i < 15;i++){
      System.out.print("Introduce un numero: ");
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    for(int k=0; k <15;k++){
      System.out.println("num[" + k + "]= " + num[k]);
    }
    System.out.println("------------Movimiento----------------------");
      //int aux = num[0];
      //for (int i = 0; i <14; i++) {
        //num[i] = num[i+1];
      //} Este seria si lo queremos hacer hacia atras en vez de delante
      //num[14] = aux;
      int aux = num[14];
      for (int i = 14; i > 0; i--) {
        num[i] = num[i-1];
      }
      num[0] = aux;
      for(int k=0; k <15;k++){
      System.out.println("num[" + k + "]= " + num[k]);
    }

  }
}
