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

/**
 *
 * @author 201521268405
 */
public class parctica_D {
    
    /**
     * @param args the command line arguments
     * Clase para identificar si un numero es primo
     * Evalua inicialmente desde el 2 hasta el numero a evaluar -1
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i = 2, num;
        boolean flag = false;
        Scanner read = new Scanner ( System.in );
        
        System.out.println ( "Digite el numero a evaluar: " );
        num = read.nextInt();
        
        while ( i < num && !flag ) {
            if ( num%i == 0 ) {
                flag = true;
            }
            else {
                i++;
            }
        }
        
        if ( !flag ) {
            System.out.println ( "El numero "+ num + " es Primo." );
        }
        else {
            System.out.println ( "El numero "+ num + " no es Primo." );
        }
        
        Scanner pauser = new Scanner (System.in);
        System.out.println("\nPresione enter para continuar...\n");
        pauser.nextLine();
        primos();   //Llama el siguiente metodo para identificar varios numeros
        
    }
    
    /**
     * Clase para identificar los numeros primos de un conjunto de valores
     * Evalua inicialmente desde el numero -1 hasta el 2
     */
    public static void primos() {
        // TODO code application logic here
        
        int i = 1, n = 0, num, j = 0;
        boolean flag = false;
        String numprimos = null, numnoprimos = null; 
        Scanner read = new Scanner ( System.in );
        
        System.out.println ( "Digite cuantos numeros desea evaluar: " );
        n = read.nextInt();
        
        while ( i <= n ) {
            
            System.out.println ( "Digite el numero " + i + " a evaluar: " );
            num = read.nextInt();
            j = num - 1;
            
            while ( j > 1 && !flag ) {
                if ( num%j == 0 ) {
                    flag = true;
                }
                else {
                    j--;
                }
            }

            if ( !flag ) {
                if ( numprimos == null ) {
                    //System.out.println ( "El numero "+ num + " es Primo.\n" );
                    numprimos = String.valueOf(num);
                }
                else {
                    //System.out.println ( "El numero "+ num + " es Primo.\n" );
                    numprimos = numprimos + ", " + num;    
                }
                
            }
            else {
                if ( numnoprimos == null ) {
                    //System.out.println ( "El numero "+ num + " no es Primo.\n" );
                    numnoprimos = String.valueOf(num);
                }
                else {
                    //System.out.println ( "El numero "+ num + " no es Primo.\n" );
                    numnoprimos = numnoprimos + ", " + num;    
                }
            }
            
            flag = false;
            i++;
            
        }
            
            System.out.println ( "Los siguientes numeros son primos: " + numprimos + "\n" );
            System.out.println ( "Los siguientes numeros no son primos: " + numnoprimos + "\n" );
            Scanner pauser = new Scanner (System.in);
            System.out.println("\nPresione enter para continuar...\n");
            pauser.nextLine();
        
    }
    
}
