/**
 * Ejercicio 9 del Capitulo 6
 * números aleatorios
* @uthor David Martín Pérez
 */

public class Ejercicio09 {

  public static void main(String[] args) {
    int numeroAleatorio = 1;
    int par = 1;
    int numeros = 0;
    
    for (int i = 1; numeroAleatorio != 24; i++){
      numeroAleatorio = (int)(Math.random() * 99) + 1;
      
      if ( numeroAleatorio != 24){
      par = numeroAleatorio % 2;
       if (par == 0) {
        System.out.println(numeroAleatorio);
        numeros++;
      } 
    }
  }
      if ( numeros == 0 ) { 
        System.out.println("El primer numero es 24");
      } else { 
        System.out.println("Se mostraron " + numeros);
      }
    System.out.println();  
  }
}
    
    
    


