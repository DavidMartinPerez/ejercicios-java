/**
 * Ejercicio 8 del Capitulo 7 Arrays
 * Basico Arrays
* @uthor David Martín Pérez
 */

public class Ejercicio08 {

  public static void main(String[] args) {
    double[] mes = new double[12];
    String NombreMes = "";
    double espacios = 0;
    String verde = "\033[32m";
    String blanco = "\033[37m";
    for(int i = 0; i < 12; i++){
      
      switch(i) {
        case 0:
          NombreMes = "enero";
          System.out.print(verde + "Introduzca la temperatura media de " + NombreMes + ": ");
          mes[i] = Double.parseDouble(System.console().readLine());
          break;
        case 1:
          NombreMes = "febrero";
          System.out.print("Introduzca la temperatura media de " + NombreMes + ": ");
          mes[i] = Double.parseDouble(System.console().readLine());
          break;
        case 2:
          NombreMes = "marzo";
          System.out.print("Introduzca la temperatura media de " + NombreMes + ": ");
          mes[i] = Double.parseDouble(System.console().readLine());
          break;
        case 3:
          NombreMes = "abril";
          System.out.print("Introduzca la temperatura media de " + NombreMes + ": ");
          mes[i] = Double.parseDouble(System.console().readLine());
          break;
        case 4:
          NombreMes = "mayo";
          System.out.print("Introduzca la temperatura media de " + NombreMes + ": ");
          mes[i] = Double.parseDouble(System.console().readLine());
          break;
        case 5:
          NombreMes = "junio";
          System.out.print("Introduzca la temperatura media de " + NombreMes + ": ");
          mes[i] = Double.parseDouble(System.console().readLine());
          break;
        case 6:
          NombreMes = "julio";
          System.out.print("Introduzca la temperatura media de " + NombreMes + ": ");
          mes[i] = Double.parseDouble(System.console().readLine());
          break;
        case 7:
          NombreMes = "agosto";
          System.out.print("Introduzca la temperatura media de " + NombreMes + ": ");
          mes[i] = Double.parseDouble(System.console().readLine());
          break;
        case 8:
          NombreMes = "septiembre";
          System.out.print("Introduzca la temperatura media de " + NombreMes + ": ");
          mes[i] = Double.parseDouble(System.console().readLine());
          break;
        case 9:
          NombreMes = "octubre";
          System.out.print("Introduzca la temperatura media de " + NombreMes + ": ");
          mes[i] = Double.parseDouble(System.console().readLine());
          break;
        case 10:
          NombreMes = "noviembre";
          System.out.print("Introduzca la temperatura media de " + NombreMes + ": ");
          mes[i] = Double.parseDouble(System.console().readLine());
          break;
        case 11:
          NombreMes = "diciembre";
          System.out.print("Introduzca la temperatura media de " + NombreMes + ": ");
          mes[i] = Double.parseDouble(System.console().readLine());
          break;

      }
    }
    System.out.println("------------------------------");
    
    for(int i=0; i < 12; i++){
      switch(i) {
        case 0:
          NombreMes = "enero";
          System.out.print(NombreMes + "      | ");
          espacios = mes[i];
          for(double j=espacios; espacios > 0; espacios--){
            System.out.print(verde + "▄");
          }
          System.out.println();
          break;
        case 1:
          NombreMes = "febrero";
          System.out.print(NombreMes + "    | ");
          espacios = mes[i];
          for(double j=espacios; espacios > 0; espacios--){
            System.out.print(verde + "▄");
          }
          System.out.println();
          break;
        case 2:
          NombreMes = "marzo";
          System.out.print(NombreMes + "      | ");
          espacios = mes[i];
          for(double j=espacios; espacios > 0; espacios--){
            System.out.print(verde + "▄");
          }
          System.out.println();
          break;
        case 3:
          NombreMes = "abril";
          System.out.print(NombreMes + "      | ");
          espacios = mes[i];
          for(double j=espacios; espacios > 0; espacios--){
            System.out.print(verde + "▄");
          }
          System.out.println();
          break;
        case 4:
          NombreMes = "mayo";
          System.out.print(NombreMes + "       | ");
          espacios = mes[i];
          for(double j=espacios; espacios > 0; espacios--){
            System.out.print(verde + "▄");
          }
          System.out.println();
          break;
        case 5:
          NombreMes = "junio";
          System.out.print(NombreMes + "      | ");
          espacios = mes[i];
          for(double j=espacios; espacios > 0; espacios--){
            System.out.print(verde + "▄");
          }
          System.out.println();
          break;
        case 6:
          NombreMes = "julio";
          System.out.print(NombreMes + "      | ");
          espacios = mes[i];
          for(double j=espacios; espacios > 0; espacios--){
            System.out.print(verde + "▄");
          }
          System.out.println();
          break;
        case 7:
          NombreMes = "agosto";
          System.out.print(NombreMes + "     | ");
          espacios = mes[i];
          for(double j=espacios; espacios > 0; espacios--){
            System.out.print(verde + "▄");
          }
          System.out.println();
          break;
        case 8:
          NombreMes = "septiembre";
          System.out.print(NombreMes + " | ");
          espacios = mes[i];
          for(double j=espacios; espacios > 0; espacios--){
            System.out.print(verde + "▄");
          }
          System.out.println();
          break;
        case 9:
          NombreMes = "octubre";
          System.out.print(NombreMes + "    | ");
          espacios = mes[i];
          for(double j=espacios; espacios > 0; espacios--){
            System.out.print(verde + "▄");
          }
          System.out.println();
          break;
        case 10:
          NombreMes = "noviembre";
          System.out.print(NombreMes + "  | ");
          espacios = mes[i];
          for(double j=espacios; espacios > 0; espacios--){
            System.out.print(verde + "▄");
          }
          System.out.println();
          break;
        case 11:
          NombreMes = "diciembre";
          System.out.print(NombreMes + "  | ");
          espacios = mes[i];
          for(double j=espacios; espacios > 0; espacios--){
            System.out.print(verde + "▄" + blanco);
          }
          System.out.println();
          break;

      }
    }
  }
}
