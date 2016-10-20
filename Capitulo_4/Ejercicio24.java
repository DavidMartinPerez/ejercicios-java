/*
 * Ejercicio24.java
 * 
 * Copyright 2016 david <alumno@david-Toshiba>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class Ejercicio24 {
  
  public static void main (String args[]) {
    System.out.println("1 - Programador junior");
    System.out.println("2 - Prog. senior");
    System.out.println("3 - Jefe de proyecto");
    System.out.print("Introduzca el cargo del empleado (1 - 3): ");
    int cargo = Integer.parseInt(System.console().readLine());
    
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
    int diasVisita = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
    int estadoCivil = Integer.parseInt(System.console().readLine());

    double sueldoBase = 0;

    switch(cargo) {
      case 1: 
        sueldoBase = 950;
        break;
      case 2: 
        sueldoBase = 1200;
        break;
      case 3: 
        sueldoBase = 1600;
        break;
      default:
        System.out.println("No ha elegido correctamente el sueldo base.");
    }

    double sueldoDietas = diasVisita * 30;

    double sueldoBruto = sueldoBase + sueldoDietas;

    double irpf = 0;

    if (estadoCivil == 1) { 
      irpf = 25;
    } else if (estadoCivil == 2) { 
      irpf = 20;
    } else {
      System.out.println("No ha elegido correctamente el estado civil.");
    }

    System.out.println("------------------------------------");
    System.out.printf("| Sueldo base            %7.2f |\n", sueldoBase);
    System.out.printf("| Dietas (%2d viajes)     %7.2f |\n", diasVisita, sueldoDietas);
    System.out.println("-----------------------------------");
    System.out.printf("| Sueldo bruto           %7.2f ┃\n", sueldoBruto);
    System.out.printf("| Retención IRPF (%.0f%%)   %7.2f |\n", irpf, (sueldoBruto * irpf) / 100);
    System.out.println("|--------------------------------|");
    System.out.printf("| Sueldo neto            %7.2f |\n", sueldoBruto - irpf);
    System.out.println("|--------------------------------|");    
  }
}

