/**
* Ejercicios Capitulo 7 Array Bidimensionales
* Ejercicio 7 
* 
* @uthor David Martín Pérez 
 */
public class Ejercicio07 {

  // Constantes que nunca cambian
  static final int VACIO = 0;
  static final int MINA = 1;
  static final int TESORO = 2;
  static final int INTENTO = 3;
  
  public static void main(String[] args) {
    int[][] juego = new int[5][4];

    int x;
    int y;
    
    //Creamos el array con nada dentro
    for(x = 0; x < 4; x++) {
      for(y = 0; y < 3; y++) {
        juego[x][y] = VACIO;
      }
    }
    //Creamos mina
    int minaX = (int)(Math.random()*4);
    int minaY = (int)(Math.random()*3);
    
    // Creamos el tesoro
    int tesoroX;
    int tesoroY;
    
    
    do {
      tesoroX = (int)(Math.random()*4);
      tesoroY = (int)(Math.random()*3);
    } while ((minaX == tesoroX) && (minaY == tesoroY));
    
    

  }
}
