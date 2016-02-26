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
public class II_Practica_D {
    
    public static double[][] f_read_matrix( int a, int b ){
        double[][] matrix = new double[a][b];
        Scanner n = new Scanner(System.in);
        System.out.println ("Ingrese los valores de la matriz: \n");// TODO code application logic here
        for ( int i=0; i<a ; i++ ) {
            for ( int j=0; j<b ; j++ ) {
                System.out.println ("Valor Posicion (" + i + "," + j + "): ");
                matrix[i][j] = n.nextDouble();
            }
        }
        return matrix;
    }
    public static void f_print_matrix ( double[][] matrix ){
        System.out.println ("Matriz: \n");// TODO code application logic here
        for ( int i=0; i<matrix.length ; i++ ) {
            System.out.print ("| ");
            for ( int j=0; j<matrix[0].length; j++ ) {
                System.out.print ( matrix[i][j] + " " );
            }
            System.out.print ("|\n");
        }
    }
    public static double[] f_search_minor ( double[][] matrix ){
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
    public static double[][] f_exchange( double[][] matrix ){
        double[][] copy_matrix = matrix;
        double[] a= new double[copy_matrix[0].length];
        double[] b= new double[copy_matrix[(copy_matrix.length-1)].length];
        for ( int i=0; i<copy_matrix.length ; i++ ) {
            for ( int j=0; j<copy_matrix[0].length; j++ ) {
                if ( j==0 ){
                    a[i] = copy_matrix[i][j];
                } else if ( j==(copy_matrix[0].length-1) ) {
                    b[i] = copy_matrix[i][j];
                }
            }
            for ( int j=0; j<copy_matrix[0].length; j++ ) {
                if ( j==0 ){
                    copy_matrix[i][j] = b[i];
                } else if ( j==(copy_matrix[0].length-1) ) {
                    copy_matrix[i][j] = a[i];
                }
            }
        }
        return copy_matrix;
    }
    
    public static double[] f_sum_rows( double[][] matrix ){
        double[][] copy_matrix = matrix;
        double[] a= new double[copy_matrix[0].length];
        for ( int j=0; j<copy_matrix.length ; j++ ) {
            for ( int i=0; i<copy_matrix[0].length; i++ ) {
                a[j] = a[j]+copy_matrix[i][j];
            }
        }
        return a;
    }
    
    public static double[] f_sum_cols( double[][] matrix ){
        double[][] copy_matrix = matrix;
        double[] b= new double[copy_matrix.length];
        for ( int i=0; i<copy_matrix.length ; i++ ) {
            for ( int j=0; j<copy_matrix[0].length; j++ ) {
                b[i] = b[i]+copy_matrix[i][j];
            }
        }
        return b;
    }
    
    public static void f_print_vector ( double[] vector ){
        System.out.println ("Vector: \n");// TODO code application logic here
        System.out.println ("| ");
        for ( int i=0; i<vector.length ; i++ ) {
            System.out.println ( vector[i] + " " );
        }
        System.out.println ("|\n");
    }    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //objeto para nueva linea distinto a /n
        int opcion = 0;
        double area,r,l;
        int x,y;
        Scanner n = new Scanner(System.in);
        while ( opcion != 4 ) {
            String newline = System.lineSeparator();
            System.out.printf ("----------------------------\n");
            System.out.printf ("-- Programa de Practicas. --\n");
            System.out.printf ("-- Almuno: Favio Galvis   --\n");
            System.out.printf ("-- Profesor:Yashin Rueda  --\n");
            System.out.printf ("----------------------------\n");
            System.out.printf ("Calculos con matrices.\n");
            System.out.printf ("1. Ejercicio de almacenamiento y busqueda de mayor y menor\n");
            System.out.printf ("2. Ejercicio de intercambio de columna 1 con columna N\n");
            System.out.printf ("3. Ejercicio de suma de columnas y filas en vectores\n");
            System.out.printf ("4. Salir\n");
            
            Scanner valor = new Scanner(System.in);
            opcion = valor.nextInt();
            switch (opcion) {

                case 1: {
                    //Prueba de impresion y uso de scanner

                    System.out.println ("Ingresar tamaño de la matrix a(filas), b(columnas):\n");// TODO code application logic here
                    System.out.println ("a: ");
                    x = n.nextInt();
                    System.out.println ("b: ");
                    y = n.nextInt();
                    double[][] matrix = f_read_matrix(x,y);
                    System.out.println ("Su matriz es: \n");
                    f_print_matrix( matrix );
                    double[] minor = f_search_minor(matrix);
                    double[] mayor = f_search_mayor(matrix);
                    System.out.println ("El menor es: " + minor[0] + ", Posicion ("+(minor[1]+1)+","+(minor[2]+1)+")\n" );
                    System.out.println ("El menor es: " + mayor[0] + ", Posicion ("+(mayor[1]+1)+","+(mayor[2]+1)+")\n" );
                    System.out.println(newline);

                    //n.close();
                } break;
                case 2: {
                    //Prueba de delimitadores en Scanner

                    System.out.println ("Ingresar tamaño de la matrix a(filas), b(columnas):\n");// TODO code application logic here
                    System.out.println ("a: ");
                    x = n.nextInt();
                    System.out.println ("b: ");
                    y = n.nextInt();
                    double[][] matrix = f_read_matrix(x,y);
                    System.out.println ("Su matriz es: \n");
                    f_print_matrix( matrix );
                    System.out.println ("Posterior al cambio de columnas su nueva matriz es: \n");
                    matrix = f_exchange ( matrix );
                    f_print_matrix( matrix );
                    System.out.println(newline);
                    //s.close();
                } break;
                case 3: {
                    //Prueba de operaciones con numeros y valores tipo double

                    System.out.println ("Ingresar tamaño de la matrix a(filas), b(columnas):\n");// TODO code application logic here
                    System.out.println ("a: ");
                    x = n.nextInt();
                    System.out.println ("b: ");
                    y = n.nextInt();
                    double[][] matrix = f_read_matrix(x,y);
                    System.out.println ("Su matriz es: \n");
                    f_print_matrix( matrix );
                    System.out.println ("El vector de suma de columnas es: \n");
                    double[] a = f_sum_rows( matrix );
                    f_print_vector( a );
                    System.out.println ("El vector de suma de filas es: \n");
                    double[] b = f_sum_cols( matrix );
                    f_print_vector( b );
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