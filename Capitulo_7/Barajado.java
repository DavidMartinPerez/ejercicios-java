/**
 * Ejercicio 4 examen otros años, Consiste en crear aleatoriamente un array y
 * luego barajarlo aleatoriamente
 * Basico Arrays
* @uthor David Martín Pérez 
 */

public class Barajado {

  public static void main(String[] args) {
    //declaramos arrays
    int[] num = new int[20];
    int[] ocupado = new int[10];
    int metidos = 0; //variable que va a calcular las veces que han entrado en el array
    int compara=0;//esta variable hara
    int entra = 0;
    boolean valorAsignado = false;
    
    while(metidos < 10){ //Este while es el que va a mirar numero por numero
      int aux = (int)((Math.random() * 100)+1); //genera el numero aleatorio
      compara=0; //se pone el compara a 0 para que se borre el 20
      for(int i=0; i < 10;i++){ //compara con todos los numeros del array
        if(aux == num[i]){ //comprueba el aux al numero del array
        }else{ 
          compara++;//suma cada vez que no sea igual
        } 
        if(compara == 10){//si se ha sumado 20 veces es que no hay ninguno igual
          num[metidos] = aux;//aqui escribe en el array
          metidos++;//aqui lo suma para que no lo vuelva a meter en el mismo array
        }
      }
    }
    //Poner a 105 el array ocupado
    for(int i=0;i<10;i++){
      ocupado[i]=105;
    }

    
    //Mostramos por pantalla
    System.out.println("Array Original");
    System.out.println("---------------");
    System.out.print("Indice ");
    for (int i = 1;i < 11;i++) {
      int m = i;
      System.out.printf("%4d  ", m);
    }
    System.out.println();
     System.out.println("       ╔═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╗");
    System.out.print("Valor  ");
    for (int i=0;i < 10;i++) {
      int n=num[i];
      System.out.printf("║%3d  ", n);
    }
    System.out.println("║\n       ╚═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╝");
    
    //barajamos el array comparando cada numero aleatorio del array mirando si 
    //es 105 grabara el num[i] ahí
    for(int i=0;i<10;i++){
      while (!valorAsignado){
        int indice = (int)(Math.random()*10);
        if(ocupado[indice]==105){
        ocupado[indice]=num[i];
        valorAsignado=true; 
        }
      }
      valorAsignado=false;
    }

  
   System.out.println("---------------");
      //Dibujamos el segundo array
    System.out.println("Array Barajado");
    System.out.println("---------------");
    System.out.print("Indice ");
    for (int o = 1;o < 11;o++) {
      int z = o;
      System.out.printf("%4d  ", z);
    }
    System.out.println();
     System.out.println("       ╔═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╗");
    System.out.print("Valor  ");
    for (int o=0;o < 10;o++) {
      int l=ocupado[o];
      System.out.printf("║%3d  ", l);
    }
    System.out.println("║\n       ╚═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╝");
}
}
      

