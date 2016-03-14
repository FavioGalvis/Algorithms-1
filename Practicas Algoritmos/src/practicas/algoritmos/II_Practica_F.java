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
public class II_Practica_F {
    
    //Vector estatico para almacenar la cadena con los valores de los meses
    static String[] calendar = {   
                                "Enero",      
                                "Febrero",
                                "Marzo",        
                                "Abril",        
                                "Mayo",          
                                "Junio",         
                                "Julio",         
                                "Agosto",       
                                "Septiembre",    
                                "Octubre",      
                                "Noviembre",     
                                "Diciembre"
                            };
    
    //Leer un vector de tamaño a.
    //      int a = tamaño del vector a leer
    //Retorna vector leido
    public static String[] f_read_vector( int a ){
        //Leer una vector
        String[] vector = new String[a];
        Scanner n = new Scanner(System.in);
        for ( int i=0; i<a ; i++ ) {
            System.out.println ("Producto "+ (i+1) +": " );
            vector[i] = n.nextLine();
        }
        return vector;
    }
    
    //Leer una matriz de tamaño AxB con etiquetas de de eje A segun
    //  II_Practica_F.calendar y con etiquetas de eje B segun vector[], en este
    //  caso los productos.
    //      int a = tamaño de las filas de la matriz a leer
    //      int b = tamaño de las columnas de la matriz a leer
    //      String vector[] = String que almacena el nombre de un producto
    //Retorna matrix leida
    public static double[][] f_read_matrix( int a, int b, String [] vector ){
        //Leer una matriz
        double[][] matrix = new double[a][b];
        Scanner n = new Scanner(System.in);
        System.out.println ("Ingrese los valores de la matriz meses(filas)* productos(columnas): \n");// TODO code application logic here
        for ( int i=0; i<a ; i++ ) {
            for ( int j=0; j<b ; j++ ) {
                System.out.println ("Mes: " + calendar[i] + " - Producto: " + vector[j] + ": ");
                matrix[i][j] = n.nextDouble();
            }
        }
        return matrix;
    }
    
    //Imprimir una matriz matrix[][] con etiquetas de de eje A segun
    //  II_Practica_F.calendar y con etiquetas de eje B segun vector[], en este
    //  caso los productos.
    //      double matrix[i][j] = matriz principal de datos de productos por mes,
    //                            donde i corresponde a el mes y j al producto    
    //      String vector[] = String que almacena el nombre de un producto
    public static void f_print_matrix ( double[][] matrix, String [] vector ){
        //Imprimir una matriz
        System.out.print ("\t");
        for ( int i=0; i<vector.length ; i++ ){
            System.out.print ("\t"+vector[i]);
        }
        System.out.print ("\n");
        for ( int i=0; i<matrix.length ; i++ ) {
            System.out.print (calendar[i] + "\t\t"+"| ");
            for ( int j=0; j<matrix[0].length; j++ ) {
                System.out.print ( matrix[i][j] + " " );
            }
            System.out.print ("|\n");
        }
    }
    
    //Imprimir una matriz matrix[][] sin etiquetas pero con indices de posicion
    //  para los productos
    //      double matrix[][0] = producto al que hace referencia como posicion j dentro
    //                    de la matriz de productos
    //      double matrix[][1] = valor almacenado correspondiente al producto y mes,
    //                    dentro de la matriz principal
    //      String vector[] = String que almacena el nombre de un producto
    public static void f_print_matrix_by_month ( double[][] matrix, String [] vector ){
        //Imprimir una matriz
        for ( int i=0; i<matrix.length ; i++ ) {
            System.out.print (calendar[i]+":\t\t");
            System.out.print ( "Producto->"+vector[(int)matrix[i][0]]+" Valor->"+matrix[i][1] );
            System.out.print ("\n");
        }
    }
    
    //Imprime un vector vector[] de tipo String con etiqueta productos.
    //      String vector[] = String que almacena el nombre de un producto
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
    
    //Imprime un vector vector[] de tipo Double con etiqueta de Productos segun
    //  vector2[] de tipo String para la impresion de los promedios anuales por
    //  cada producto.
    //      double vector[] = double que almacena el promedio de cada producto,
    //                         el indice esta sincronizado con el nombre del
    //                         producto
    //      String vector2[] = String que almacena el nombre de un producto
    //  Funcion sobrecargada (polimorfismo) para facilitar impresion de vectores
    //  de distintas especificaciones con f_print_vector
    public static void f_print_vector ( double [] vector,String [] vector2 ){
        //Imprimir una vector
        System.out.print ("Productos:\n");
        for ( int i=0; i<vector2.length ; i++ ){
            System.out.print (i+". "+vector2[i]+"-> "+vector[i]+"\n");
        }
        System.out.print ("\n");
    }
    
    //Busca el valor menor en una matriz matrix[][] y retorna el valor, y la
    // posicion i, j del valor encontrado
    //      double matrix[i][j] = matriz principal de datos de productos por mes,
    //                            donde i corresponde a el mes y j al producto
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
    
