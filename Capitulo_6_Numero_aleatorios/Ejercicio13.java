/**
 * Ejercicio 13 del Capitulo 6
 * Tirada de dados ⚀ ⚁ ⚂ ⚃ ⚄ ⚅
* @uthor David Martín Pérez
 */

public class Ejercicio13 {

  public static void main(String[] args) {
    int prueba = 0;
    for(int i=1; prueba < 1; i++){

      int dado1 = (int)((Math.random() * 6)+1);
      
      switch(dado1){
        case 1: 
          System.out.print("⚀ ");
          break;
        case 2: 
          System.out.print("⚁ ");
          break;
        case 3:
          System.out.print("⚂ ");
          break;
        case 4: 
          System.out.print("⚃ ");
          break;
        case 5:
          System.out.print("⚄ ");
          break;
        case 6:
          System.out.print("⚅ ");
          break;
      }
      
      int dado2 = (int)((Math.random() * 6)+ 1);

      switch(dado2) {
        case 1: 
          System.out.println("⚀");
          break;
        case 2: 
          System.out.println("⚁");
          break;
        case 3:
          System.out.println("⚂");
          break;
        case 4: 
          System.out.println("⚃");
          break;
        case 5:
          System.out.println("⚄");
          break;
        case 6:
          System.out.println("⚅");
          break;
      }
      if (dado1 == dado2){
        prueba++;
      }
      
    }
  }
}

