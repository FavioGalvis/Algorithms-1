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

/**
 * Programa de desarrollo de examen parcial 1 - Primer Corte
 * Algoritmos y Programacion 2 - Ing. Yashin Rueda
 * Alumno: Favio Arturo Galvis - Cod. 201521268405
 * @date 03/03/2016
 * @author 201521268405
 */
public class II_Practica_E {
    
    public static double[][] f_read_matrix( int a, int b ){
        //Leer una matriz
        double[][] matrix = new double[a][b];
        Scanner n = new Scanner(System.in);
        System.out.println ("Ingrese los valores de la matriz m(filas)*n(columnas): \n");// TODO code application logic here
        for ( int i=0; i<a ; i++ ) {
            for ( int j=0; j<b ; j++ ) {
                System.out.println ("Valor Posicion (" + i + "," + j + "): ");
                matrix[i][j] = n.nextDouble();
            }
        }
        return matrix;
    }
    public static void f_print_matrix ( double[][] matrix ){
        //Imprimir una matriz
        for ( int i=0; i<matrix.length ; i++ ) {
            System.out.print ("| ");
            for ( int j=0; j<matrix[0].length; j++ ) {
                System.out.print ( matrix[i][j] + " " );
            }
            System.out.print ("|\n");
        }
    }
    public static double[] f_search_minor ( double[][] matrix ){
        //Busqueda de valor menor
        double[] minor = new double[3];
        minor[0] = matrix[0][0];
        for ( int i=0; i<matrix.length ; i++ ) {
            for ( int j=0; j<matrix[0].length; j++ ) {
                if ( matrix[i][j] <= minor[0] ) {
                    minor[0] = matrix[i][j];
                    minor[1] = i;
                    minor[2] = j;
                }
            }
        }
        return minor;
    }
    public static double[] f_search_mayor ( double[][] matrix ){
        //Busqueda de valor mayor
        double[] mayor= new double[3];
        mayor[0] = 0;
        for ( int i=0; i<matrix.length ; i++ ) {
            for ( int j=0; j<matrix[0].length; j++ ) {
                if ( matrix[i][j] >= mayor[0] ) {
                    mayor[0] = matrix[i][j];
                    mayor[1] = i;
                    mayor[2] = j;
                }
            }
        }
        return mayor;
    }
    public static void f_exchange( double[][] matrixA,  double[][] matrixB, double[] minor, double[] mayor ){
        double[][] copy_matrixA = matrixA;
        double[][] copy_matrixB = matrixB;
        //Intercambio de valor mayor a nueva matriz M
        copy_matrixA[(int)minor[1]][(int)minor[2]] = mayor[0];
        //Intercambio de valor menor a nueva matriz N
        copy_matrixB[(int)mayor[1]][(int)mayor[2]] = minor[0];
        //Impresion de las Nuevas Matrices
        System.out.println ("Su nueva matriz M es: \n");
        f_print_matrix( copy_matrixA );
        System.out.println ("Su nueva matriz N es: \n");
        f_print_matrix( copy_matrixB );
    }
    
    public static void f_fibonacci ( double a ){
        //Serie de Fibonacci
        double x = 0;
        double y = 1;
        System.out.printf ("Serie de fibonacci para " + a + "numeros:\n");
        System.out.printf (x + ",");
        for ( int i=1 ; i<=a ; i++ ) {
            System.out.printf (" " + y + ",");
            y = x + y;
            x = y - x;
        }
        System.out.printf ("\n >> Fin\n");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Programa principal de menu de opciones
        int opcion = 0;
        double f;
        int x,y;
        Scanner n = new Scanner(System.in);
        Scanner pauser = new Scanner (System.in);
        while ( opcion != 3 ) {
            String newline = System.lineSeparator();
            System.out.printf ("--------------------------------\n");
            System.out.printf ("-- Primer Parcial- 03/03/2016 --\n");
            System.out.printf ("-- Almuno: Favio Galvis       --\n");
            System.out.printf ("-- Profesor:Yashin Rueda      --\n");
            System.out.printf ("--------------------------------\n");
            System.out.printf ("Calculos con Matrices y Serie de Fibonacci.\n");
            System.out.printf ("1. Matrices\n");
            System.out.printf ("2. Metodos\n");
            System.out.printf ("3. Salir\n");
            Scanner valor = new Scanner(System.in);
            opcion = valor.nextInt();
            switch (opcion) {
                case 1: {
                    //Lectura de los tamaños de las matrices M y N
                    System.out.println ("Ingresar tamaño de la matrix M(mxn), donde m(filas), n(columnas):\n");// TODO code application logic here
                    System.out.println ("m: ");
                    x = n.nextInt();
                    System.out.println ("n: ");
                    y = n.nextInt();
                    double[][] matrixM = f_read_matrix(x,y);
                    System.out.println ("Su matriz es: \n");
                    f_print_matrix( matrixM );
                    System.out.println ("Ingresar tamaño de la matrix N(mxn), donde m(filas), n(columnas):\n");// TODO code application logic here
                    System.out.println ("m: ");
                    x = n.nextInt();
                    System.out.println ("n: ");
                    y = n.nextInt();
                    double[][] matrixN = f_read_matrix(x,y);
                    System.out.println ("Su matriz es: \n");
                    f_print_matrix( matrixN );
                    double[] minor = f_search_minor(matrixM);
                    double[] mayor = f_search_mayor(matrixN);
                    System.out.println ("El menor de la matriz M es: " + minor[0] + ", Posicion ("+(minor[1]+1)+","+(minor[2]+1)+")\n" );
                    System.out.println ("El mayor de la matriz N es: " + mayor[0] + ", Posicion ("+(mayor[1]+1)+","+(mayor[2]+1)+")\n" );
                    System.out.println ("Se procede al intercambio de valores y se imprimen las nuevas matrices:\n" );
                    f_exchange(matrixM, matrixN, minor, mayor);
                } break;
                case 2: {
                    //Lectura de variable n para serie de fibonacci
                    System.out.println ("Ingrese el numero a calcular la serie: ");// TODO code application logic here
                    f = n.nextDouble();
                    f_fibonacci(f);
                } break;
                case 3: {
                    //Salida de Programa
                    System.out.println ("Gracias!");// TODO code application logic here
                }
            }
            System.out.println("\nPresione enter para continuar...\n");
            pauser.nextLine();
        }
    }
}