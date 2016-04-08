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
 * Programa de desarrollo - Segundo Corte
 * Algoritmos y Programacion 2 - Ing. Lordes de Avila
 * Alumno: Favio Arturo Galvis - Cod. 201521268405
 * @date 07/04/2016
 * @author 201521268405
 */
public class II_Practica_G {
    
    //Vector estatico para almacenar la cadena con los valores de las zonas
    static String[] calendar = {   
                                "Zona 1",      
                                "Zona 2",
                                "Zona 3",        
                                "Zona 4",        
                                "Zona 5",          
                                "Zona 6",         
                                "Zona 7",         
                                "Zona 8",       
                                "Zona 9",    
                                "Zona 10",
                            };
    
    //Leer un vector de tamaño a.
    //      int a = tamaño del vector a leer
    //Retorna vector leido
    public static String[] f_read_vector( int a ){
        //Leer una vector
        String[] vector = new String[a];
        Scanner n = new Scanner(System.in);
        for ( int i=0; i<a ; i++ ) {
            System.out.println ("Campo "+ (i+1) +": " );
            vector[i] = n.nextLine();
        }
        return vector;
    }
    
    //Leer una matriz de tamaño AxB con etiquetas de de eje A segun
    //  II_Practica_F.calendar y con etiquetas de eje B segun vector[], en este
    //  caso los campos.
    //      int a = tamaño de las filas de la matriz a leer
    //      int b = tamaño de las columnas de la matriz a leer
    //      String vector[] = String que almacena el nombre de un campo
    //Retorna matrix leida
    public static double[][] f_read_matrix( int a, int b, String [] vector ){
        //Leer una matriz
        double[][] matrix = new double[a][b];
        Scanner n = new Scanner(System.in);
        System.out.println ("Ingrese los valores de la matriz Campos(filas)* Zonas(columnas): \n");// TODO code application logic here
        for ( int i=0; i<a ; i++ ) {
            for ( int j=0; j<b ; j++ ) {
                System.out.println ("Campo: " + vector[i] + " - Z: " + calendar[j] + ": ");
                matrix[i][j] = n.nextDouble();
            }
        }
        return matrix;
    }
    
    //Imprimir una matriz matrix[][] con etiquetas de de eje A segun
    //  II_Practica_F.calendar y con etiquetas de eje B segun vector[], en este
    //  caso los campos.
    //      double matrix[i][j] = matriz principal de datos
    //      String vector[] = String que almacena el nombre de un campo
    public static void f_print_matrix ( double[][] matrix, String [] vector ){
        //Imprimir una matriz
        System.out.print ("\t");
        for ( int i=0; i<matrix[0].length ; i++ ){
            System.out.print ("\t"+calendar[i]);
        }
        System.out.print ("\n");
        for ( int i=0; i<matrix.length ; i++ ) {
            System.out.print (vector[i] + "\t\t"+"| ");
            for ( int j=0; j<matrix[0].length; j++ ) {
                System.out.print ( matrix[i][j] + " " );
            }
            System.out.print ("|\n");
        }
    }
    //Imprime un vector vector[] de tipo String con etiqueta campos.
    //      String vector[] = String que almacena el nombre de un campo
    //  Funcion sobrecargada (polimorfismo) para facilitar impresion de vectores
    //  de distintas especificaciones con f_print_vector
    public static void f_print_vector ( String [] vector ){
        //Imprimir una vector
        System.out.print ("Productos:\n");
        for ( int i=0; i<vector.length ; i++ ){
            System.out.print (i+". "+vector[i]+"\n");
        }
        System.out.print ("\n");
    }
    
