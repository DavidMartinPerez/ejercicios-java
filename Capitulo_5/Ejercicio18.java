/*
 * Ejercicio 18 Capitulo 5 
 * @uthor David Martin Peréz
 */

public class Ejercicio18 {
  
  public static void main (String args[]) {
    int numeroMenor = 0;
    int numeroMayor = 0;



    System.out.print("Introduzca un número: ");
    numeroMenor = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca un número mayor: ");
    numeroMayor = Integer.parseInt(System.console().readLine());
    
    if (numeroMayor == numeroMenor){
      System.out.println("introduzca dos números diferentes.");
    } else if (numeroMayor > numeroMenor) {
        for (int i =numeroMenor; i <= numeroMayor; i+=7){
          System.out.println(" 1El numero siguiente es: " + i);
        }
    } else {
        for (int i = numeroMayor; i <= numeroMenor; i+=7){
          System.out.println("2 El numero siguiente es: " + i);
        }
    }
    
  }
}
