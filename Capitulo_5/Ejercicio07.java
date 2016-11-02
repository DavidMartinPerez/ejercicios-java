/*
 * Ejercicio 7 Tema 4 
 * @uthor David Martin Peréz
 */


public class Ejercicio07 {
  
  public static void main (String args[]) {
      int clave = 1111;
      int correcta = 2424;
      
      System.out.println("#######CAJA FUERTE########");
      System.out.println("##########################");
      System.out.println("##Introduce la contraseña##");
      
    for (int i = 1; i <= 4; i++) {
      if (clave != correcta){
        clave = Integer.parseInt(System.console().readLine());
        if(clave == correcta){
        } else {
          System.out.println("###Error###");
        }
      }
    }
  if (clave == correcta){
    System.out.println("##Dentro##");
  } else {
    System.out.println("##Wiium Wiium##");
  }
 }
}
    
  

