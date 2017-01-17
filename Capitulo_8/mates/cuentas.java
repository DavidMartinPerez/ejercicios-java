package mates;

public class cuentas {
  
  /**
  * Devuelve verdadero si el número que se pasa como parámetro es capicúa y
    falso en caso contrario.
  * <p>
  * Un número capicúa es el que se lee igual de izquierda a derecha que de
  * derecha a izquierda.
  * 
  * @param x número del que se quiere saber si es capicúa
  * @return  devuelve verdadero o falso, si es capicua o no.
   */
   //esCapicua
  public static boolean esCapicua(int x){
    return x == voltea(x);
  }
  //esPrimo
  public static boolean esPrimo(int x) {
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    return true;
  }
  //siguientePrimo
  public static int siguientePrimo(int x) {
     while (!esPrimo(++x)) {};

    return x;
  }
  //esPotencia 
    public static double potencia(int base, int exponente) {
    if (exponente == 0) {
      return 1;
    }

    if (exponente < 0) {
      return 1/potencia(base, -exponente);
    }

    int n = 1;

    for (int i = 0; i < Math.abs(exponente); i++) {
      n = n * base;
    }

    return n;
  }
  
  //########### OPERACIONES ##########
  /**
  * Le da la vuelta a un numero
  * @param x un número entero
  * @return el número al reves
  */
  //Voltea
    public static int voltea(int x) {
      int numeroReves = 0;
      while (x > 0) {
        numeroReves = (numeroReves * 10) + (x % 10);
        x /= 10;
      }
      return numeroReves;
    }

  





}