    //Imprime un vector vector[] de tipo Double con etiqueta de Campos segun
    //  vector2[] de tipo String para la impresion de vectores.
    //      double vector[] = double que almacena el promedio,
    //                         el indice esta sincronizado con el nombre del
    //                         campo
    //      String vector2[] = String que almacena el nombre de un campo
    //  Funcion sobrecargada (polimorfismo) para facilitar impresion de vectores
    //  de distintas especificaciones con f_print_vector
    public static void f_print_vector ( double [] vector,String [] vector2 ){
        //Imprimir una vector
        System.out.print ("Promedios:\n");
        for ( int i=0; i<vector2.length ; i++ ){
            System.out.print (i+". "+vector2[i]+"-> "+vector[i]+"\n");
        }
        System.out.print ("\n");
    }
    
    //Busca el valor menor en una matriz matrix[][] y retorna el valor, y la
    // posicion i, j del valor encontrado
    //      double matrix[i][j] = matriz principal de datos
    //Retorna vector resultante encontrado
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
    //Busca el valor mayor en una matriz matrix[][] y retorna el valor, y la
    // posicion i, j del valor encontrado
    //      double matrix[i][j] = matriz principal de datos,
    //                            donde i corresponde a el campo y j a la zona
    //Funcion sobrecargada para la busqueda general o busqueda especifica, segun
    // parametro de busqueda.
    //Retorna vector resultante encontrado
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

    //Busca el valor mayor en una matriz matrix[][] y retorna el valor, y la
    // posicion i, j del valor encontrado
    //      int a = valor a buscar dentro de la matriz y limite de la busqueda
    //      double matrix[i][j] = matriz principal de datos,
    //                            donde i corresponde a el campo y j a la zona
    //Funcion sobrecargada para la busqueda general o busqueda especifica, segun
    // parametro de busqueda.
    //Retorna vector resultante encontrado
    public static double[] f_search_mayor ( int a, double[][] matrix ){
        //Busqueda de valor mayor de un producto
        double[] mayor= new double[3];
        mayor[0] = matrix[0][a];
        for ( int i=0; i<matrix.length ; i++ ) {
                if ( matrix[i][a] >= mayor[0] ) {
                    mayor[0] = matrix[i][a];
                    mayor[1] = i;
                    mayor[2] = a;
                }
        }
        return mayor;
    }

