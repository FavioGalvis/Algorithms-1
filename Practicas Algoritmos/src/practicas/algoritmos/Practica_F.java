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
public class Practica_F {
    /**
     * @param args the command line arguments
     * Clase para imprimir una piramide de numeros
     * Usa whiles para hacer la serie
     */
    public static void main(String[] args) {
        
        int i = 0, j = 0, n;
        Scanner read = new Scanner ( System.in );
        System.out.println ( "Digite cuantos pisos de la piramide desea dibujar:" );
        n = read.nextInt();
        
        while ( j <= n ) {
            
            while ( i < j ) {
                
                System.out.print( i + " " );
                i++;
            }
            System.out.println();
            i=0;
            j++;
        }
        
    }
}
