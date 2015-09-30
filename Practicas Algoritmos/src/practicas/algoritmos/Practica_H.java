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
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author 201521268405
 */
public class Practica_H {
    /**
     * @param args the command line arguments
     * Clase determinar las raices cuadraticas de una equiacion
     * Usa whiles para hacer la serie
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] My_roots = new double[2];
        double My_coef_a=0,My_coef_b=0,My_coef_c=0;
        int My_select=0;
        boolean My_verify=false;
        System.out.printf ("----------------------------\n");
        System.out.printf ("-- Programa de Practicas. --\n");
        System.out.printf ("-- Almuno: Favio Galvis   --\n");
        System.out.printf ("-- Profesor: Juan Rua     --\n");
        System.out.printf ("----------------------------\n");
        System.out.printf ("Programa para calcular Raices Cuadraticas\n");
        System.out.printf ("Se leeran los coeficientes de la funcion y\n");
        System.out.printf ("se verificara si son coeficientes validos.\n");
        System.out.printf ("Se ejecutan las operaciones en 2 metodos distintos\n");
        System.out.printf ("y se muestran las raices resultantes.\n");
        do {
            System.out.printf ("-----------------------\n");
            System.out.printf ("OPCIONES DEL MENU\n");
            System.out.printf ("1. Ejecutar el programa\n");
            System.out.printf ("2. Salir\n");
            Scanner My_read = new Scanner ( System.in );
            My_select = My_read.nextInt();
            if ( My_select == 1 ){
                do {
                    System.out.printf ("Ingrese los Coeficientes o ingrese '0' para salir\n");
                    System.out.printf ("Ingrese el Coeficiente A:\n");
                    My_coef_a = My_read.nextDouble();
                    if ( My_coef_a != 0 ){
                        System.out.printf ("Ingrese el Coeficiente B:\n");
                        My_coef_b = My_read.nextDouble();
                        System.out.printf ("Ingrese el Coeficiente C:\n");
                        My_coef_c = My_read.nextDouble();
                        My_verify = Myf_verification ( My_coef_a, My_coef_b, My_coef_c );
                    }
                } while ( My_verify==true );
                if ( My_coef_a != 0){
                    My_roots = Myf_roots_operation( My_coef_a, My_coef_b, My_coef_c );
                    System.out.printf ("Calculo de las raices completado\n");
                    System.out.printf ("Raiz X1: "+My_roots[0]+"\n");
                    System.out.printf ("Raiz X1: "+My_roots[1]+"\n");
                }
            }
        } while ( My_select != 2 );
    }
    
    /**
     * @param double a, double b, double c
     * Metodo de verificacion si la ecuacion tiene raices reales
     * Usa whiles para hacer la serie
     * @return false; si tiene solucion real 
     */
    public static boolean Myf_verification ( double a, double b, double c ) {
        if ( ((Math.exp(b)-(4*a*c))>=0) && (a!=0) ){
            return false;
        } else {
            System.out.printf ("Los coeficientes quer ingreso no tienen\n");
            System.out.printf ("Solucion real.\n");
            System.out.printf ("Error de ecuacion #101\n");
            return true;
        }
    }
    
    /**
     * @param double a, double b, double c
     * Metodo de ejecucion para hallar las raices
     * Usa whiles para hacer la serie
     * @return array double My_roots
     */
    public static double[] Myf_roots_operation ( double a, double b, double c ) {
        double[] My_roots = new double[2];
        My_roots[0] = ((b*(-1))-(Math.sqrt((Math.exp(b))-(4*a*c))));
        My_roots[1] = ((b*(-1))-(Math.sqrt((Math.exp(b))-(4*a*c))));
        return My_roots;
    }
}
=======

import java.util.Scanner;

/**
 *
 * @author FavioGalvis
 */
public class Practica_H {
    
    /**
     * @param args the command line arguments
     * Clase muestra todos los numeros que componen a un valor leido
     * Un numero por linea
     * Usa for para guardar la cadena de caracteres
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner ( System.in );
        int num=0;
        System.out.println ( "Ingrese el numero a evaluar: " );
        num = read.nextInt();
        String resultado = "";
        for ( int n=1; n<=num; n++ ){
            resultado = resultado + String.valueOf(n);
            resultado = resultado + "\n";
        }
        System.out.println( "Resultado:" );
        System.out.println( resultado );
        int sum = (( num * ( num + 1 ) ) / 2 );
        System.out.println( "Resultado de la suma: " + sum );
        
        Scanner pauser = new Scanner (System.in);
        System.out.println("Presione enter para continuar...");
        pauser.nextLine();
    }
    
}