    //Procesa los promedios de una matriz matrix[][] y retorna el una
    // vector resultante con los promedios de cada zona
    //      double matrix[i][j] = matriz principal de datos,
    //                            donde i corresponde a el campo y j a la zona
    //Retorna vector resultante con los promedios   
    public static double[] f_search_promedio ( double[][] matrix ){
        //Busqueda de valor promedio de los productos
        double[] mayor= new double[matrix[0].length];
        for ( int j=0; j<matrix[0].length ; j++ ) {
            for ( int i=0; i<matrix.length; i++ ) {
                mayor[j]=mayor[j]+matrix[i][j];
            }
            mayor[j]=(mayor[j])/matrix.length;
        }
        return mayor;
    }
    //Procesa los promedios de una matriz matrix[][] y retorna el una
    // vector resultante con los promedios de cada campo
    //      double matrix[i][j] = matriz principal de datos,
    //                            donde i corresponde a el campo y j a la zona
    //Retorna vector resultante con los promedios   
    public static double[] f_search_promedio_campo ( double[][] matrix ){
        //Busqueda de valor promedio de los productos
        double[] mayor= new double[matrix.length];
        for ( int j=0; j<matrix.length ; j++ ) {
            for ( int i=0; i<matrix[0].length; i++ ) {
                mayor[j]=mayor[j]+matrix[j][i];
            }
            mayor[j]=(mayor[j])/matrix.length;
        }
        return mayor;
    }
    //Procesa los promedios totales de una matriz matrix[][] y retorna
    //      double matrix[i][j] = matriz principal de datos,
    //                            donde i corresponde a el campo y j a la zona
    //Retorna valor resultante con los promedios   
    public static double f_search_promedio_total ( double[][] matrix ){
        //Busqueda de valor promedio de los productos
        double[] mayor= new double[matrix.length];
        double total=0;
        for ( int j=0; j<matrix.length ; j++ ) {
            for ( int i=0; i<matrix[0].length; i++ ) {
                mayor[j]=mayor[j]+matrix[j][i];
            }
            mayor[j]=(mayor[j])/matrix.length;
        }
        for ( int j=0; j<mayor.length ; j++ ) {
            total=total+mayor[j];
        }
        total = total/mayor.length;
        return total;
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
        double[][] matrixM = null;
        Scanner n = new Scanner(System.in);
        Scanner pauser = new Scanner (System.in);
        while ( opcion != 7 ) {
            String newline = System.lineSeparator();
            System.out.printf ("--------------------------------\n");
            System.out.printf ("-- Matrices - 07/04/2016      --\n");
            System.out.printf ("-- Almuno: Favio Galvis       --\n");
            System.out.printf ("-- Profesor: Lordes de Avila  --\n");
            System.out.printf ("--------------------------------\n");
            System.out.printf ("Calculo de estadisticas de lluvias por zonas y campos.\n");
            System.out.printf ("1. *Ingresar campos a evaluar y numero de subdiviciones en zonas\n");
            System.out.printf ("2. *Promedios de lluvia de cada campo\n");
            System.out.printf ("3. *Promedios de lluvia de cada zona\n");
            System.out.printf ("4. *Campo de mayor y menor lluvia en una zona especifica\n");
            System.out.printf ("5. *Promedio general de lluvias\n");
            System.out.printf ("6. *Mostrar mi matriz\n");
            System.out.printf ("7. *Salir\n");
            Scanner valor = new Scanner(System.in);
            opcion = valor.nextInt();
            switch (opcion) {
                case 1: {
                    //Lectura de los tamaños de las matrices M y N
                    System.out.println ("Ingresar numero de campos:\n");// TODO code application logic here
                    System.out.println ("#: ");
                    x = n.nextInt();
                    System.out.println ("Ingresar el nombre de los campos:\n");// TODO code application logic here
                    vectorN = f_read_vector(x);
                    System.out.println ("Ingresar numero de zonas a subdividir:\n");
                    System.out.println ("#: ");
                    y = n.nextInt();
                    matrixM = f_read_matrix(x,y,vectorN);
                    System.out.println ("Su matriz de campos es: \n");
                    f_print_matrix( matrixM,vectorN );
                } break;
                case 2: {
                    double[] result=f_search_promedio_campo(matrixM);
                    f_print_vector(result,vectorN);
                } break;
                case 3: {
                    System.out.println ("Promedios de lluvia de cada campo\n");// TODO code application logic here
                    double[] result=f_search_promedio(matrixM);
                    f_print_vector(result,vectorN);
                } break;
                case 4: {
                    System.out.println ("Campo de mayor y menor lluvia en una zona especifica\n");// TODO code application logic here
                    double[] result=f_search_mayor(matrixM);
                    double[] result2=f_search_minor(matrixM);
                    System.out.println ("Campo de mayor lluvia, Campo: "+vectorN[(int)result[1]]+": Z->"+calendar[(int)result[2]]+" Valor->"+result[0]+"\n");
                    System.out.println ("Campo de menor lluvia, Campo: "+vectorN[(int)result2[1]]+": Z->"+calendar[(int)result2[2]]+" Valor->"+result2[0]+"\n");
                } break;
                case 5: {
                    System.out.println ("Promedios de lluvia de cada campo\n");// TODO code application logic here
                    double result=f_search_promedio_total(matrixM);
                    System.out.println ("El promedio general de lluvias es: "+result+"\n");
                } break;
                case 6: {
                    System.out.println ("Su matriz de campos es: \n");
                    f_print_matrix( matrixM,vectorN );
                } break;
            }
            System.out.println("\nPresione enter para continuar...\n");
            pauser.nextLine();
        }
    }
}