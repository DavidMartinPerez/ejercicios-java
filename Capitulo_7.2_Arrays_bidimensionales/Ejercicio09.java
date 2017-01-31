/**
* Ejercicios Capitulo 7 Array Bidimensionales
* Ejercicio 9 
* 
* @uthor David Martín Pérez 
 */

public class Ejercicio09 {

  public static void main(String[] args) {
 
    int[][] n = new int[12][12];
    int capa=0;
    int i=0;
    int j=0;
    int aux1=0;
    int aux2=0;


    //El array normal
    System.out.println("Array original");
    System.out.println("--------------");

    for(i = 0; i < 12; i++) {
      for(j = 0; j < 12; j++) {
        n[i][j] = (int)(Math.random()*101);
        System.out.printf("%5d", n[i][j]);
        }
      System.out.println();
    }


    //Darle la vuelta
    for(capa = 0; capa < 6; capa++) {
      
      // arriba
      aux1 = n[capa][11 - capa];
      for (i = 11 - capa; i > capa; i--) {
        n[capa][i] = n[capa][i - 1];
      }
        
      // derecha      
      aux2 = n[11 - capa][11 - capa];
      for (i = 11 - capa; i > capa + 1; i--) {
        n[i][11 - capa] = n[i - 1][11 - capa];
      }
      n[capa + 1][11 - capa] = aux1;
      
      // abajo
      aux1 = n[11 - capa][capa];
      for (i = capa; i < 11 - capa - 1; i++) {
        n[11 - capa][i] = n[11 - capa][i + 1];
      }
      n[11 - capa][11 - capa - 1] = aux2;
        
      //izquierda
      for (i = capa; i < 11 - capa - 1; i++) {
        n[i][capa] = n[i + 1][capa];
      }
      n[11 - capa - 1][capa] = aux1;

    } // for capa


    // Se muestra el array girado
    
    System.out.println("");
    System.out.println("");

    System.out.println("Array rotado en el sentido de las agujas del reloj");
    System.out.println("--------------------------------------------------");

    for(i = 0; i < 12; i++) {
      for(j = 0; j < 12; j++) {
        System.out.printf("%5d", n[i][j]);
      }
      System.out.println();
    }
    
  }
}
