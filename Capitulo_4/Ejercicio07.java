/*
 * Ejercicio 7 Tema 4 
 * @uthor David Martin Peréz
 */


public class Ejercicio07 {
  
  public static void main (String args[]) {
    
    System.out.print("Por favor, introduzca la primera nota: ");
    Double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Ahora introduzca la segunda nota: ");
    Double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por último introduzca la tercera nota: ");
    Double nota3 = Double.parseDouble(System.console().readLine());

    double media = (nota1 + nota2 + nota3) / 3;

    System.out.printf("La media es %.2f\n", media);
    
    if (media < 5) {
      System.out.print("Insuficiente");
    }
    
    if ((media >= 5) && (media < 6)) {
      System.out.print("Suficiente");
    }
    
    if ((media >= 6) && (media < 7)) {
      System.out.print("Bien");
    }
    
    if ((media >= 7) && (media < 9)) {
      System.out.print("Notable");
    }
    
    if (media >= 9) {
    System.out.print("Sobresaliente");
  }
 }
}
