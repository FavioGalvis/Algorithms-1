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
public class Practica_G {
    /**
     * @param args the command line arguments
     * Clase determinar los resultados de una votacion
     * Usa whiles para hacer la serie
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int j = 0, i = 0, n = 0, pedro = 0, pablo = 0, blanco = 0;
        Scanner read = new Scanner ( System.in );
        
        do{

            do {
                System.out.println ( "Registre su numero de cedula: " );
                n = read.nextInt();
                if ( n <= 0) { 
                    System.out.println ( "Cedula invalida, reintente." );
                }
            } while ( n <= 0);

            System.out.println ( "Registre su voto: Pedro=1, Pablo=2, Voto en Blanco=3" );
            i = read.nextInt();

            if ( i == 1) {
                pedro = pedro + 1;
            }
            else {
                if ( i == 2 ) {
                    pablo = pablo + 1;
                }
                else {
                    blanco = blanco + 1;
                }
            }

            System.out.println ( "Voto registrado satisfactoriamente" );
            System.out.println ( "----------------------------------" );
            System.out.println ( "desea registrar un nuevo votante?: Si(1), No(2)" );
            j = read.nextInt();

        } while ( j == 1);
        
        if ( pedro > pablo ) {
            System.out.println ( "Pedro gano las elecciones con " + pedro + " votos." );
        }
        else {
            if ( pablo > pedro ) {
                System.out.println ( "Pablo gano las elecciones con " + pablo + " votos." );
            }
            else {
                System.out.println ( "Las elecciones empataron a " + pablo + " votos." );
            }
        }
        
        System.out.println ( "Fueron " + blanco + " votos en blanco." );
        System.out.println ( "Con un total de " + (pedro+pablo+blanco) + " votantes." );

        Scanner pauser = new Scanner (System.in);
        System.out.println("\nPresione enter para continuar...\n");
        pauser.nextLine();
        
    }
    
    
}
