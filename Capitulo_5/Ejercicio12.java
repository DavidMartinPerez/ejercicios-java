/*
 * Ejercicio 12 Capitulo 5 
 * @uthor David Martin Peréz
 */

public class Ejercicio12 {
  
  public static void main (String args[]) { 
    System.out.println("Este programa calculara la Fibonacci hasta el número que pongas");
    System.out.print("Introduce un número: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    int ValorA = 0;
    int ValorB = 1;
    
    if (numeroIntroducido > 0){
    System.out.println("0");
    } else if (numeroIntroducido > 1){
    System.out.println("1");
    }
    
    
    
    for(int i = 0; i < numeroIntroducido; i ++) {
       //es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores.
       // La suma de los dos anteriores da el siguiente
       int aux = ValorA;
       ValorA = ValorB;
       ValorB = ValorA + aux;
       System.out.println(ValorB);
  } 
 }
}
