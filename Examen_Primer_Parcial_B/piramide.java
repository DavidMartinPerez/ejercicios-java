public class piramide {

  public static void main(String[] args) {
    
    
    System.out.print("altura: ");
    int n = Integer.parseInt(System.console().readLine().toLowerCase());
    int huecosActual = n-1;
    
    for (int linea=1; linea <= n; linea++){

      for (int pEspacio=1; pEspacio <= huecosActual; pEspacio++){ //pinta los espacios
        System.out.print(" ");
      }

      for (int asteriscos=1; asteriscos <= linea; asteriscos++){//esto pinta los asteriscos del principio
        System.out.print("*");
      }
      
      for (int asteVShueco= 1; asteVShueco <= 4; asteVShueco++){//este pinta los espacios del medio
        if( linea%2 == 0 ){//par
          System.out.print(" ");
        } else { //impar
          System.out.print("*");
        }
      }
      
      for(int asteriscos=1; asteriscos <= linea; asteriscos++){//este pinta los asteriscos del final
        System.out.print("*");
      }
      
        huecosActual--;
      System.out.println();
    }
  }
    
}

    //for (int i=1; i <= 6; i++){ //pinta los 6 asteriscos obligatoris
    //  System.out.print("*");
    //}
    //for (int i=0; i < n-1; i++){//con esto dara la altura
    //System.out.print(" ");
    //}
    
    //for (int i=1; i <=(n-1)+6; i++){
    //if (i <=(n-1){
    //System.out.println(" ");
    //}
    //else { System.out.println("*"); }
    //}


