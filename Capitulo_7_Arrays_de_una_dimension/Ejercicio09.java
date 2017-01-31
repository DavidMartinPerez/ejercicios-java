/**
 * Ejercicio 9 del Capitulo 7 Arrays
 * Basico Arrays
* @uthor David Martín Pérez 
 */

public class Ejercicio09 {

  public static void main(String[] args) {

    int[] num = new int[8];
    
    for(int i=0;i < 8; i++){
      System.out.print("Introduce un numero: ");
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    for(int i=0;i<8;i++){
      if(num[i] % 2 == 0){
        System.out.println("El número " + num[i] + " es par");
      } else {
        System.out.println("El número " + num[i] + " es impar");
      }
    }
  }
}
    
