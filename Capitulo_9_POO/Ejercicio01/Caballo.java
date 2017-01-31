public class Caballo {
  private String nombre;
  private String raza;
  private double peso;
  private int edad;
  
  Caballo (String n, String r, double p, int e) {
  this.nombre = n;
  this.raza = r;
  this.peso = p;
  this.edad = e;
  }
  
  public String getNombre() {
    return this.nombre;
  }
  
  public double getPeso(){
    return this.peso;
  }
  
  public int getEdad(){
    return this.edad;
  }
  
  public String getRaza(){
    return this.raza;
  }
  
  public void cabalga(){
    System.out.println("Chucuchu chucuchu chucuchu ");
  }
  
  public void reir(){
    System.out.println("jijijijijijijij");
  }
  
  public void relincha(){
    System.out.println("Hiiiiiiiiiiiiijjj");
  }
  public void cumpleaños(){
    System.out.println("El caballo " + this.nombre + " ha cumplido " + (this.edad + 1) + " años.");
  }

}

