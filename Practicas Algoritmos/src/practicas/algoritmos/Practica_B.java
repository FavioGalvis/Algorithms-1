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

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author FGALVIS
 */
public class Practica_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //objeto para nueva linea distinto a /n
        Scanner pauser = new Scanner (System.in);
        int opcion = 0;
        while ( opcion != 7 ) {
        String newline = System.lineSeparator();
        System.out.printf ("----------------------------\n");
        System.out.printf ("-- Programa de Practicas. --\n");
        System.out.printf ("-- Almuno: Favio Galvis   --\n");
        System.out.printf ("-- Profesor: Juan Rua     --\n");
        System.out.printf ("----------------------------\n");
        System.out.printf ("Los siguientes programas se pueden practicar.\n");
        System.out.printf ("Ingrese el numero de la opcion que desee:\n");
        System.out.printf ("1. Calculo de Salario de un Empleado\n");
        System.out.printf ("2. (2.1 del Libro) - Diferentes algoritmos\n");
        System.out.printf ("3. (2.2 del Libro) - Operaciones basicas con numeros\n");
        System.out.printf ("4. (2.7 del Libro) - Verificar relacion aditiva de 3 numeros\n");
        System.out.printf ("5. (2.10 del Libro)- Calcular la superficie de un triangulo\n");
        System.out.printf ("6. (2.12 del Libro)- Calcular el salario semanal de un empleado\n");
        System.out.printf ("7. Salir\n");

        Scanner valor = new Scanner(System.in);
        opcion = valor.nextInt();
        switch (opcion) {
        
            case 1: {
        /*
        Se desea calcular el salario neto semanal de un trabajador (en dólares
        o en euros) en función del número de horas trabajadas y la tasa
        de impuestos:
        • las primeras 35 horas se pagan a tarifa normal,
        • las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal,
        • las tasas de impuestos son:
        a) los primeros 1.000 dólares son libres de impuestos,
        b) los siguientes 400 dólares tienen un 25 por 100 de impuestos,
        c) los restantes, un 45 por 100 de impuestos,
        • la tarifa horaria es 15 dólares.
        También se desea escribir el nombre, salario bruto, tasas y salario neto
        (este ejemplo se deja como ejercicio para el alumno).        
        */
        System.out.println ("Ingrese la Tarifa Horaria ($/h): ");
        Scanner scannum = new Scanner(System.in);
        double tarifa = scannum.nextDouble();
        System.out.println ("Ingrese el Nombre del Empleado: ");
        Scanner scanstring = new Scanner(System.in);        
        String nombre = scanstring.nextLine();
        System.out.println ("Ingrese las Horas trabajadas del empleado: ");
        int horas = scannum.nextInt();
        double impuestos = 0;
        double neto = tarifa * horas;
        if ( neto > 1000 ) {
            if ( neto > 1400 ) {
                impuestos = ( neto - 1400 ) * 0.45;
                impuestos = impuestos + ( 400 * 0.25 );
            } else {
                impuestos = ( neto - 1000 ) * 0.25;                
            }
        }
        double total = neto - impuestos;
        System.out.printf ("El valor devengado del empleado %s es:\n" , nombre );
        System.out.printf ("Horas Laboradas.............. H: %d\n" , horas );
        System.out.printf ("Neto devengado............... $: %f\n" , neto );
        System.out.printf ("Neto impuestos............... $: %f\n" , impuestos );
        System.out.printf ("TOTAL SALARIO................ $: %f\n" , total );
        System.out.println(newline);
        //n.close();
            } break;
            case 2: {
        //Prueba de delimitadores en Scanner
        /*
        2.1. Diseñar una solución para resolver cada uno de los
        siguientes problemas y tratar de refinar sus soluciones
        mediante algoritmos adecuados:
        a) Realizar una llamada telefónica desde un teléfono
        público.
        b) Cocinar una tortilla.
        c) Arreglar un pinchazo de una bicicleta.
        d) Freír un huevo.        
        */
        int algoritmo = 0;
        while ( algoritmo != 5 ) {
            System.out.println ( "2.1. Diseñar una solución para resolver cada uno de los\n" +
                                "siguientes problemas y tratar de refinar sus soluciones\n" +
                                "mediante algoritmos adecuados:\n" +
                                "   1) Realizar una llamada telefónica desde un teléfono\n" +
                                "      público.\n" +
                                "   2) Cocinar una tortilla.\n" +
                                "   3) Arreglar un pinchazo de una bicicleta.\n" +
                                "   4) Freír un huevo.\n" + 
                                "   5) Terminar.\n");
            System.out.printf ("Ingrese el numero de la opcion que desee:\n");
            Scanner scanopt = new Scanner(System.in);
            algoritmo = scanopt.nextInt();
            switch (algoritmo) {
                case 1: {
                    System.out.println ( "Lea 'Ingrese Número de teléfono al que desea marcar: ', tel\n"+
                                         "respuesta = realice f_marcar ( tel )\n"+
                                         "si ( respuesta == 1 ) entonces\n"+
                                         "  Escriba 'Numero contesto satisfactoriamente'\n"+
                                         "sino\n"+
                                         "  si (respuesta == 2)\n"+
                                         "      Escriba 'Numero está ocupado'\n"+
                                         "  Sino\n"+
                                         "      Escriba 'Numero no contesta'\n"+
                                         "  Fin_si\n"+
                                         "Fin_si\n");
                }break;
                case 2: {
                    System.out.println ( "Lea ‘Ingrese la Cantidad de tortillas que desea elaborar: ’, tortillas\n" +
                                         "Lea “Tipo de Tortillas que desea (1. Trigo, 2. Maiz): ‘, tipo\n" +
                                         "Sarten = calentar ( 180° )\n" +
                                         "Si ( tipo == Trigo ) entonces\n" +
                                         "	Tipo_harina (trigo)\n" +
                                         "Sino\n" +
                                         "	Tipo_harina (maíz)\n" +
                                         "Fin_si	\n" +
                                         "Tipo_harina = 120g* tortillas\n" +
                                         "	Leche = 60ml* tortillas\n" +
                                         "	Huevos = 1*tortillas\n" +
                                         "	Sal = 1g*tortillas\n" +
                                         "	Aceite = 5ml*tortillas\n" +
                                         "	Mescla = realice f_mesclar ( H_arina,Leche,Huevos,Sal,Aceite )\n" +
                                         "	Mientras ( tortillas < tortillas_hechas ) haga\n" +
                                         "		Porcion = Mescla/tortillas\n" +
                                         "		Mescla = Mescla - porcion\n" +
                                         "		Cocción = realice f_cocinar ( porción )\n" +
                                         "		Tortillas_hechas = tortillas_hechas + 1\n" +
                                         "	Fin_mientras\n" +
                                         "Escriba ‘Se elaboraron ‘+tortillas_hechas+’ tortillas de ‘+Tipo\n");
                }break;
                case 3: {
                    System.out.println ( "Escriba ‘Se procede a reparar el pinchazo: ’" +
                                         "Desarmado = realice f_Desarmar ( llanta )\n" +
                                         "Desarmado[Tripa] = realice f_limpiar (Desarmado[Tripa])\n" +
                                         "Desarmado[Tripa] = realice f_pegarparche (Desarmado[Tripa])\n" +
                                         "Desarmado[Tripa] = realice f_presion (Desarmado[Tripa])\n" +
                                         "Armado = realice f_armado ( Desarmado )\n" +
                                         "Llanta = Armado\n" +
                                         "Llanta = realice f_inflar ( Llanta )\n");
                }break;
                case 4: {
                    System.out.println ( "Lea ‘Ingrese la Cantidad de huevos que desea elaborar: ’, huevos\n" +
                                         "Sarten = calentar ( 180° )\n" +
                                         "	Huevos = 1*tortillas\n" +
                                         "	Sal = 1g*tortillas\n" +
                                         "	Aceite = 5ml*tortillas\n" +
                                         "	Mescla = realice f_mesclar ( Huevos,Sal,Aceite )\n" +
                                         "	Mientras ( huevos < huevos_hechos ) haga\n" +
                                         "		Porcion = Mescla/huevos\n" +
                                         "		Mescla = Mescla - porcion\n" +
                                         "		Cocción = realice f_cocinar ( porción )\n" +
                                         "		huevos_hechos = huevos_hechos + 1\n" +
                                         "	Fin_mientras\n" +
                                         "Escriba ‘Se elaboraron ‘+huevos_hechos+’ huevos revueltos'\n");
                }break;
                case 5: {
                }break;
            }
        }
            } break;
            case 3: {
                
        //Prueba de operaciones con numeros
        /*
        2.2. Escribir un algoritmo para:
        a) Sumar dos números enteros.
        b) Restar dos números enteros.
        c) Multiplicar dos números enteros.
        d) Dividir un número entero por otro.                
        */
        int option2 = 0;
        while ( option2 != 5 ) {      
            System.out.println ("Ingrese el tipo de Operacion a Realizar:\n");
            System.out.println ("1) Sumar dos números enteros.\n");
            System.out.println ("2) Restar dos números enteros.\n");
            System.out.println ("3) Multiplicar dos números enteros.\n");
            System.out.println ("4) Dividir un número entero por otro.\n");
            System.out.println ("5) Salir. ");
            Scanner scanopt2 = new Scanner(System.in);
            option2 = scanopt2.nextInt();
            double numeroA = 0;
            double numeroB = 0;
            double resultado = 0;
            if ( option2 < 5 && option2 > 0 ) {
                System.out.println ("Ingrese el primer numero:\n");
                Scanner numero1 = new Scanner(System.in);
                numeroA = numero1.nextDouble();
                System.out.println ("Ingrese el segundo numero:\n");
                numeroB = numero1.nextDouble();
                resultado = 0;
            }
            switch (option2) {
                case 1: {
                    resultado = numeroA + numeroB;
                    System.out.printf ("Resultado de la Suma: %f\n" , resultado );
                }break;
                case 2: {
                    resultado = numeroA - numeroB;
                    System.out.printf ("Resultado de la Resta: %f\n" , resultado );
                }break;
                case 3: {
                    resultado = numeroA * numeroB;
                    System.out.printf ("Resultado de la Multiplicacion: %f\n" , resultado );
                }break;
                case 4: {
                    if ( numeroB != 0 ) {
                        resultado = numeroA / numeroB;
                        System.out.printf ("Resultado de la Division: %f\n" , resultado );
                    } else {
                        System.out.printf ("Resultado de la Division es indeterminado\n");
                    }
                }break;
                case 5: {
                }break;
            }
        }
        //numeros.close();
            } break;
            case 4: {        
        //Leer numero de cualquier signo y imprimir su parte positiva y negativa
        /*
        2.7. Diseñar un algoritmo que lea tres números y descubra
        si uno de ellos es la suma de los otros dos.        
        */
        System.out.println ("Ingrese el primer numero:\n");
        Scanner numero1 = new Scanner(System.in);
        double numeroA = numero1.nextDouble();
        System.out.println ("Ingrese el segundo numero:\n");
        double numeroB = numero1.nextDouble();
        System.out.println ("Ingrese el tercer numero:\n");
        double numeroC = numero1.nextDouble();
        double resultado = 0;
        if ( numeroA == ( numeroB + numeroC ) ) {
            System.out.printf ("El primer numero es la suma del segundo y el tercero\n");
            System.out.println(newline);
        } else if ( numeroB == ( numeroA + numeroC ) ) {
            System.out.printf ("El segundo numero es la suma del primero y el tercero\n");
            System.out.println(newline);
        } else if ( numeroC == ( numeroA + numeroB ) ) {
            System.out.printf ("El tercer numero es la suma del primero y el segundo\n");
            System.out.println(newline);            
        } else {
            System.out.printf ("Los numeros no tienen relacion aditiva\n");
            System.out.println(newline);
        }
            } break;
            case 5: {
        //Leer dos numeros y determinar cual es mayor
        /*
        2.10. Escribir un algoritmo que calcule la superficie de un
        triángulo en función de la base y la altura (S = 1/2
        Base × Altura).
        */              
        System.out.println ("Ingrese el valor de la Base del triangulo:\n");
        Scanner numero1 = new Scanner(System.in);
        double numeroA = numero1.nextDouble();
        System.out.println ("Ingrese el valor de la altura del triangulo:\n");
        double numeroB = numero1.nextDouble();
        double resultado = ( numeroA * numeroB ) / 2;
        if ( numeroB == 0 ) {
            System.out.printf ("La altura del triangulo es 0 por lo tanto su superficie no existe\n");
            System.out.println(newline);
        } else if ( numeroA == 0 ) {
            System.out.printf ("La base del triangulo es 0 por lo tanto su superficie no existe\n");
            System.out.println(newline);          
        } else {
            System.out.printf ("La superficie del triangulo es: %f m2\n", resultado);
            System.out.println(newline);
        }
            } break;
            case 6: {
        //Leer la fecha de nacimiento y calcular su edad
        /*
        2.12. Escribir un algoritmo que encuentre el salario semanal
        de un trabajador, dada la tarifa horaria y el número
        de horas trabajadas diariamente.
        */
        System.out.println ("Ingrese la Tarifa Horaria ($/h): \n");
        Scanner scannum = new Scanner(System.in);
        double tarifa = scannum.nextDouble();
        System.out.println ("Ingrese el Nombre del Empleado: \n");
        Scanner scanstring = new Scanner(System.in);        
        String nombre = scanstring.nextLine();
        System.out.println ("Ingrese las Horas trabajadas diariamente por el empleado: \n");
        int horas = scannum.nextInt();
        double neto = tarifa * horas;
        double total = neto * 6;
        System.out.printf ("El valor devengado del empleado %s es:\n" , nombre );
        System.out.printf ("Horas Laboradas diarias...... H: %d\n" , horas );
        System.out.printf ("Neto devengado diario........ $: %f\n" , neto );
        System.out.printf ("Neto 6 dias / semana......... $: %f\n" , total );
        System.out.printf ("TOTAL SALARIO................ $: %f\n" , total );
        System.out.println(newline);
            } break;
            case 7: {
                System.out.printf ("Gracias por usar el programa.\n");
            }
        }
        System.out.println("\nPresione enter para continuar...\n");
        pauser.nextLine();
        
        }
        
    }
    
}
