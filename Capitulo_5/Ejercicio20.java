/*
 * Ejercicio 19 Tema 4 
 * @uthor David Martin Peréz
 */


public class Ejercicio20 {
  
   public static void main (String args[]) {
         int alturaPedida = 0;
    int altura = 1;

    String caracter = "";
    
    System.out.print("Introduzca la altura: ");
    alturaPedida = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el caracter: ");


    int espacios = (alturaPedida-1); 
    int i = 0;
    System.out.println(caracter);
    while(altura <= alturaPedida){
      
      for(i = 0; i <= espacios * 2; i++){
        System.out.print(" ");
      }
      
      for (i=1; i < altura ; i++){
        System.out.print(caracter);
      }
      altura++;
      System.out.println();
      espacios--;
    }
   
   }
 }
