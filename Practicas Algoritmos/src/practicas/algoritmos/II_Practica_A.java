/*
 * Copyright (C) 2015 FGALVIS
 * Copyright (C) 2015 Favio Galvis Gamboa - 201521268405
 * Copyright (C) 2015 Universidad Simon Bolivar
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package practicas.algoritmos;

/**
 *
 * @author FGALVIS
 */
import java.util.Scanner;
import java.util.Calendar;

/**
 *
 * @author 201521268405
 */
public class II_Practica_A {
    
    public static double f_area_triangulo ( double a, double b ){
        double area;
        area = (a*b)/2;
        return area;
    }
    public static double f_area_circulo ( double r ){
        double area;
        area = (r*r)*Math.PI;
        return area;
    }
    public static double f_area_cuadrado ( double a ){
        double area;
        area = a*a;
        return area;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //objeto para nueva linea distinto a /n
        int opcion = 0;
        double area,x,y,r,l;
        Scanner n = new Scanner(System.in);
        while ( opcion != 4 ) {
            String newline = System.lineSeparator();
            System.out.printf ("----------------------------\n");
            System.out.printf ("-- Programa de Practicas. --\n");
            System.out.printf ("-- Almuno: Favio Galvis   --\n");
            System.out.printf ("-- Profesor:Yashin Rueda  --\n");
            System.out.printf ("----------------------------\n");
            System.out.printf ("Seleccione la opcion a ejecutar.\n");
            System.out.printf ("1. Calculo del Area de un Triangulo\n");
            System.out.printf ("2. Calculo del Area de un Circulo\n");
            System.out.printf ("3. Calculo del Area de un Cuadrado\n");
            System.out.printf ("4. Salir\n");
            
            Scanner valor = new Scanner(System.in);
            opcion = valor.nextInt();
            switch (opcion) {

                case 1: {
                    //Prueba de impresion y uso de scanner

                    System.out.println ("Ingrese la base del triangulo: ");// TODO code application logic here
                    x = n.nextDouble();
                    System.out.println ("Ingrese la altura del triangulo: ");
                    y = n.nextDouble();
                    area = f_area_triangulo(x,y);
                    System.out.println ("El area del triangulo es: " + area );
                    System.out.println(newline);

                    //n.close();
                } break;
                case 2: {
                    //Prueba de delimitadores en Scanner

                    System.out.println ("Ingrese el radio del circulo: ");// TODO code application logic here
                    r = n.nextDouble();
                    area = f_area_circulo(r);
                    System.out.println ("El area del circulo es: " + area );
                    System.out.println(newline);
                    //s.close();
                } break;
                case 3: {
                    //Prueba de operaciones con numeros y valores tipo double

                    System.out.println ("Ingrese el lado del cuadrado: ");// TODO code application logic here
                    l = n.nextDouble();
                    area = f_area_cuadrado(l);
                    System.out.println ("El area del circulo es: " + area );
                    System.out.println(newline);

                    //numeros.close();
                } break;
                case 4: {        
                    System.out.println ("Gracias!");// TODO code application logic here
                    System.out.println(newline);

                }
            }
            Scanner pauser = new Scanner (System.in);
            System.out.println("\nPresione enter para continuar...\n");
            pauser.nextLine();
        
        }
        
    }

}