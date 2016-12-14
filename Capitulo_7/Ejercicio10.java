/**
 * Ejercicio 10 del Capitulo 7 Arrays
 * Basico Arrays
* @uthor David Martín Pérez 
 */

public class Ejercicio10 {

  public static void main(String[] args) {
    
    int[] num = new int[20];
    int[] impar = new int [20];
    int[] par = new int[20];
    
    int pares = 0;
    int impares = 0; 
    
    for(int i=0;i < 20;i++){//un for para poner en un array los pares y en otro los impares
      num[i] = (int)((Math.random() * 101));
      if(num[i] % 2 == 0){
        par[pares++]= num[i];
      }else {
        impar[impares++] = num[i]; 
      }
    }
     System.out.println("----");
    for(int i=0;i<20;i++){ //for para escribir 
     
      
      for(int j=0; j < 20;j++){ //aqui escribe los pares al principio
        num[j] = par[j];
      }
      
      for(int k=pares; k<20;k++){ //aqui escribe los impares al final del array por que empieza desde los pares
        num[k] = impar[k - pares];
      }
      System.out.println(num[i]);
  }
}
}
