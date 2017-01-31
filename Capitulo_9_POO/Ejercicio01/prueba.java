/*
 * @uthor David Martin Perez
 */


public class prueba {
  
  public static void main (String args[]) {
    Caballo a = new Caballo("Epona", "Quarter", 120, 4);
    
    System.out.println("Hola, soy " + a.getNombre() + " soy de raza " + a.getRaza() + " tengo " + a.getEdad() + " años y peso " + a.getPeso() + "kg");
    
  }
}

