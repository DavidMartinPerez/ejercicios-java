/**
 * Ejercicio 10 del Capitulo 7 Arrays
 * Basico Arrays
* @uthor David Martín Pérez 
 */

public class Ejercicio10 {

  public static void main(String[] args) {
    
    int[] num = new int[20];
    for(int i=0;i < 20;i++){
      num[i] = (int)((Math.random() * 101));
    }
    
    for(int i=0;i < 20;i++){
      System.out.print(num[i]+" | ");
    }
    
    
  }
}