    //Busca en cada mes los rubros menos costosos de entre todos los productos
    // de una matriz matrix[][]
    //      double matrix[i][j] = matriz principal de datos de productos por mes,
    //                            donde i corresponde a el mes y j al producto
    //Retorna una matriz resultante con el producto menos costoso y el valor de 
    // ese producto cada indice i que corresponde a los meses de la matriz resultado
    public static double[][] f_search_minor_by_month ( double[][] matrix ){
        //Busqueda de valor menor
        double[][] minor = new double[matrix.length][2];
        for ( int i=0; i<matrix.length ; i++ ) {
            minor[i][1] = matrix[i][0];
            for ( int j=0; j<matrix[0].length; j++ ) {
                if ( matrix[i][j] <= minor[i][1] ) {
                    minor[i][1] = matrix[i][j];
                    minor[i][0] = j;
                }
            }
        }
        return minor;
    }

    //Busca el valor mayor en una matriz matrix[][] y retorna el valor, y la
    // posicion i, j del valor encontrado
    //      double matrix[i][j] = matriz principal de datos de productos por mes,
    //                            donde i corresponde a el mes y j al producto
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
    //      double matrix[i][j] = matriz principal de datos de productos por mes,
    //                            donde i corresponde a el mes y j al producto
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

    //Procesa los promedios anuales de una matriz matrix[][] y retorna el una
    // vector resultante con los promedios de cada prodcuto
    //      double matrix[i][j] = matriz principal de datos de productos por mes,
    //                            donde i corresponde a el mes y j al producto
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
        while ( opcion != 6 ) {
            String newline = System.lineSeparator();
            System.out.printf ("--------------------------------\n");
            System.out.printf ("-- Primer Parcial- 03/03/2016 --\n");
            System.out.printf ("-- Almuno: Favio Galvis       --\n");
            System.out.printf ("-- Profesor:Yashin Rueda      --\n");
            System.out.printf ("--------------------------------\n");
            System.out.printf ("Calculo de estadisticas de costos de productos.\n");
            System.out.printf ("1. Ingresar datos de productos\n");
            System.out.printf ("2. Mes de mayor produccion de Producto Seleccionado\n");
            System.out.printf ("3. Promedios anuales de costo de produccion\n");
            System.out.printf ("4. Mes de mayor y mes de menor costo de produccion\n");
            System.out.printf ("5. Rubro de menor costo por mes\n");
            System.out.printf ("6. Salir\n");
            Scanner valor = new Scanner(System.in);
            opcion = valor.nextInt();
            switch (opcion) {
                case 1: {
                    //Lectura de los tamaños de las matrices M y N
                    System.out.println ("Ingresar numero de productos:\n");// TODO code application logic here
                    System.out.println ("#: ");
                    y = n.nextInt();
                    System.out.println ("Ingresar el nombre de los productos:\n");// TODO code application logic here
                    vectorN = f_read_vector(y);
                    x = 12; //numero de meses a evaluar
                    matrixM = f_read_matrix(x,y,vectorN);
                    System.out.println ("Su matriz es: \n");
                    f_print_matrix( matrixM,vectorN );
                } break;
                case 2: {
                    if ( vectorN!=null ){
                        System.out.println ("Ingrese el producto a verificar: ");// TODO code application logic here
                        f_print_vector(vectorN);
                        f = n.nextInt();
                        double[] result = f_search_mayor(f,matrixM);
                        System.out.println ("Valores del producto "+vectorN[f]+": Mes->"+calendar[(int)result[1]]+" Valor->"+result[0]+"\n");
                    }else{
                        System.out.println ("No se han ingresado los productos, por favor verifique.\n");
                    }
                } break;
                case 3: {
                    System.out.println ("Promedio anual de cada producto\n");// TODO code application logic here
                    double[] result=f_search_promedio(matrixM);
                    f_print_vector(result,vectorN);
                } break;
                case 4: {
                    System.out.println ("Mes de mayor y mes de menor costo de produccion\n");// TODO code application logic here
                    double[] result=f_search_mayor(matrixM);
                    double[] result2=f_search_minor(matrixM);
                    System.out.println ("Mes de mayor costo "+calendar[(int)result[1]]+": Producto->"+vectorN[(int)result[2]]+" Valor->"+result[0]+"\n");
                    System.out.println ("Mes de mmenor costo "+calendar[(int)result2[1]]+": Producto->"+vectorN[(int)result2[2]]+" Valor->"+result2[0]+"\n");
                } break;
                case 5: {
                    System.out.println ("Rubros menos costosos por mes\n");// TODO code application logic here
                    double[][] result=f_search_minor_by_month(matrixM);
                    f_print_matrix_by_month(result,vectorN);
                } break;
            }
            System.out.println("\nPresione enter para continuar...\n");
            pauser.nextLine();
        }
    }
}