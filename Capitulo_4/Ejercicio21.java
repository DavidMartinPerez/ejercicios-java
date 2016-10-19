/*
 * Ejercicio 21 Tema 4 
 * @uthor David Martin Peréz
 */



public class Ejercicio21 {
  
  public static void main (String args[]) {
    System.out.println("Con este programa haremos tu media de Programacion");
    System.out.print("Nota del primer examen: ");
    double exam1 = Double.parseDouble(System.console().readLine());

    System.out.print("Nota del segundo examen: ");
    double exam2 = Double.parseDouble(System.console().readLine());
    
    double media = (exam1 + exam2) / 2;
    
    if (media < 5) {
      System.out.print("¿Haz aprobado la recuperación? (S / n): ");
      String recuperacion = System.console().readLine().toLowerCase();
      if (recuperacion.equals("s")) {
        media = 5;
      }
    }
    
System.out.print("Tu media es " + media);
  }
}

