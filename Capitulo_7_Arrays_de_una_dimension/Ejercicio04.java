/**
 * Ejercicio 4 del Capitulo 7 Arrays
 * Basico Arrays
* @uthor David Martín Pérez
 */

public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.println("");
    System.out.println("");
    long[] numero = new long[20];
    long[] cuadrado = new long[20];
    long[] cubo = new long[20];
    
        
        for(int i=0; i < 20;i++){
          numero[i] = (int)((Math.random()*101));
          System.out.println("numero[" + i + "]: " + numero[i]);
        }
        
        for(int i=0; i < 20;i++){
          cuadrado[i] = numero[i]*numero[i];
          System.out.println("cuadrado[" + i + "]: " + cuadrado[i]);
        }
        
        for(int i=0; i < 20;i++){
          cubo[i] = cuadrado[i]*numero[i];
          System.out.println("cubo[" + i + "]: " + cubo[i]);
        }
  }
}

