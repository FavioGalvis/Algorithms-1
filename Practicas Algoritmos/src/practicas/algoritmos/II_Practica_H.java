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
public class II_Practica_H {
 
    //Leer una matriz de tamaño AxB con etiquetas de de eje A segun
    //  II_Practica_F.calendar y con etiquetas de eje B.
    //      int a = tamaño de las filas de la matriz a leer
    //      int b = tamaño de las columnas de la matriz a leer
    //Retorna matrix leida
    public static double[][] f_read_matrix( int a, int b){
        //Leer una matriz
        double[][] matrix = new double[a][b];
        Scanner n = new Scanner(System.in);
        System.out.println ("Ingrese los valores de la matriz (filas)* (columnas): \n");// TODO code application logic here
        for ( int i=0; i<a ; i++ ) {
            for ( int j=0; j<b ; j++ ) {
                System.out.println ("Fila: " + i + " - columna: " + j + ": ");
                matrix[i][j] = n.nextDouble();
            }
        }
        return matrix;
    }
    
    //Imprimir una matriz matrix[][] con etiquetas de de eje A segun
    //  II_Practica_F.calendar y con etiquetas de eje B
    //      double matrix[i][j] = matriz principal de datos
    public static void f_print_matrix ( double[][] matrix){
        //Imprimir una matriz
        System.out.print ("\n");
        for ( int i=0; i<matrix.length ; i++ ) {
            System.out.print ("| ");
            for ( int j=0; j<matrix[0].length; j++ ) {
                System.out.print ( matrix[i][j] + " " );
            }
            System.out.print ("|\n");
        }
    }
    //Suma los valores de 2 matrices
    //Retorna matriz resultante encontrado
    public static double[][] f_sum_matrix ( double[][] matrixA, double[][] matrixB ){
        //Busqueda de valor menor
        double[][] result = new double[matrixA.length][matrixA[0].length];
        for ( int i=0; i<matrixA.length ; i++ ) {
            for ( int j=0; j<matrixA[0].length; j++ ) {
                result[i][j]=matrixA[i][j]+matrixB[i][j];
            }
        }
        return result;
    }
    //Suma los valores de 2 matrices
    //Retorna matriz resultante encontrado
    public static double[][] f_mul_matrix ( double[][] matrixA, double[][] matrixB ){
        //Busqueda de valor menor
        double[][] result = new double[matrixA.length][matrixB[0].length];
        double sum = 0;
        for ( int i = 0 ; i < matrixA.length ; i++ )
         {
            for ( int j = 0 ; j < matrixB[0].length ; j++ )
            {   
               for ( int k = 0 ; k < matrixB.length ; k++ )
               {
                  sum = sum + matrixA[i][k]*matrixB[k][j];
               }
 
               result[i][j] = sum;
               sum = 0;
            }
         }
        return result;
    }
    /**
     * Programa Principal
     */
    public static void main(String[] args) {
        //Programa principal de menu de opciones
        int opcion = 0;
        int f;
        int x,y;
        String[] vectorN = null;
        double[][] matrixA = null;
        double[][] matrixB = null;
        double[][] result = null;
        Scanner n = new Scanner(System.in);
        Scanner pauser = new Scanner (System.in);
        while ( opcion != 4 ) {
            String newline = System.lineSeparator();
            System.out.printf ("--------------------------------\n");
            System.out.printf ("-- Primer Parcial- 03/03/2016 --\n");
            System.out.printf ("-- Almuno: Favio Galvis       --\n");
            System.out.printf ("-- Profesor:Yashin Rueda      --\n");
            System.out.printf ("--------------------------------\n");
            System.out.printf ("Calculo de estadisticas de costos de productos.\n");
            System.out.printf ("1. Ingresar datos de matrices\n");
            System.out.printf ("2. Suma de Matrices\n");
            System.out.printf ("3. Multiplicacion de Matrices\n");
            System.out.printf ("4. Salir\n");
            Scanner valor = new Scanner(System.in);
            opcion = valor.nextInt();
            switch (opcion) {
                case 1: {
                    //Lectura de los tamaños de las matrices M y N
                    System.out.println ("Ingresar tamaño de matriz A:\n");// TODO code application logic here
                    System.out.println ("Filas: ");
                    x = n.nextInt();
                    System.out.println ("Ingresar tamaño de matriz A:\n");// TODO code application logic here
                    System.out.println ("Columnas: ");
                    y = n.nextInt();
                    matrixA = f_read_matrix(x,y);
                    System.out.println ("Su matriz A es: \n");
                    f_print_matrix( matrixA );
                    //Lectura de los tamaños de las matrices M y N
                    System.out.println ("Ingresar tamaño de matriz B:\n");// TODO code application logic here
                    System.out.println ("Filas: ");
                    x = n.nextInt();
                    System.out.println ("Ingresar tamaño de matriz B:\n");// TODO code application logic here
                    System.out.println ("Columnas: ");
                    y = n.nextInt();
                    matrixB = f_read_matrix(x,y);
                    System.out.println ("Su matriz B es: \n");
                    f_print_matrix( matrixB );
                } break;
                case 2: {
                    if ( matrixA.length==matrixB.length && matrixA[0].length==matrixB[0].length ){
                        result=f_sum_matrix(matrixA,matrixB);
                        System.out.println ("Su matriz resultante de la suma es: \n");
                        f_print_matrix( result );
                    }else{
                        System.out.println ("No se pueden sumar las matrices, no tienen el mismo tamaño.\n");
                    }
                } break;
                case 3: {
                        result=f_mul_matrix(matrixA,matrixB);
                        System.out.println ("Su matriz resultante de la suma es: \n");
                        f_print_matrix( result );
                } break;
            }
            System.out.println("\nPresione enter para continuar...\n");
            pauser.nextLine();
        }
    }
}