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

public class Practica_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //objeto para nueva linea distinto a /n
        int opcion = 0;
        while ( opcion != 8 ) {
        String newline = System.lineSeparator();
        System.out.printf ("----------------------------\n");
        System.out.printf ("-- Programa de Practicas. --\n");
        System.out.printf ("-- Almuno: Favio Galvis   --\n");
        System.out.printf ("-- Profesor: Juan Rua     --\n");
        System.out.printf ("----------------------------\n");
        System.out.printf ("Los siguientes programas se pueden practicar.\n");
        System.out.printf ("Ingrese el numero de la opcion que desee:\n");
        System.out.printf ("1. Prueba de impresion y uso de scanner\n");
        System.out.printf ("2. Prueba de delimitadores en Scanner\n");
        System.out.printf ("3. Prueba de operaciones con numeros y valores tipo double\n");
        System.out.printf ("4. Leer numero de cualquier signo y imprimir su parte positiva y negativa\n");
        System.out.printf ("5. Leer dos numero y determinar cual es mayor\n");
        System.out.printf ("6. Leer la fecha de nacimiento y calcular su edad\n");
        System.out.printf ("7. Leer un numero y verificar si es par\n");
        System.out.printf ("8. Salir\n");

        Scanner valor = new Scanner(System.in);
        opcion = valor.nextInt();
        switch (opcion) {
        
            case 1: {
        //Prueba de impresion y uso de scanner
        
        System.out.println ("Ingrese el numero a hallar el cubo: ");// TODO code application logic here
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();
        int y = x*x*x;
        System.out.println ("El cubo es: " + y );
        System.out.println(newline);
        
        //n.close();
            } break;
            case 2: {
        //Prueba de delimitadores en Scanner
        
        String input = "1 fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println(s.nextInt());
        System.out.println(s.nextInt());
        System.out.println(s.next());
        System.out.println(s.next());
        System.out.println(newline);
        //s.close();
            } break;
            case 3: {
        //Prueba de operaciones con numeros y valores tipo double
        
        double a,b,c;
        double d;
        Scanner numeros = new Scanner(System.in);
        System.out.println ("Ingrease primer numero entero: ");
        a = numeros.nextInt();
        System.out.println ("Ingrease segundo numero entero: ");
        b = numeros.nextInt();
        c = a + b;
        System.out.println ("La suma es: " + c );
        //System.out.printf ("La suma es: %d" , c );
        c = a - b;
        System.out.println ("La resta de a-b es: " + c );
        c = b - c;
        System.out.println ("La resta de b-a es: " + c );
        c = a * b;
        System.out.println ("La multiplicacion es: " + c );
        if (a!=0){
            d = b/a;
            System.out.printf ("La division b/a es: %4.4f" , d );
            System.out.println(newline);
        } else {
            System.out.println ("La division b/a es indeterminada");
        }
        if (b!=0){
            d = a/b;
            System.out.printf ("La division a/b es: %4.4f" , d );
            System.out.println(newline);
        } else {
            System.out.println ("La division a/b es indeterminada");
        }
        
        //numeros.close();
            } break;
            case 4: {        
        //Leer numero de cualquier signo y imprimir su parte positiva y negativa
        System.out.println ("Ingrese el numero a mostrar sus valores positivos y negativos: ");// TODO code application logic here
        Scanner num = new Scanner(System.in);
        double var = num.nextInt();
        double abs = var * -1;
        if ( var < 0) {
            System.out.printf ("Valor negativo es: %4.4f" , var );
            System.out.println(newline);
            System.out.printf ("Valor positivo es: %4.4f" , abs );
            System.out.println(newline);
        } else {
            System.out.printf ("Valor positivo es: %4.4f" , var );
            System.out.println(newline);
            System.out.printf ("Valor negativo es: %4.4f" , abs );
            System.out.println(newline);
        }
        
            } break;
            case 5: {
        //Leer dos numeros y determinar cual es mayor
        System.out.println ("Ingrese el primer numero: ");// TODO code application logic here
        Scanner numA = new Scanner(System.in);
        double varA = numA.nextDouble();
        System.out.println ("Ingrese el segundo numero: ");// TODO code application logic here
        Scanner numB = new Scanner(System.in);
        double varB = numB.nextDouble();
        if ( varA > varB) {
            System.out.printf ("El primer numero (%4.4f) es mayor que el segundo numero(%4.4f)" , varA, varB );
            System.out.println(newline);
        } else if ( varA == varB) {
            System.out.printf ("Valor primer numero (%4.4f) es igual al segundo numero (%4.4f)" , varA, varB );
            System.out.println(newline);
        } else {
            System.out.printf ("El primer numero (%4.4f) es menor que el segundo numero(%4.4f)" , varA, varB );
            System.out.println(newline);
        }
        
            } break;
            case 6: {
        //Leer la fecha de nacimiento y calcular su edad
        
        System.out.println ("Ingrese su fecha de nacimiento (aaaa),(mm),(dd): ");// TODO code application logic here
        Scanner Sanno = new Scanner(System.in);
        double anno = Sanno.nextDouble();
        Scanner Smes = new Scanner(System.in);
        double mes = Smes.nextDouble();
        Scanner Sdia = new Scanner(System.in);
        double dia = Sdia.nextDouble();
        int annoactual = Calendar.getInstance().get(Calendar.YEAR);
        int mesactual = Calendar.getInstance().get(Calendar.MONTH);
        int diaactual = Calendar.getInstance().get(Calendar.DATE);
        mesactual = mesactual + 1;
        System.out.printf ("Fecha actual (%d)/(%d)/(%d)\n" , annoactual, mesactual, diaactual );
        double edadannos = 0, edadmeses = 0, edaddias = 0;
        if ( anno < annoactual ) {
            if ( mes <= mesactual ) {
                edadannos = ( annoactual - anno );
                edadmeses = mesactual - mes;                
            } else {
                edadannos = annoactual - anno - 1 ;
                edadmeses = 12 - ( mes - mesactual );
            }
            if ( dia < diaactual ) {
                edaddias = diaactual - dia;
            } else {
                edaddias = dia - diaactual;
            }
        }
        System.out.printf ("Su edad es: %4.0f años, %4.0f meses, %4.0f dias" , edadannos, edadmeses, edaddias );
        System.out.println(newline);
        
        double edadenannos = edadannos + ( edadmeses / 12 ) + ( edaddias / 365 );
        double edadenmeses = ( edadannos * 12 ) + edadmeses + ( edaddias / 30 );
        double edadendias = ( edadannos * 365 ) + ( edadmeses * 30 ) + edaddias;
        
        System.out.printf ( "Su edad en años es: %4.2f años" , edadenannos );
        System.out.println(newline);
        System.out.printf ( "Su edad en meses es: %4.2f meses" , edadenmeses );
        System.out.println(newline);
        System.out.printf ( "Su edad en dias es: %4.0f dias" , edadendias );
        System.out.println(newline);
        
            } break;
            case 7: {
        //Leer un numero y verificar si es par
        System.out.println ("Ingrese el numero a verificar: ");// TODO code application logic here
        Scanner numeroA = new Scanner(System.in);
        double variableA = numeroA.nextDouble();
        double modulo;
        modulo = variableA % 2;
        if ( modulo == 0 ) {
            System.out.printf ("El numero (%4f) es PAR" , variableA );
            System.out.println(newline);
        } else {
            System.out.printf ("El numero (%4f) es IMPAR" , variableA );
            System.out.println(newline);
        }
            } break;
            case 8: {
                System.out.printf ("Gracias por usar el programa.\n");
            }
        }
        Scanner pauser = new Scanner (System.in);
        System.out.println("\nPresione enter para continuar...\n");
        pauser.nextLine();
        
        }
        
    }
    
}
