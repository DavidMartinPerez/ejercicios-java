/**
 * Ejercicio 12 del Capitulo 7 Arrays
 * Basico Arrays
* @uthor David Martín Pérez 
 */

public class Ejercicio12 {

  public static void main(String[] args) {
    //Declarar arrays
    int[] num = new int[10];
    int[] aux = new int[10];
    //Declarar variables
    int i=0;
    int inicial=0;
    int finals=0;
    boolean salir = false;
    
    
    //Pedir por teclado
    System.out.println("Introduce 10 número");
    System.out.println("----------------------");
    for(i=0;i<10;i++){
      System.out.print("Introduce un numero: ");
      num[i]= Integer.parseInt(System.console().readLine());
    }
    
    //Pintar 
    System.out.println("Array Inicial");
    System.out.println("--------------------");
    System.out.print("Indice ");
    for (i = 0;i < 10;i++) {
      int m = i;
      System.out.printf("%4d  ", m);
    }
    System.out.println();
     System.out.println("       ╔═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╗");
    System.out.print("Valor  ");
    for (i=0;i < 10;i++) {
      int n=num[i];
      System.out.printf("║%3d  ", n);
    }
    System.out.println("║\n       ╚═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╝");
  
  
    //Ahora vamos a pedir las posiciones
    System.out.println("Introduce las coordinadas");
    System.out.println("----------------------");
    while(!salir)
    if(finals==0 && inicial==0){
      System.out.print("Introduce la coordinada inicial: ");
      inicial= Integer.parseInt(System.console().readLine());
      System.out.print("Introduce la coordinada final: ");
      finals= Integer.parseInt(System.console().readLine());
    }else if(inicial < 0 | inicial > 9 | finals < 0 | finals > 9){
      salir=false;
      finals=0;
      inicial=0;
      System.out.println("Introduce cifras entre 0 y 9");
    }else if (inicial>finals){
      int auxi=finals;
      finals=inicial;
      inicial=auxi;
      System.out.println("Estas son tus coordinadas " + inicial + " y " + finals);
      salir=true;
    }else {
      salir=true;
      System.out.println("Estas son tus coordinadas " + inicial + " y " + finals);
    }
     //ahora vamos a invertir las posiciones
      for(i=inicial; i < finals;i++){//con esto guardamos las posiciones
        aux[i] = num[i];
      }
      
      
      //vemos como esta el auxiliar
      i=0;
      while(i<10){
      System.out.print(aux[i]+" ");
      i++;
    }
  }
}
