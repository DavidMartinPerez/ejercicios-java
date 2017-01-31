/**
 * ¡Un arbol navidaaad!
 * Cima tiene que ser *
 * Random 1/3 los adornos
 * 
 * Numero aleatorio
* @uthor David Martín Pérez 
 */

public class Arbol {

  public static void main(String[] args) {
    System.out.print("Introduce altura del arbol: ");
    int altura =Integer.parseInt(System.console().readLine());
    int espacios= altura-2;
    int linea = 0;
    int aleatorio = 0;
    String caracter = "";
    String verde = "\033[32m";
    String blanco = "\033[37m";
    String rojo = "\033[31m";
    String amarillo = "\033[29m";
    //pintamos la cima
    while(espacios+1 > 0){ //pinta la primera estrella
      System.out.print(" ");
      espacios--;
    }
    espacios= altura-1;
    System.out.println(amarillo + "*" + blanco);
    
    //empezamos a pintar el arbol
    for(int i = altura;i > 0; i--){ //pìnta el arbol
      
      for(int j=0; j<espacios; j++){
        System.out.print(" ");
      }
      
      for(int k=0; k < (linea*2)+1; k++){
        aleatorio = ((int)(Math.random() * 9 + 1));
          switch(aleatorio){
            case 1: 
              caracter = verde + "^" + blanco;
              break;
            case 2: 
              caracter = verde + "^" + blanco;
              break;
            case 3: 
              caracter = verde + "^" + blanco;
              break;
            case 4: 
              caracter = verde + "^" + blanco;
              break;
            case 5: 
              caracter = verde + "^" + blanco;
              break;
            case 6: 
              caracter = verde + "^" + blanco;
              break;
            case 7: 
              caracter = rojo + "o" + blanco;
              break;
            case 8: 
              caracter = rojo + "o" + blanco;
              break;
            case 9: 
              caracter = amarillo + "*" + blanco;
              break;
            }
        System.out.print(caracter);
      }
      espacios--;
      linea++;
      System.out.println();
    }
  }
}

    
