/*
 * Ejercicio 12 tema 3 por David Martin Perez
 */


public class Ejercicio12 {
  
  public static void main (String args[]) {
    
    //Pedir datos
    System.out.print("Su nota en el primer examen: ");
    double notaPrimer = Double.parseDouble(System.console().readLine());

    System.out.print("¿Qué nota que deseas sacar en el trimestre? ");
    double notaTotal = Double.parseDouble(System.console().readLine());
    
    // formula notaTotal = (notaPrimer * 40) + ( x * 60) / 100
    // ecuacion x = (notaTotal * 100) - (notaPrimer * 40) / 60
    
    double x = ((notaTotal * 100) - (notaPrimer * 40)) / 60;
    
    System.out.println("Para sacar un " + notaTotal + " en el trimestre deberas sacar un " + x + " en el segundo examen");
    
  }
}

