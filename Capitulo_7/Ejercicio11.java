/**
 * Ejercicio 11 del Capitulo 7 Arrays
 * Basico Arrays
* @uthor David Martín Pérez 
 */

public class Ejercicio11 {

  public static void main(String[] args) {
    //Declarar arrays
    int[] num = new int[10];
    int[] noPrimo = new int[10];
    int[] primo = new int[10];
    //declaras variables
    int n=0;
    int primos=0;
    int noPrimos=0;
    int i=0;
    int j=0;
    boolean esPrimo = false;
    
    //Pedir el array y mostrarlo
    System.out.print("Introduzce 10 numeros(Press Enter): ");
    
    for(i=0; i < 10; i++){
      num[i]= Integer.parseInt(System.console().readLine());
      
      esPrimo = true;
      for (j = 2; j < num[i] - 1; j++) {
        if (num[i] % j == 0) {
          esPrimo = false;
        }
      }
    

        if(esPrimo){
          primo[primos++]= num[i];
        }else {
          noPrimo[noPrimos++] = num[i]; 
        }
    }
    //Imprimir el array original
    System.out.println("Array Original");
    System.out.print("Indice ");
    for (i = 1;i < 11;i++) {
      int m = i;
      System.out.printf("%4d  ", m);
    }
    System.out.println();
     System.out.println("       ╔═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╗");
    System.out.print("Valor  ");
    for (i=0;i < 10;i++) {
      int z=num[i];
      System.out.printf("║%3d  ", z);
    }
    System.out.println("║\n       ╚═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╝");
    
    
    //Ordenar el array
    for(i=0;i<primos;i++){
      num[i]=primo[i];
    }
    
    for(i = primos; i < primos + noPrimos; i++){
      num[i] =noPrimo[i - primos];
    }
    
    
    
    //Imprimir el otro array
    System.out.println("Array modificado");
    System.out.println("--------------------");
    System.out.print("Indice ");
    for (i = 1;i < 11;i++) {
      int m = i;
      System.out.printf("%4d  ", m);
    }
    System.out.println();
     System.out.println("       ╔═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╗");
    System.out.print("Valor  ");
    for (i=0;i < 10;i++) {
      n=num[i];
      System.out.printf("║%3d  ", n);
    }
    System.out.println("║\n       ╚═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╝");

        
      }
    }







  
