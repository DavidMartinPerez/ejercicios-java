/*
 * Ejercicio 15 Tema 4 
 * @uthor David Martin Peréz
 */


public class Ejercicio15 {
  
  public static void main (String args[]) {
    System.out.println("Este programa pinta una pirámide.");
    System.out.println("Tipo de pirámide");
    System.out.println("1) Con el vértice hacia arriba");
    System.out.println("2) Con el vértice hacia abajo");
    System.out.println("3) Con el vértice a la izquierda");
    System.out.println("4) Con el vértice a la derecha");
    System.out.print("¿Cómo la deseas?: ");
    int opcion = Integer.parseInt(System.console().readLine());

    switch(opcion) {
      case 1:
        System.out.print("Introduzca un carácter para su composición: ");
        String caracter = System.console().readLine();
        System.out.println("  " + caracter);
        System.out.println(" " + caracter + caracter + caracter);
        System.out.println(caracter + caracter + caracter + caracter + caracter);
        break;
      case 2:
        System.out.print("Introduzca un carácter para su composición: ");
        String caracter1 = System.console().readLine();
        System.out.println(caracter1 + caracter1 + caracter1 + caracter1 + caracter1);
        System.out.println(" " + caracter1 + caracter1 + caracter1);
        System.out.println("  " + caracter1);
        break;
      case 3:
        System.out.print("Introduzca un carácter para su composición: ");
        String caracter2 = System.console().readLine();
        System.out.println("    " + caracter2);
        System.out.println("  " + caracter2 + " " + caracter2);
        System.out.println(caracter2 + " " + caracter2 + " " + caracter2);
        System.out.println("  " + caracter2 + " " + caracter2);
        System.out.println("    " + caracter2);
        break;
      case 4:
        System.out.print("Introduzca un carácter para su composición: ");
        String caracter3 = System.console().readLine();
        System.out.println(caracter3);
        System.out.println(caracter3 + " " + caracter3);
        System.out.println(caracter3 + " " + caracter3 + " " + caracter3);
        System.out.println(caracter3 + " " + caracter3);
        System.out.println(caracter3);
        break;
      default:
        System.out.println("Por favor, un número del 1 al 4");
    }
  }
}
