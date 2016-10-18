/*
 * Ejercicio 13 Tema 4 
 * @uthor David Martin Peréz
 */


public class Ejercicio13 {
  
  public static void main (String args[]) {
    int ayuda;
    System.out.println("Ordenador de mayor a menor los números: ");    
    System.out.print("Introduzca el primer número: ");
    int num1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el segundo número: ");
    int num2 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el tercer número: ");
    int num3 = Integer.parseInt(System.console().readLine());

    if (num1 > num2) {
      ayuda = num1;
      num1 = num2;
      num2 = ayuda;
    }
    
    if (num2 > num3) {
      ayuda = num2;
      num2 = num3;
      num3 = ayuda;
    }
    
    if (num1 > num2) {
      ayuda = num1;
      num1 = num2;
      num2 = ayuda;
    }
        
    System.out.println("Ordenados de menor a mayor: " + num1 +  ", " + num2 + " y " + num3 ); 
  }
}
