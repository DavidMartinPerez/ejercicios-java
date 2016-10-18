/*
 * Ejercicio 12 Tema 4 
 * @uthor David Martin Peréz
 */


public class Ejercicio12 {
  
  public static void main (String args[]) {
    int puntos = 0;
    String respuesta;
    
    System.out.println("MINICUESTIONARIO DE 1º DAW");
    
    System.out.println("1. ¿Cuántas horas de clases tenemos a la semana?");
    System.out.println("----------------------------------------------------");
    System.out.println("a) 25\nb) 30\nc) 35"); 
    System.out.print("Su respuesta: ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    System.out.println(" ");
    System.out.println("****************************************************************** ");
    System.out.println("2. ¿Qué es mejor un microprocesador dualcore@1ghz o monocore@2ghz");
    System.out.println("a) El monocore\nb) El dualcore\nc) Son iguales"); 
    System.out.print("Su respuesta: ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    System.out.println(" ");
    System.out.println("****************************************************************** ");
    System.out.println("3. En HTML, ¿cómo se pone una imagen?");
    System.out.println("a) img a\nb) img src\nc) img link"); 
    System.out.print("Su respuesta: ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    System.out.println(" ");
    System.out.println("****************************************************************** ");    
    System.out.println("4. ¿En qué directorio se encuentran los archivos de configuración de Linux?");
    System.out.println("a) /etc\nb) /config\nc) /cfg"); 
    System.out.print("Su respuesta: ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println(" ");
    System.out.println("****************************************************************** ");     
    System.out.println("5. ");
    System.out.println("a) \nb) \nc) "); 
    System.out.print("Su respuesta:  ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("c")) {
      puntos++;
    }
    
    System.out.println(" ");
    System.out.println("****************************************************************** ");     
    System.out.println("6. ");
    System.out.println("a) \nb) \nc) "); 
    System.out.print("Su respuesta:  ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("c")) {
      puntos++;
    }
    
    System.out.println(" ");
    System.out.println("****************************************************************** ");     
    System.out.println("7. ");
    System.out.println("a) \nb) \nc) "); 
    System.out.print("Su respuesta:  ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("c")) {
      puntos++;
    }
    
    System.out.println(" ");
    System.out.println("****************************************************************** ");     
    System.out.println("8. ");
    System.out.println("a) \nb) \nc) "); 
    System.out.print("Su respuesta:  ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("c")) {
      puntos++;
    }
    
    System.out.println(" ");
    System.out.println("****************************************************************** ");     
    System.out.println("9. ");
    System.out.println("a) \nb) \nc) "); 
    System.out.print("Su respuesta:  ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("c")) {
      puntos++;
    }
    
    System.out.println(" ");
    System.out.println("****************************************************************** ");     
    System.out.println("10. ");
    System.out.println("a) \nb) \nc) "); 
    System.out.print("Su respuesta:  ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("c")) {
      puntos++;
    }
    
    if (puntos < 3) {
      System.out.println("\nHaz respondido bien solo" + puntos);
      System.out.println("\nAtiende en clase anda...");
    }  else if ((puntos >= 4) && (puntos < 5)) {
      System.out.println("\nHaz respondido bien a... " + puntos + " xDD");
      System.out.println("\nIllo ponte las pilas.");
    } else if ((puntos >= 5) && (puntos < 6)) {
      System.out.println("\nHaz acertado " + puntos);
      System.out.println("\nA ver mal no está...");
    } else if ((puntos >= 6) && (puntos <= 8)) {
      System.out.println("\nHaz acertado " + puntos);
      System.out.println("\nMuy biiiiieeeeen.");
    } else if ((puntos >= 9) && (puntos <= 10)) {
      System.out.println("\nSu puntuación es de: " + puntos);
      System.out.println("\nMaravilloso, así me gusta. No cambies");
}
    }
  }


