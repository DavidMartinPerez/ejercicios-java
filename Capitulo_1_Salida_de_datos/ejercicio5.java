/**
 * ejercicio 4
 */

public class ejercicio5 {
  public static void main(String[] args) {

    String azul = "\033[34m";
    String naranja = "\033[33m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    String verde = "\033[32m";
    String celeste = "\033[36m";
    String rojo = "\033[31m";

    System.out.println(celeste + "\tLunes\tMartes\tMiérc.\tJueves\tViernes");
    System.out.println(blanco + "--------------------------------------------------");
    System.out.println(azul + "\tS.INF" + morado + "\tPROG\tPROG" + naranja + "\tB.D." + verde + "\tL.M.");
    System.out.println(azul + "\tS.INF" + morado + "\tPROG\tPROG" + naranja + "\tB.D." + verde + "\tL.M.");
    System.out.println(azul + "\tS.INF" + morado + "\tPROG" + verde + "\tL.M." + naranja + "\tB.D." + rojo +" \tE.D.");
    System.out.println(celeste + "\tR\tE\tCR\tE\tO");
    System.out.println(blanco + "\tFOL" + naranja + "\tB.D." + verde + "\tL.M." + morado + "\tPROG" + azul + "\tS.INF");
    System.out.println(blanco + "\tFOL" + naranja + "\tB.D."+ rojo + "\tED" + morado + "\tPROG" + azul + "\tS.INF");
    System.out.println(blanco + "\tFOL" + naranja + "\tB.D." + rojo + "\tED" + morado + "\tPROG" + azul + "\tS.INF");
  }
}
