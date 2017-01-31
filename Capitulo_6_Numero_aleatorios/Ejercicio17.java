/**
 * Ejercicio 17 del Capitulo 6
 * números aleatorios
* @uthor David Martín Pérez
 */

public class Ejercicio17 {
  public static void main(String[] args) {
    int ancho = 4;
    int alto = 4;

    System.out.print("introduzca la altura: ");
    alto = Integer.parseInt(System.console().readLine());
    System.out.print("introduce el ancho: ");
    ancho = Integer.parseInt(System.console().readLine());
    
    int irandom = ((int)(Math.random() * (ancho-2) + 1));
    int jrandom = ((int)(Math.random() * (alto-2) + 1));

    if ( ancho < 4 ){
      ancho = 4;
    }else if(alto < 4 ) {
      alto = 4;
    } else {
     
      for(int i=0; i < alto; i++){ //filas
        
        
        for(int j=0; j < ancho; j++){//columnas
          if (i==0 | i==(alto-1) | j==0 | j==(ancho-1)){
            System.out.print("*");
          } else if (i==irandom & j==jrandom) {
            System.out.print("&");
          } else {
            System.out.print(" ");
          }
          
        }
        System.out.println();
      }
      
    }

  }
}
