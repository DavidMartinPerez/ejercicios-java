/**
 * Ejercicio 13 del Capitulo 7 Arrays
 * Basico Arrays
* @uthor David Martín Pérez 
*  num[i] = (int)(Math.random() * 501);
* int[] num = new int[100];
* num[i]= Integer.parseInt(System.console().readLine(
 */

public class Ejercicio13 {

  public static void main(String[] args) {
    int[] num = new int[100];
    int i=0;
    int respuesta=0;
    boolean pregunta = false;
    int Max= -1;
    int Min = 101;
    String blanco = "\033[37m";
    String azul = "\033[34m";
    int destacado = 0;
    for(i=0;i<100;i++){
      num[i] = (int)(Math.random() * 501);
      System.out.print(num[i] + " ");
      if(num[i] < Min){
        Min=num[i];
      }
      if(num[i] > Max){
        Max = num[i];
      }
    }
    
    System.out.println(" ");
    System.out.println(" ");
    while(!pregunta){
      System.out.print("¿Qué número quieres destacar? (1- el minimo y 2- el maximo): ");
      respuesta= Integer.parseInt(System.console().readLine());
      if(respuesta==1){
        pregunta=true;
        destacado=Min;
      }else if(respuesta==2){
        pregunta=true;
        destacado = Max;
      }else {
        pregunta=false;
      }
    }
    
    for (int elemento : num) {
      if (elemento == destacado) {
        System.out.print(azul + " **" + elemento + "** "+ blanco);
      } else {
        System.out.print(elemento + " ");
      
      }
    }
  System.out.println("aqui" + Max + " "+ Min);
}
}
