package mates;

public class cuentas {
  
  /**
  * Devuelve verdadero si es capicua y falso si no lo es
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
  //Digitos
    public static int digitos(long x) {
    int contador = 0;
    if (x == 0) {
      contador = 1;
    } else {
      while (Math.abs(x) > 0) {
      x /= 10;
      contador++;
      }
    }
    return contador;
   }

  //digitoN
    public static int digitoN(int x, int y) {
    int contador = 0;
    int digito = 0;
    boolean salir = false;
    int numero = voltea(x);
      while ((numero > 0) && (!salir)) {
        if (contador == y) {
          digito = numero % 10;
          salir = true;
        } else {
          numero /= 10;
          contador++;
        }
      }
      return digito;
    }
    //posicionDeDigito:
    public static int posicionDeDigito(int x, int d) {
     int i;

      for (i = 0; (i < digitos(x)) && (digitoN(x, i) != d); i++) {};

        if (i == digitos(x)) {
        return -1;
        } else {
         return i;
        }
    }
    
    //quitaPorDetras
    public static long quitaPorDetras(long x, int n) {
      return x / (long)potencia(10, n);
    }
    
    //quitaPorDelante
    public static long quitaPorDelante(long x, long n) {
      x = voltea(quitaPorDetras(voltea(x), n));
      x = quitaPorDetras(x, 1);
      return x;
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
