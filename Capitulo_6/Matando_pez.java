/**
 * Ejercicio 17 del Capitulo 6
 * números aleatorios
* @uthor David Martín Pérez
 */

public class Ejercicio17v2 {
  public static void main(String[] args) {
    int ancho = 4;
    int alto = 4;
    int x = 0;
    int y = 0;
    System.out.print("introduzca la altura: ");
    alto = Integer.parseInt(System.console().readLine());
    System.out.print("introduce el ancho: ");
    ancho = Integer.parseInt(System.console().readLine());
    
    int irandom = ((int)(Math.random() * (ancho-2) + 1));
    int jrandom = ((int)(Math.random() * (alto-2) + 1));
    
    System.out.print("Di una X: ");
    x = Integer.parseInt(System.console().readLine());
    System.out.print("Di una Y: ");
    y = Integer.parseInt(System.console().readLine());
    
    
    int pez = (irandom + jrandom);
    int bala = ((x+1)+y);
    
    int muerte = (pez / bala);
    
    
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
            if(muerte == 0){
            System.out.print("x");
          } else {
            System.out.print("&");
          }
          } else {
            System.out.print(" ");
          }
          
        }
        System.out.println();
      }
      
    }
    if (muerte == 0){
      System.out.println("¡Has ganado!");
    } else {
      System.out.println("Perdiste..");
    }
  }
}
