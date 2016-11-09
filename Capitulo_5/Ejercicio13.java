/*
 * Ejercicio 13 Tema 4 
 * @uthor David Martin Peréz
 */


public class Ejercicio13 {
  
   public static void main (String args[]) {
     
    int positivo = 0;
    int negativo = 0;
    
    System.out.println("Lista una serie de números");
    
    for (int i = 10; i > 0; i--){
      System.out.print("Introduce un número: ");
      int numeroIntroducido = Integer.parseInt(System.console().readLine());
      if ( numeroIntroducido >= 0) {
        positivo ++;
       } else {
         negativo ++;
        }
    }
      System.out.println("En tu lista hay " + positivo + " positivos y " + negativo + " negativos");
  }
}
     
